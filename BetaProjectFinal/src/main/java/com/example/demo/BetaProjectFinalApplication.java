package com.example.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;
import org.springframework.cloud.deployer.spi.cloudfoundry.CloudFoundryDeployerAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableBatchProcessing
@EnableDataFlowServer
@EnableWebMvc
@EntityScan()
@EnableAutoConfiguration(exclude = { CloudFoundryDeployerAutoConfiguration.class })
@SpringBootApplication
public class BetaProjectFinalApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(BetaProjectFinalApplication.class, args);
	}

}
