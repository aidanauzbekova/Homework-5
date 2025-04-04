import java.util.Random;

public class MapApp {
    public static void main(String[] args) {
        String[] types = {"Hospital", "Restaurant", "GasStation"};
        String[] colors = {"Red", "Green", "Blue"};

        for (int i = 0; i < 10000; i++) {
            String type = types[new Random().nextInt(types.length)];
            String color = colors[new Random().nextInt(colors.length)];
            LocationMarker marker = new LocationMarker("Loc" + i, type, color);
            marker.draw();
        }

        System.out.println("Unique styles created: " + MarkerFactory.getStyleCount());
    }
}