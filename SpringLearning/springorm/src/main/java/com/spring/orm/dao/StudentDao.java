package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	

	//insert student
	@Transactional
	public int insert(Student student)
	{
		int i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	//get the single data(object)
	public Student getStudent(int studentId)
	{
		Student student=this.hibernateTemplate.load(Student.class, studentId);
		return student; 
	}
	
	//get all student
	public List<Student> getAllStudent()
	{
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//for delte
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	@Transactional
	//updating data
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}



	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
