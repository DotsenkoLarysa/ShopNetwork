package com.itstep.dos.controller;

import com.itstep.dos.service.ShopServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {
    private final ShopServiceImpl shopSI;

    public ShopController(ShopServiceImpl shopSI) {
        this.shopSI = shopSI;
    }

    @GetMapping("/all")
    public String showAllShop(Model model){
        model.addAttribute("shops", shopSI.getAll());
        return "shop";
    }





}
