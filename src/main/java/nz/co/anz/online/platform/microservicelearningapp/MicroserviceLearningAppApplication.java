package nz.co.anz.online.platform.microservicelearningapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"nz.co.anz.online.platform.microservicelearningapp.controller"})
public class MicroserviceLearningAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceLearningAppApplication.class, args);
	}

}
