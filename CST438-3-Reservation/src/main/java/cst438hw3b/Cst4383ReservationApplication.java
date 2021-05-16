package cst438hw3b;

/**
 * This application runs as a backend to receive messages from the Rabbit queue 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cst4383ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cst4383ReservationApplication.class, args);
	}

}
