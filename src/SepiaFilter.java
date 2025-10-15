public class SepiaFilter extends PhotoDecorator {
    public SepiaFilter(IPhoto decoratedPhoto) {
        super(decoratedPhoto);
    }

    @Override
    public String display() {
        return decoratedPhoto.display() + " + Sepia Filter";
    }
}