package edu.wctc;

public class Attic extends Room implements Lootable {

    Attic(String name) {
        super(name);
    }

    public String loot(Player player) {
        return "Old Cobwebs";
    }

    @Override
    public String getDescription() {
        return "A dry dusty place, the air is stale.";
    }
}
