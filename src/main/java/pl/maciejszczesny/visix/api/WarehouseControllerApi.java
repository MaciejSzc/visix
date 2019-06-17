package pl.maciejszczesny.visix.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.maciejszczesny.visix.models.forms.WarehouseForm;
import pl.maciejszczesny.visix.models.services.WarehouseService;

@RestController
@RequestMapping("api/")
public class WarehouseControllerApi {

    final WarehouseService warehouseService;

    public WarehouseControllerApi(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity getAllItem(){
        return ResponseEntity.ok(warehouseService.getAll());
    }

    @DeleteMapping(value = "/item/{id}", produces = "application/json")
    public ResponseEntity softDeleteItemById(@PathVariable("id") int id){
        warehouseService.deleteItemById(id);
        return ResponseEntity.ok("deleted " + id);
    }

    @PostMapping(value = "/user", consumes = "application/json")
    public ResponseEntity saveItem(@RequestBody WarehouseForm warehouseForm){

        warehouseService.addItem(warehouseForm);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

}
