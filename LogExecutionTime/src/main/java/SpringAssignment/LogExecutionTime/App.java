package SpringAssignment.LogExecutionTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
		public static void main( String[] args )
        {
         
        	
			ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
            
            Triangle obj = context.getBean(Triangle.class);
            
            obj.perimeter();
             
            ((ConfigurableApplicationContext) context).close();
//            System.out.println("Perimeter of the triangle: " + obj.perimeter());
            
//            System.out.println("Area of the triangle: " + obj.area());
            

            
            
    }
}