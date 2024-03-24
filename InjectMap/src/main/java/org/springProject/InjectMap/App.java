package org.springProject.InjectMap;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Session obj = (Session) context.getBean("training1");
        
        System.out.println(obj);
        
        
        
        
        
    }
}
