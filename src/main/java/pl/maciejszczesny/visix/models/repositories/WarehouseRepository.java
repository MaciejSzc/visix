package pl.maciejszczesny.visix.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.visix.entities.WarehouseEntity;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends CrudRepository<WarehouseEntity, Integer> {

    @Query(nativeQuery = true, value ="SELECT * FROM `warehouse` WHERE id = 1?")
    Optional getItem(int id);
}
