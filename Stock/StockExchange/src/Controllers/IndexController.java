package Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.stereotype.Controller;
 
@Controller
public class IndexController {

	@RequestMapping("/")
	public String display()  
    {  
		System.out.println("Heybaby");
        return "LoginPage";  
    }
}
