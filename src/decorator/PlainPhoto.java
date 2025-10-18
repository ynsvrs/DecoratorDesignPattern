package decorator;

public class PlainPhoto implements IPhoto {
    private String name;

    public PlainPhoto(String name) {
        this.name = name;
    }

    @Override
    public String display() {
        return "Displaying photo: " + name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}