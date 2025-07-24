package raisetech.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagement99Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagement99Application.class, args);
	}

	//curl.exe "http://localhost:8080/hello"
	@GetMapping("/hello")
	public String hello(){
		return "こんにちは";
	}

}
