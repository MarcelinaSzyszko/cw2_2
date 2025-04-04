public class ComputerShop {
    private Product[] products = new Product[100];
    private Client[] clients = new Client[100];
    private Order[] orders = new Order[100];
    private int productsCount = 0;
    private int clientsCount = 0;
    private int ordersCount = 0;

    public void addProduct(Product product) {
        products[productsCount] = product;
        productsCount += 1;
    }

    public void addClient(Client client) {
        clients[clientsCount] = client;
        clientsCount += 1;
    }

    public Order createOrder(Client client, Product[] products, int[] amounts) {
        Order order = new Order();
        order.setId(ordersCount + 1);
        order.setClient(client);
        order.setProducts(products);
        order.setAmounts(amounts);

        orders[ordersCount] = order;
        ordersCount += 1;

        return order;
    }

    public void updateProductsAmountsInStore(Order order) {
        Product[] products = order.getProducts();
        int[] amounts = order.getAmounts();
        int productsCount = order.getProducts().length;

        for (int i = 0; i < productsCount; i++) {
            int amount = products[i].getAmountInStore();
            products[i].setAmountInStore(amount - amounts[i]);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (int i = 0; i < ordersCount; i++) {
            if (orderId == orders[i].getId()) {
                orders[i].setStatus(newStatus);
            }
        }
    }

    public void showProductsInCategory(String category) {
        System.out.println("Produkty w kategorii " + category + ":");

        for (int i = 0; i < productsCount; i++) {
            if (category == products[i].getCategory()) {
                System.out.println("- " + products[i].getName() + " x" + products[i].getAmountInStore());
            }
        }
    }

    public void showClientOrders(int cliendId) {
        System.out.println("Zamówienia dla ID klienta " + cliendId + ":");

        boolean found = false;

        for (int i = 0; i < ordersCount; i++) {
            if (cliendId == orders[i].getClient().getId()) {
                found = true;

                orders[i].showMoreInfo();
            }
        }

        if (!found) {
            System.out.println("Nie ma zamówień dla danego klienta.");
        }
    }
}
