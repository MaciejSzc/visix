package pl.maciejszczesny.visix.models.entities;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "warehouse")
public class WarehouseEntity {
    private @Id @GeneratedValue int id;
    private String name;
    private BigDecimal count;
}
