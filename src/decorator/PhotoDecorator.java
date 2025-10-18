package decorator;

public abstract class PhotoDecorator implements IPhoto {
    protected IPhoto decoratedPhoto;
    protected String filterName;

    public PhotoDecorator(IPhoto decoratedPhoto, String filterName) {
        this.decoratedPhoto = decoratedPhoto;
        this.filterName = filterName;
    }

    // Getter and Setter
    public IPhoto getDecoratedPhoto() {
        return decoratedPhoto;
    }

    public void setDecoratedPhoto(IPhoto decoratedPhoto) {
        this.decoratedPhoto = decoratedPhoto;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    @Override
    public String display() {
        return decoratedPhoto.display() + " + " + filterName;
    }
}
