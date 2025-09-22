package ex02;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication {	// Bootstrap Class

	@Bean
	public Map<?, ?> myMap() {
		
		return Map.of("greeting", "hello, wolrd");
	
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)){
			
		
		} catch(Exception ex) {
			
			
		}
	}
}