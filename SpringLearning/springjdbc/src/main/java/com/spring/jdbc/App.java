package com.spring.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	//1st way
       /*ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
       
       //Insert query
       String query="insert into student(id, name, city) values(?, ?, ?)";
       
       //fire query
       int result=template.update(query, 102, "Radhey", "Ahmedabad");
       System.out.println("number of recored inserted:"+result);*/
    	
    	//2nd way
    	//ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	StudentDao sdo=context.getBean("studentDao",StudentDao.class);
    	
    	
       Student student=new Student();
       student.setId(106);
       student.setName("Yogesh");
       student.setCity("Surat");
       
       int result=sdo.insert(student);
       System.out.println("Added:"+result);
    	
    	
    	//update
    	/*Student student=new Student();
    	student.setId(101);
    	student.setName("Divya");
    	student.setCity("Ahmedabad");
    	int result =sdo.change(student);
    	System.out.println("Changed:"+result);*/
    	
    	//delete
    	/*Scanner sc=new Scanner(System.in);
    	System.out.print("Enter student id to delete:");
    	int studentid=sc.nextInt();
    	int result=sdo.delete(studentid);
    	System.out.println("deleted:"+result);*/
    	
    	/* select only one object
    	Student student=sdo.getStudent(103);
    	System.out.println(student); */
    	
    	//select multiple object
    	List<Student> students=sdo.getAllStudents();
    	System.out.println(students);
    }
}
