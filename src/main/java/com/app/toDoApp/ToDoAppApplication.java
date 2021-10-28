package com.app.toDoApp;

import com.app.toDoApp.model.ToDo;
import com.app.toDoApp.repository.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ToDoAppApplication implements CommandLineRunner{

	private final ToDoRepository toDoRepository;

	public ToDoAppApplication(ToDoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ToDo item1 = ToDo.builder()
				.name("Homework")
				.description("School homework")
				.status(false).build();
		ToDo item2 = ToDo.builder()
				.name("Homework")
				.description("University homework")
				.status(false).build();
		ToDo item3 = ToDo.builder()
				.name("Homework")
				.description("School homework")
				.status(false).build();

		toDoRepository.saveAll(Arrays.asList(item1, item2, item3));
	}
}
