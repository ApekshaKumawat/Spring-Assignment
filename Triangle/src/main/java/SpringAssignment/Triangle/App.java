package SpringAssignment.Triangle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	private Triangle triangle;
	@Autowired
	public App(Triangle triangle) {
		this.triangle=triangle;
	}
    public static void main( String[] args )
    {
     
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        
        Triangle app = context.getBean(Triangle.class);
        
        System.out.println("Perimeter of the triangle: " + app.perimeter());
        
        System.out.println("Area of the triangle: " + app.area());
        
    }
}
