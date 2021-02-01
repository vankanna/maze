package edu.wctc;

public class BedRoom extends Room implements Interactable, Lootable {

    BedRoom(String name) {
        super(name);
    }
    public String interact(Player player) {
        player.addToScore(20);
        return "You made the bed";
    }

    public String loot(Player player) {
        return "Pillow";
    }

    @Override
    public String getDescription() {
        return "A bedroom with a king sized bed, the bed is not made.";
    }
}
