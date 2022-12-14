package lab3.functionality;

import java.util.ArrayList;

public abstract class Location extends Actionable {
    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Location> locations = new ArrayList<>();

    public Location(String name, Description description) {
        super(name, description);
    }

    public Location(String name, String description) {
        this(name, p -> description);
    }

    public abstract String enter(Player player);

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void connect(Location loc) {
        loc.locations.add(this);
        locations.add(loc);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int ind) {
        items.remove(ind);
    }
}
