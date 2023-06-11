package org.example.controller;

import org.example.model.InteractiveModel;
import org.example.model.SimpleModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/coolLink")
    public String coolLink(){
        return "coolLink";
    }

    @GetMapping("/simpleModelView")
    public String showSimpleModel(Model model){
        SimpleModel simpleModel = new SimpleModel("Wood", 10, 10);
        model.addAttribute("coolModel", simpleModel);
        return "simpleModelView";
    }

    @GetMapping("/interactiveModelView")
    public String showInteractiveModel(Model model){
        InteractiveModel interactiveModel = new InteractiveModel();
        model.addAttribute("interactiveModel", interactiveModel);
        return "interactiveModelView";
    }
    @PostMapping("/interactiveModelView")
    public String handleInteractiveModel(@ModelAttribute("interactiveModel") InteractiveModel interactiveModel,Model model){
        int result = interactiveModel.getFirstNum() + interactiveModel.getSecondNum() + interactiveModel.getThirdNum();
        interactiveModel.setResult(result);
        model.addAttribute("interactiveModel", interactiveModel);
        return "interactiveModelView";
    }

}
