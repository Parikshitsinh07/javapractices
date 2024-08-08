package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
      
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       boolean go=true;
       while(go) {
    	   System.out.println("PRESS 1 for Add Student");
           System.out.println("PRESS 2 for display all students");
           System.out.println("PRESS 3 for get details of single student");
           System.out.println("PRESS 4 for delete student");
           System.out.println("PRESS 5 for update student");
           System.out.println("PRESS 6 for exit");
           
           try {
        	   int input=Integer.parseInt(br.readLine());
        	   switch(input)
        	   {
        	   case 1:
        		   System.out.print("Enter student id:");
        		   int sId=Integer.parseInt(br.readLine());
        		   System.out.print("Enter student Name:");
        		   String sName=br.readLine();
        		   System.out.print("Enter student City:");
        		   String sCity=br.readLine();
        		   
        		   Student s=new Student();
        		   s.setStudentId(sId);
        		   s.setStudentName(sName);
        		   s.setStudentCity(sCity);
        		   int r=studentDao.insert(s);
        		   System.out.println("Inserted:"+r);
        		   System.out.println("--------------------->");
        		   System.out.println();
        		   break;
        		   
        	   case 2:
        		   List<Student> st=studentDao.getAllStudent();
        		   for(Student sts:st)
        		   {
        			   System.out.println("Name:"+sts.getStudentName());
        			   System.out.println("ID:"+sts.getStudentId());
        			   System.out.println("City:"+sts.getStudentCity());
        			   System.out.println();
        		   }
        		   break;
        	   case 3:
        		   System.out.print("Enter student id:");
        		   int stId=Integer.parseInt(br.readLine());
        		   Student student=studentDao.getStudent(stId);
        		   System.out.println("Name:"+student.getStudentName());
    			   System.out.println("Name:"+student.getStudentId());
    			   System.out.println("Name:"+student.getStudentCity());
    			   System.out.println();
        		   
        		   break;
        	   case 4:
        		   System.out.print("Enter student id:");
        		   int stdId=Integer.parseInt(br.readLine());
        		   studentDao.deleteStudent(stdId);
        		   System.out.println("Deleted");
        		   break;
        	   case 5:
        		   break;
        	   case 6:
        		   go=false;
        		   break;

        	   }
        	   
        	   
           }
           catch(Exception e)
           {
        	   System.out.println("Invalid input try with another one");
        	   System.out.println(e.getMessage());
           }
       }
       System.out.println("See You soon");
      
    }
}
