package ru.kromarong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kromarong.Message;
import ru.kromarong.repo.Product;
import ru.kromarong.repo.ProductRepo;

import java.util.Arrays;

@Controller
public class MainController {

    @Autowired
    private ProductRepo productRepo;

    @RequestMapping(path = "/main", method = RequestMethod.GET)
    public String mainPage(Model model) {
        model.addAttribute("msgList", Arrays.asList(
                new Message("Hello"),
                new Message("World"),
                new Message("!!!")
        ));
        return "index";
    }

    @RequestMapping(path = "/product", method = RequestMethod.GET)
        public String product(Model model){
        model.addAttribute("products", productRepo.findAll());
        return "product";
    }

    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public String product(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("cost") int cost,
            Model model)
        {
        productRepo.add(new Product(id, name, cost));
        model.addAttribute("productList", productRepo.findAll());
        return "product";
    }
}
