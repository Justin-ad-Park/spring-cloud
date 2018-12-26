package pl.piomin.service.sample.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * How to run
 *
 * 1. Add VM Option
 * -Dspring.config.name=configserver
 *
 * 2. Run ConfigApplication
 *
 * 3. Test
 * JSON : http://localhost:8888/client-service/zone1
 * Properties : http://localhost:8888/client-service-zone2.properties
 * YML : http://localhost:8888/client-service-zone3.yml
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
	}

}
