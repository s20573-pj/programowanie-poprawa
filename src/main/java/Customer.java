
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Product{
    public int id;
    public static List<Product> customerProductBuy;

    public Customer(){}
    public Customer(int _id){}

    public static List<Product> GetList()
    {
        customerProductBuy = new ArrayList<Product>();
        //Tworzenie listy
        customerProductBuy.add(new Product(1,"Komputer",new BigDecimal("10.5")));
        customerProductBuy.add(new Product(2,"Myszka",new BigDecimal("15.5")));
        customerProductBuy.add(new Product(3,"Deskorolka",new BigDecimal("8.50")));
        //Zwraca lsity
        return customerProductBuy;
    }
}

