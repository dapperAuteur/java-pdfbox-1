package com.awews.pdfbox;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.awews.pdfbox.response.AddResponse;

@SpringBootApplication
public class Pdfbox1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Pdfbox1Application.class, args);
		
		AddResponse first = new AddResponse("not used", "./i-90.pdf", "./ear", "1", 343, 121, 6, "it works");
		
		first.addTextToPdf("not used", "./i-90.pdf", "./ear", "1.pdf", 343, 121, 6, "it works");
		
	}
}
