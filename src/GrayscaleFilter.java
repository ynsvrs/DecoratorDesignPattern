public class GrayscaleFilter extends PhotoDecorator {
    public GrayscaleFilter(IPhoto decoratedPhoto) {
        super(decoratedPhoto);
    }

    @Override
    public String display() {
        return decoratedPhoto.display() + " + Grayscale Filter";
    }
}