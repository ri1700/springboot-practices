package ex02.runner;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldRunner implements ApplicationRunner {
	
	private Map<?, ?> map;
	
	public HelloWorldRunner(@Qualifier("myMap") Map<?, ?> map) {
		
		this.map = map;
	
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(map.get("greeting"));
	}

}