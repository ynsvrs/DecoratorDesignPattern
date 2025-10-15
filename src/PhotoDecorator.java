public abstract class PhotoDecorator implements IPhoto {
    protected IPhoto decoratedPhoto;

    public PhotoDecorator(IPhoto decoratedPhoto) {
        this.decoratedPhoto = decoratedPhoto;
    }

    @Override
    public String display() {
        return decoratedPhoto.display();
    }
}
