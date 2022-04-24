package ru.gb.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.model.Product;
import ru.gb.repository.ProductProvider;
import ru.gb.service.ProductService;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    boolean start = true;
    private final ProductProvider productProvider;
    private final ProductService productService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "create-product";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processForm(Product product) {
        productService.save(product);
        return "redirect:/product/all";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String showChangeForm(Model model) {
        model.addAttribute("product", new Product());
        return "edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String changeForm(Product product) {
        productService.edit(product);
        return "redirect:/product/all";
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String getAllMessages(Model model) {
        if (start) {
            model.addAttribute("msg", productProvider.getProduct());
            start = false;
        }
        model.addAttribute("products", productService.findAll());
        return "product-list";
    }


//    //localhost:8080/spring/message/{id}?random=true
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    public String getMessageId(Model model, @PathVariable Integer id) {
//        Product product;
//
//            product = productService.findById(id);
//
//
//        model.addAttribute("product", product);
//        return "product";
//    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String show(Model model) {

        model.addAttribute("product", new Product());
        return "delete";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public String deleteById(Product product) {
        productService.deleteById(product);
        return "redirect:/product/all";
    }


//    @RequestMapping
//    public String printProduct(Model model) {
//        model.addAttribute("msg", productProvider.getProduct());
//        return "product";
//    }
}
