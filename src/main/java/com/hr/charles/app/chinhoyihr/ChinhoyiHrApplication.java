package com.hr.charles.app.chinhoyihr;

import com.hr.charles.app.chinhoyihr.ui.views.splashScreen.SplashForm;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

@SpringBootApplication
public class ChinhoyiHrApplication implements CommandLineRunner {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ChinhoyiHrApplication.class).headless(false).run(args);
	}

	@Override
	public void run(String... args) {
		JFrame frame = new SplashForm();
		frame.setVisible(true);
	}
}
