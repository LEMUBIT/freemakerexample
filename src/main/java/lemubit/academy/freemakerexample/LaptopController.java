package lemubit.academy.freemakerexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
/**
 * Few things you might noticed during the development.
 * We are using @Controller this time rather than @RestController.
 * To clarify, @RestController is used to tell that the response sent
 * from your controller should be sent to the browser, usually an
 * object mapped to json. It is the same as adding @ResponseBody.
 * **/
@Controller
public class LaptopController {

    @RequestMapping("/devices")
    public String displayDevice(Model model) {
        List<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop("HP", "2000", "4GB", "Core I9"));
        laptops.add(new Laptop("DeLL", "3500", "16BG", "Core I7"));

        model.addAttribute("devices",laptops);

        return "devicesUI";
    }
}
