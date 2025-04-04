public class Client {
    private int id;
    private String name;
    private String surname;
    private String email;
    private boolean isRegular = false;

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getEmail() { return email; }
    public boolean getIsRegular() { return isRegular; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setEmail(String email) { this.email = email; }
    public void setIsRegular(boolean regular) { isRegular = regular; }

    public void showInfo() {
        System.out.println("Klient: " + name + " " + surname + "\nEmail: " + email + "\nStały: " + isRegular);
    }
}