package main;

import interfaces.IPhoto;
import components.PlainPhoto;
import decorators.GrayscaleFilter;
import decorators.SepiaFilter;

public class Main {
    public static void main(String[] args) {

        IPhoto basic = new PlainPhoto("Vacation Photo");
        show(basic);

        IPhoto grayscale = new GrayscaleFilter(basic);
        show(grayscale);

        IPhoto sepiaGray = new SepiaFilter(grayscale);
        show(sepiaGray);
    }

    private static void show(IPhoto photo) {
        System.out.println("\nPhoto Info:");
        System.out.println(photo.getDescription());
    }
}