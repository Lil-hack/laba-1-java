package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/{numberOne},{numberTwo}")
    public String index (@PathVariable int numberOne,@PathVariable int numberTwo) {
        int result=numberOne+numberTwo;
        return "hello Wolrd! Result = "+result;
    }

}
