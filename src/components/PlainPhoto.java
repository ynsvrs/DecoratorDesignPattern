package components;

import interfaces.IPhoto;

public class PlainPhoto implements IPhoto {
    private String name;

    public PlainPhoto(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Photo: " + name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}