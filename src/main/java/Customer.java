import java.util.ArrayList;
import java.util.List;

public class Customer extends Product{
    public int id;
    public static ArrayList<Product> customerProductBuy;

    public Customer(){}
    public Customer(int _id){}

    public ArrayList<Product> GetList()
    {
        customerProductBuy = new ArrayList<Product>();
        //Tworzenie listy
        customerProductBuy.add(new Product(1,"Komputer",10.5));
        customerProductBuy.add(new Product(2,"Myszka",15.5));
        customerProductBuy.add(new Product(3,"Deskorolka",8.50));
        //Zwraca lsity
        return customerProductBuy;
    }
}
