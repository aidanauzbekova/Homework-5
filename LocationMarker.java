class LocationMarker {
    private String location;
    private MarkerStyle style;

    public LocationMarker(String location, String icon, String color) {
        this.location = location;
        this.style = MarkerFactory.getStyle(icon, color);
    }

    public void draw() {
        style.draw(location);
    }
}