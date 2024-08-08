/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.springcore2.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Maulik Parmar
 */
public class Springcore2 {

    public static void main(String[] args) {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("M:\\SpringLearning\\springcore2\\src\\main\\java\\com\\springcore2\\springcore2\\config.xml");
        Student student1=(Student)context.getBean("student1");
        System.out.println(student1);
    }
}
