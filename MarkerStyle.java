class MarkerStyle {
    private String icon;
    private String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void draw(String location) {
        System.out.println("Drawing " + icon + " marker at " + location + " in " + color);
    }
}