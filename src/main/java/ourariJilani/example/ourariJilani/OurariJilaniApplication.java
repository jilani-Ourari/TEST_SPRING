package ourariJilani.example.ourariJilani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

// enable spring scheduling
@EnableScheduling
public class OurariJilaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurariJilaniApplication.class, args);
	}

}
