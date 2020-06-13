public class Main {
    public static void main(String[] args){
        Serwis serwis = new Serwis();
        serwis.sellProduct(4,new Customer(1));
        serwis.returnProduct(1,new Customer(1));
        System.out.println("Suma sprzedanych produktów = " + serwis.getSoldProductsReport());
    }
}
