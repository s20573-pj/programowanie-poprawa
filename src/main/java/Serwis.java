import java.math.BigDecimal;
import java.util.List;

import java.util.Optional;

public class Serwis extends Shop {

    private Optional<Product> findProductInShop(int productId)
    {
        GetAnavableProducts();
        return  anavableProducts.stream().filter(product -> product.getId() == productId).findFirst();
    }
    private Optional<Product> findProductInCustomer(int productId)
    {
        GetSellProducts();
        return  sellProducts.stream().filter(product -> product.getId() == productId).findFirst();
    }
    public List<Product> sellProduct(int productId, Customer customer)
    {
        Customer.GetList();
        findProductInShop(4);
        return Customer.customerProductBuy;
    }
    public List<Product> returnProduct(int productId, Customer customer)
    {
        return anavableProducts;
    }
    public BigDecimal getSoldProductsReport()
    {
        BigDecimal saldo;
        BigDecimal pom;
        saldo = new BigDecimal("0.0");
        GetAnavableProducts();
        for(Product product : anavableProducts)
        {
            pom = product.getPrize();
            saldo = saldo.add(pom);
        }
        return saldo;
    }
}
