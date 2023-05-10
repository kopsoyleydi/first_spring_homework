package first_spring_task.spring_first_task.controllers;

import first_spring_task.spring_first_task.db.DBManager;
import first_spring_task.spring_first_task.db.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String index(Model model){
        ArrayList<Item> items = DBManager.getItems();
        model.addAttribute("items", items);
        return "index";
    }
    @PostMapping(value = "/addItem")
    public String addItem(Item item){
        DBManager.AddItem(item);
        return "redirect:/";
    }
    @GetMapping(value = "/details/{idshka}")
    public String details(Model model, @PathVariable(name = "idshka") Long id){
        Item item = DBManager.getItem(id);
        model.addAttribute("item", item);
        return "detail";
    }
}