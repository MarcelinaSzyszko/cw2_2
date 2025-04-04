public class Order {
    private int id;
    private Client client;
    private Product[] products;
    private int[] amounts;
    private String orderDate = "03-04-2025";
    private String status = "Nowe";

    // Getters
    public int getId() { return id; }
    public Client getClient() { return client; }
    public Product[] getProducts() { return products; }
    public int[] getAmounts() { return amounts; }
    public String getOrderDate() { return orderDate; }
    public String getStatus() { return status; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setClient(Client client) { this.client = client; }
    public void setProducts(Product[] products) { this.products = products; }
    public void setAmounts(int[] amounts) { this.amounts = amounts; }
    public void setOrderDate(String date) { orderDate = date; }
    public void setStatus(String status) { this.status = status; }

    public void showMoreInfo() {
        System.out.println("ID zamówienia: " + id + ", status: " + status);
        System.out.println("ID klienta: " + client.getId());
        System.out.println("Produkty:");

        for (int i = 0; i < products.length; i++) {
            System.out.println("- " + products[i].getName() + " x" + amounts[i]);
        }

        System.out.println("Łączna wartość: " + calculateOrderPrice());
    }

    public void applyDiscount() {
        client.setIsRegular(true);
    }

    private double calculateOrderPrice() {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice() * amounts[i];
        }

        if (client.getIsRegular()) {
            sum *= 0.9;
        }

        return sum;
    }
}