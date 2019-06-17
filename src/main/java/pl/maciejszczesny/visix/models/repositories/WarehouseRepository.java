package pl.maciejszczesny.visix.models.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.visix.models.entities.WarehouseEntity;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends CrudRepository<WarehouseEntity, Integer> {

}
