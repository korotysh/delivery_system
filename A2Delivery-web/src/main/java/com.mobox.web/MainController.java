import com.mobox.model.Product;
import com.mobox.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    OrderService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String display() {
        return "home";
    }

    @RequestMapping(value = "/showProducts", method = RequestMethod.GET)
    public ModelAndView displayForm() {
        ModelMap resultMap = new ModelMap();
        List<Product> products = service.showAllFromDB();
        resultMap.addAttribute("products", products);
        return new ModelAndView("home", resultMap);
    }
}
