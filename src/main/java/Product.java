import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public class Product {
    public int id;
    public String productName;
    public BigDecimal productPrize;

    public Product() {}
    public Product(int _id, String _productName, BigDecimal _productPrize) {
        this.id = _id;
        this.productName = _productName;
        this.productPrize = _productPrize;
    }
    public int getId()
    {
        return id;
    }
    public BigDecimal getPrize(){return  productPrize;}
}
