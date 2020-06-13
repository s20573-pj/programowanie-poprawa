import java.util.ArrayList;

public class Shop extends Product{
    public int id;
    public String shopName;
    public static ArrayList<Product> anavableProducts;
    public static ArrayList<Product> sellProducts;

    public Shop(){}
    public Shop(int _id, String _shopName){}

    public ArrayList<Product> GetAnavableProducts()
    {
        anavableProducts = new ArrayList<Product>();
        anavableProducts.add(new Product(4,"Głośniki",50.99));
        return anavableProducts;
    }
    public ArrayList<Product> GetSellProducts()
    {
        sellProducts = new ArrayList<Product>();
        sellProducts.add(new Product(5,"Klawiatura",100.85));
        return sellProducts;
    }

}
