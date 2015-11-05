package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ModelloRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("no delete");
		//repository.deleteAll();
		// aggiungo un commento
		// secondo commento
		// save a couple of customers
		repository.save(new Modello("Modello 1", "Modello 1"));
		repository.save(new Modello("Modello 2", "Modello 2"));

		// fetch all customers
		System.out.println("Modelli found with findAll():");
		System.out.println("-------------------------------");
		for (Modello customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println("prova");

		// fetch an individual customer
		System.out.println("Modello found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Modelli found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Modello customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}

	}

}
