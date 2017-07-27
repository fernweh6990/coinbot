package com.chohyunsu.eunsolMamma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
/*public class EunsolMammaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EunsolMammaApplication.class, args);
	}
}*/
public class EunsolMammaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EunsolMammaApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EunsolMammaApplication.class, args);
    }

}

