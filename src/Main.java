public class Main {
    public static void main(String[] args) {
        IPhoto photo = new PlainPhoto();
        System.out.println(photo.display());

        IPhoto grayPhoto = new GrayscaleFilter(photo);
        System.out.println(grayPhoto.display());

        IPhoto sepiaGrayPhoto = new SepiaFilter(grayPhoto);
        System.out.println(sepiaGrayPhoto.display());
    }
}
