package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/{text},{text2}")
    public String index (@PathVariable int text,@PathVariable int text2) {
        int text3=text+text2;
        return "hi!"+text3;
    }

}
