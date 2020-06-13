import javax.validation.constraints.NotBlank;

public class Product {

    public int id;
    public String productName;
    @NotBlank
    public double productPrize;

    public Product() {}
    public Product(int _id, String _productName, double _productPrize) {}
}
