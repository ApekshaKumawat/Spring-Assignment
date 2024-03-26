package SpringAssignment.LogExecutionTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@ComponentScan(basePackages={"SpringAssignment.Triangle.*"})
@Configuration
@EnableAspectJAutoProxy
public class config {
	
	@Bean
    public Triangle triangle() {
        return new Triangle();
    }

	@Bean
	public ExecutionTimeAspect executionTimeAspect() {
		return new ExecutionTimeAspect();
	}
	
}
