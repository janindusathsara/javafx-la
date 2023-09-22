package lk.ijse.javafxla.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemEntity {
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
