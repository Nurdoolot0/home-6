public class Weapon {
    private String type;

    private String name;

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Weapon(String type, String name, int quantity) {

        this.type = type;

        this.name = name;

        this .quantity = quantity;
    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }



}
