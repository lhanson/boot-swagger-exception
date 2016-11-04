package example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.swagger2.annotations.EnableSwagger2

@RestController
@EnableSwagger2
@SpringBootApplication
class Application {

    static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }

    @RequestMapping("/")
    @ResponseBody
    List<A> getList() {
        [new A()]
    }

    class A {
        List<Map> listOfMaps
    }

}
