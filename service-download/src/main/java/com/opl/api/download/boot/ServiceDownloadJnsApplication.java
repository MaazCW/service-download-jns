package com.opl.api.download.boot;

import com.opl.jns.config.utils.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@ComponentScan(basePackages = {"com.opl"})
@EnableScheduling
@EnableAsync
@EnableConfigurationProperties(ApplicationProperties.class)
public class ServiceDownloadJnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDownloadJnsApplication.class, args);
	}

}
