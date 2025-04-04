interface Image {
    void displayThumbnail();
    void displayFullImage();
}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading full-resolution image: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + filename);
    }
}


class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail (from proxy): " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}