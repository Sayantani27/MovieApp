import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MovieappApplication {
    public static void main(String[] args){
        SpringApplication.run(MovieappApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String helloStudents() { return "Hello student to Spring Boot!"; }

}
