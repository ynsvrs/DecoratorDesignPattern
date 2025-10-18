package decorator;

public class GrayscaleFilter extends PhotoDecorator {
    public GrayscaleFilter(IPhoto decoratedPhoto, String filterName) {
        super(decoratedPhoto, filterName);
    }
}