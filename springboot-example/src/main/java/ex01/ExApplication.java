package ex01;

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
		
		/**
		 * 1. 애플리케이션 컨텍스(Application Context) 생성
		 * 2. 만약, 애플리케이션이 웹애플리케이션이면 웹애플리케이션 타입을 결정(Spring MVC or Spring Reactive Web)
		 * 3. Annotation Scan 또는 Configuration Class를 통해 Bean 생성, 등록 그리고 와이어링 작업
         * 4. 애플리케이션 타입이 웹어플리케이션:
		 *    1) Spring MVC
         *       -  내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
         *       -  서버 인스턴스에 웹애플리에션을 배포
         *       -  서버 인스턴스 실행
         *    2) Spring Reactive Web
         *       - Reactor Core(spring-boot-starter-webflux)의 Non-Blocking I/O Netty 엔진 실행: Mono, Flux
         * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행
		 */
		
		/*
		ConfigurableApplicationContext ac = null;
		try {
			ac = SpringApplication.run(ExApplication.class, args);
			System.out.println(ac.getBean("myMap", Map.class).get("greeting"));
		} catch(Exception ex) {
			
		} finally {
			ac.close();
		}
		*/
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)){
			
			System.out.println(ac.getBean("myMap", Map.class).get("greeting"));
		
		} catch(Exception ex) {
			
		}
		
	}

}