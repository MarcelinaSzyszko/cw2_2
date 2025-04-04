public class Main {
    public static void main(String[] args) {
        // Tworzymy instancję sklepu komputerowego
        ComputerShop shop = new ComputerShop();

        // Dodajemy produkty
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop Dell XPS 13");
        product1.setCategory("Laptop");
        product1.setPrice(4999.99);
        product1.setAmountInStore(10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Mysz Logitech MX Master 3");
        product2.setCategory("Mysz");
        product2.setPrice(349.99);
        product2.setAmountInStore(30);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Monitor Samsung 27\"");
        product3.setCategory("Monitor");
        product3.setPrice(1299.99);
        product3.setAmountInStore(15);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        // Dodajemy klientów
        Client client1 = new Client();
        client1.setId(1);
        client1.setName("Jan");
        client1.setSurname("Kowalski");
        client1.setEmail("jan.kowalski@example.com");
        client1.setIsRegular(true);

        Client client2 = new Client();
        client2.setId(2);
        client2.setName("Anna");
        client2.setSurname("Nowak");
        client2.setEmail("anna.nowak@example.com");
        client2.setIsRegular(false);

        shop.addClient(client1);
        shop.addClient(client2);

        // Tworzymy zamówienia
        Product[] orderProducts1 = { product1, product2 };
        int[] orderAmounts1 = { 1, 1 };

        Order order1 = shop.createOrder(client1, orderProducts1, orderAmounts1);
        order1.applyDiscount(); // Zastosuj zniżkę dla stałego klienta
        shop.updateProductsAmountsInStore(order1);

        // Wyświetlamy informacje
        System.out.println("Informacje o zamówieniu:");
        order1.showMoreInfo();

        System.out.println("\nStan magazynowy po zamówieniu:");
        shop.showProductsInCategory("Laptop");
        shop.showProductsInCategory("Mysz");

        // Zmiana statusu zamówienia
        shop.changeOrderStatus(order1.getId(), "Zrealizowane");
        System.out.println("\nStatus zamówienia po aktualizacji:");
        order1.showMoreInfo();

        // Dodanie kolejnego zamówienia
        Product[] orderProducts2 = { product3, product2 };
        int[] orderAmounts2 = { 2, 1 };

        Order order2 = shop.createOrder(client2, orderProducts2, orderAmounts2);
        shop.updateProductsAmountsInStore(order2);

        // Wyświetlanie zamówień klienta
        System.out.println("\nZamówienia klienta Jan Kowalski:");
        shop.showClientOrders(1);
    }
}