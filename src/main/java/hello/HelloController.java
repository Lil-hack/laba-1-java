package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping()
    public String getHello () {

        return "hello Wolrd!";
    }

    @RequestMapping("/{numberOne},{numberTwo}")
    public String getHello (@PathVariable int numberOne,@PathVariable int numberTwo) {
        int result=numberOne+numberTwo;

        return "hello Wolrd! Result = "+result;
    }


}
