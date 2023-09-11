package com.springdatarest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdatarest.entities.Book;
import com.springdatarest.repository.BookRepo;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner{
	@Autowired
	private BookRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book b=new Book();
		b.setAuthor("Aditya");
		b.setName("Go to real world..");
		
		Book b1=new Book();
		b1.setAuthor("Govind");
		b1.setName("The real money..");
		
		Book b2=new Book();
		b2.setAuthor("NAGA");
		b2.setName("Get your bussiness..");
		
		
		Book b3=new Book();
		b3.setAuthor("AMAN");
		b3.setName("Keep doing hardwork..");
		
		
		List<Book> book=new ArrayList<>();
		book.add(b);
		book.add(b1);
		book.add(b2);
		book.add(b3);
		repo.saveAll(book);
		
	}
	 
}
