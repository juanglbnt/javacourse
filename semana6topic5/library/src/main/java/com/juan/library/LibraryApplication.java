package com.juan.library;

import com.juan.library.dao.BookDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		BookDao dao = appContext.getBean("bookDao", BookDao.class);
		System.out.println(dao.getBookNameForId(128));
		System.out.println(dao.getBookNameForId(176));
		System.out.println(dao.getBookNameForId(423));

	}

}
