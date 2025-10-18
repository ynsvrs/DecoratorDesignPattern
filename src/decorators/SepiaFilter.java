package decorators;

import interfaces.IPhoto;

public class SepiaFilter extends PhotoDecorator {
    public SepiaFilter(IPhoto decoratedPhoto) {
        super(decoratedPhoto, "Sepia Filter");
    }
}