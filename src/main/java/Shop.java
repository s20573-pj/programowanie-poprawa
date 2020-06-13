import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop extends Product{
    public int id;
    public String shopName;
    public static List<Product> anavableProducts;
    public static List<Product> sellProducts;

    public Shop(){}
    public Shop(int _id, String _shopName){}

    public List<Product> GetAnavableProducts()
    {
        anavableProducts = new ArrayList<Product>();
        anavableProducts.add(new Product(4,"Głośniki",new BigDecimal("50.99")));
        return anavableProducts;
    }
    public List<Product> GetSellProducts()
    {
        sellProducts = new ArrayList<Product>();
        sellProducts.add(new Product(5,"Klawiatura",new BigDecimal("100.85")));
        return sellProducts;
    }
    public Optional<Product> findById(int id) {
        return anavableProducts.stream().filter(pizza -> pizza.getId() == id).findFirst();
    }
}

