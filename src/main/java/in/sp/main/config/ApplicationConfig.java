package in.sp.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public CommandLineRunner cmdLineRunner() {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				student1().displayStudentDetails();
				student2().displayStudentDetails();
				
			}
		};
	}
	
	
	@Bean
	public Student student1() {
		return new Student("sumooo",77,89.9f);
	}
	
	@Bean
	public Student student2() {
		return new Student("vinuuu",23,91.2f);
	}


}
