package me.leifgao.www.controller;

import me.leifgao.www.service.ProductService;
import me.leifgao.www.vo.ProductForm;
import me.leifgao.www.vo.ProductVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by leif on 2018/2/4
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @RequestMapping(value = "productInput")
    public String inputProduct() {
        logger.info("input called");
        return "ProductForm";
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String saveProduct(ProductForm productForm, Model model,
                              RedirectAttributes redirectAttributes) {
        logger.info("saveProduct caller");
        ProductVo productVo = new ProductVo();
        productVo.setName(productForm.getName());
        productVo.setDescription(productForm.getDescription());
        productVo.setPrice(Float.parseFloat(productForm.getPrice()));

        ProductVo saveProdcuctVo = productService.add(productVo);

        redirectAttributes.addFlashAttribute("message", "add product successfully");
        return "redirect:/viewProduct/" + saveProdcuctVo.getId();
    }

    @RequestMapping(value = "/viewProduct/{id}")
    public String viewProductVo(@PathVariable Long id, Model model) {
        ProductVo productVo = productService.get(id);
        model.addAttribute("product", productVo);
        return "ProductView";
    }
}
