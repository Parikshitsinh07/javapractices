package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student)
	{
		String query="insert into student(id, name, city) values(?, ?, ?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		//updating data
		String query="update student set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return r;
	}

	@Override
	public int delete(int studentId) {
		//delete Operation
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
	}

	@Override
	public Student getStudent(int studentId) {
		//select single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=(RowMapper<Student>) new RaoMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		//Select all students
		String query="select * from student";
		RowMapper<Student> rowMapper=(RowMapper<Student>) new RaoMapperImpl();
		List<Student> students=this.jdbcTemplate.query(query, rowMapper);
		return students;
	}
}
