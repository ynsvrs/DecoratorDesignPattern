package decorators;
import interfaces.IPhoto;

public class GrayscaleFilter extends PhotoDecorator {
    public GrayscaleFilter(IPhoto decoratedPhoto) {
        super(decoratedPhoto, "Grayscale Filter");
    }
}