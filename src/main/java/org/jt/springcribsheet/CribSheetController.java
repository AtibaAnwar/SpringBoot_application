package org.jt.springcribsheet;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CribSheetController {
    @GetMapping("/home")
    public String displayWeb(Model model){
        var link1 = new Link("Start Initializer","https://start.spring.io/");
        var link2 = new Link("Thymeleaf","https://www.thymeleaf.org/");
        var link3 = new Link("Mvn Repository","https://mvnrepository.com/");
        var link4 = new Link("Spring own site","https://spring.io/");
        var links = List.of(link1,link2,link3,link4);
        model.addAttribute("links", links);
        var annotation1 = new Annotation("@SpringBootApplication","Meta-annotation in Spring Boot that combines several annotations to simplify the configuration of Spring applications");
        var annotation2 = new Annotation("@Controller","Marks the class as a web controller, capable of handling the HTTP requests.");
        var annotation3 = new Annotation("@GetMapping", "Used to map HTTP GET requests to specific methods in your controller");
        var annotation4 = new Annotation("@RequestMapping", " specify on the method in thecontroller, to map a HTTP request to the URL to this method.");
        var annotations = List.of(annotation1,annotation2,annotation3,annotation4);
        model.addAttribute("annotations",annotations);
        var keyword1 = new Keywords("Framework","Multiple Libraries embeded together to organize the code");
        var keyword2 = new Keywords("Model"," It is used to pass data to the view.");
        var keyword3 = new Keywords("Thymeleaf","server-side Java template engine ");
        var keywords=List.of(keyword1,keyword2,keyword3);
        model.addAttribute("keywords", keywords);
        return "home";    
    }
}
