package SpringAssignment.DrawingApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         
         MS_Paint draw = (MS_Paint) context.getBean("PaintBean");
         
         System.out.println(draw);
    }
}
