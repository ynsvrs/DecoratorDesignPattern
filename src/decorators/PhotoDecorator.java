package decorators;

import interfaces.IPhoto;

public abstract class PhotoDecorator implements IPhoto {
    protected IPhoto decoratedPhoto;
    protected String filterName;

    public PhotoDecorator(IPhoto decoratedPhoto, String filterName) {
        this.decoratedPhoto = decoratedPhoto;
        this.filterName = filterName;
    }

    @Override
    public String getDescription() {
        return decoratedPhoto.getDescription() + " + " + filterName;
    }
}