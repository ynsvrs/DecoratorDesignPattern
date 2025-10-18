package decorator;

public class SepiaFilter extends PhotoDecorator {
    public SepiaFilter(IPhoto decoratedPhoto, String filterName) {
        super(decoratedPhoto, filterName);
    }
}
