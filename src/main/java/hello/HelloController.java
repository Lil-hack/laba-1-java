package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/{numberOne}")
    public String index (@PathVariable int numberOne) {
        int result=numberOne;

        return "hello Wolrd! Result = "+result;
    }
    @RequestMapping()
    public String index () {


        return "hello Wolrd!";
    }

}
