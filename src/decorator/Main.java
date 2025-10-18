package decorator;

public class Main {
    public static void main(String[] args) {
        // Create a plain photo
        PlainPhoto photo = new PlainPhoto("Vacation Photo");
        System.out.println(photo.display());

        // Apply grayscale filter
        GrayscaleFilter grayPhoto = new GrayscaleFilter(photo, "Grayscale Filter");
        System.out.println(grayPhoto.display());

        // Apply sepia filter on top of grayscale
        SepiaFilter sepiaGrayPhoto = new SepiaFilter(grayPhoto, "Sepia Filter");
        System.out.println(sepiaGrayPhoto.display());
    }
}
