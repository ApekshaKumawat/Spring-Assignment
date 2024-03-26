package SpringAssignment.LogExecutionTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
        public static void main( String[] args )
        {
         
            ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
            
            Triangle obj = context.getBean(Triangle.class);
            
            System.out.println(obj);
            
            obj.perimeter();
            obj.area();
                
    }
}
