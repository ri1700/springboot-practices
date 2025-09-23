package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ex01.MyApplication01;

@ComponentScan
@SpringBootConfiguration
public class MyApplication {
	
public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication01.class, args)){}
	}
}