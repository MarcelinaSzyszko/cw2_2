public class Product {
    public int id;
    private String name;
    private String category;
    private double price;
    private int amountInStore;

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getAmountInStore() { return amountInStore; }

    //Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public void setAmountInStore(int amount) { amountInStore = amount; }

    public void showInfo() {
        System.out.println("Produkt: " + name + "\nKategoria: " + category + "\nCena: " + price + "\nIlość: " + amountInStore);
    }
}
