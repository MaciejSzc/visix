package pl.maciejszczesny.visix.models.forms;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WarehouseForm {
    private int id;
    private String name;
    private BigDecimal count;
}
