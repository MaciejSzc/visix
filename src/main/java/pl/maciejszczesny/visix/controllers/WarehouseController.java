package pl.maciejszczesny.visix.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.maciejszczesny.visix.models.forms.WarehouseForm;
import pl.maciejszczesny.visix.models.services.WarehouseService;

@Controller
public class WarehouseController {
   final WarehouseService warehouseService;

   public WarehouseController(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }

    @GetMapping("/")
    public String getWarehouse(Model model, WarehouseForm warehouseForm){
       model.addAttribute("warehouseFrom", new WarehouseForm());
       model.addAttribute("getAll", warehouseService.getAll());
       return "warehouse";
    }

    @PostMapping("/")
    public String addItem(@ModelAttribute WarehouseForm warehouseForm, Model model){
        warehouseService.addItem(warehouseForm);
        return "warehouse";
    }

    @GetMapping("/delete/book/{id}")
    public String deleteItem(@PathVariable("id") int id, Model model){
       warehouseService.deleteItemById(id);
       return "redirect:/warehouse";
    }
}
