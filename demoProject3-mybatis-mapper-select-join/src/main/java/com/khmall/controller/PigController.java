package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Pig;
import com.khmall.service.PigService;

@Controller
public class PigController {

    @Autowired
    private PigService pigService;

    @GetMapping("/pigs")
    public String getAllPigs(Model model) {
        List<Pig> pigs = pigService.getAllPigs();
        model.addAttribute("pigs", pigs);
        return "pigList";
    }
}