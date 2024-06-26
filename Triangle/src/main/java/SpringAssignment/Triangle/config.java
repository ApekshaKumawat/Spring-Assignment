package SpringAssignment.Triangle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="SpringAssignment.Triangle.Triangle")
public class config {
	
	@Bean
    public Triangle triangle() {
        return new Triangle(20,40,30);
    }

}
