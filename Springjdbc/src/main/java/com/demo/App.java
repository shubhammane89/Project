package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext contex = new ClassPathXmlApplicationContext("bean.xml");
     StudentDao sd =contex.getBean(StudentDao.class);
      
     Student s = new Student();
     s.setSname("Monika ");
     s.setScity("Pune");
     s.setSpercentage(41.32);
     System.out.println(sd.insertStudent(s));
    }
}
