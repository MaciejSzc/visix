package pl.maciejszczesny.visix.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.visix.models.entities.WarehouseEntity;
import pl.maciejszczesny.visix.models.forms.WarehouseForm;
import pl.maciejszczesny.visix.models.repositories.WarehouseRepository;

import java.util.Optional;

@Service
public class WarehouseService {

    @Autowired
    WarehouseRepository warehouseRepository;

    public Iterable<WarehouseEntity> getAll(){
       return warehouseRepository.findAll();
    }

    public WarehouseEntity getItemById(int id) {
        Optional<WarehouseEntity> optionalItem = warehouseRepository.findById(id);
        if (!optionalItem.isPresent()) {
            throw new IllegalStateException("Item with that id, does not exist");
        }


        return  optionalItem.get();

    }


    public void addItem(WarehouseForm warehouseForm){
        WarehouseEntity warehouseEntity = new WarehouseEntity();
        warehouseEntity.setName(warehouseForm.getName());
        warehouseEntity.setCount(warehouseForm.getCount());

        warehouseRepository.save(warehouseEntity);
    }

    /*public void updateItem(int id){

    }*/

    public void deleteItemById(int id){
        Optional<WarehouseEntity> optionalItem = warehouseRepository.findById(id);
        if (!optionalItem.isPresent()) {
            throw new IllegalStateException("Item with that id, does not exist");
        }

        warehouseRepository.delete(optionalItem.get());
    }




}
