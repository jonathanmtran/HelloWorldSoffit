package net.spinyshell.jmtran.SoffitDemo;

import org.apereo.portal.soffit.renderer.SoffitApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SoffitApplication
public class SoffitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoffitDemoApplication.class, args);
	}
}
