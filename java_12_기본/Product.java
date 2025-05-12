package java_12_기본;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

}
