package FantasyGame.Alpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;






@SpringBootApplication
public class AlphaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphaApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("*")
//						.allowedOrigins("*");
						.allowedOrigins(
							"http://localhost:5173",
							"chrome-extension://aejoelaoggembcahagimdiliamlcdmfm",
							"https://stagedev1-0.d3rqi9hp5rmy1r.amplifyapp.com"
						);

			}
		};
	}

}
