package edu.wctc;

public class Basement extends Room implements Interactable, Lootable {

    Basement(String name) {
        super(name);
    }
    public String interact(Player player) {
        player.addToScore(-10);
        return "peered into the crock, a creature peered back!";
    }

    public String loot(Player player) {
        return "Some Kind Of Bone";
    }

    @Override
    public String getDescription() {
        return "A dark, musty, and spooky place... what was that noise!?";
    }
}
