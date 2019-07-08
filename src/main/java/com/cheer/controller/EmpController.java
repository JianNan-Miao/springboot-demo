package com.cheer.controller;

import com.cheer.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("listEmp")
    public String listEmp(Model model){
        model.addAttribute("listEmp",empService.getEmp());
       return "empIndex";
    }

}
