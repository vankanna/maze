package edu.wctc;

public class BathRoom extends Room implements Interactable, Lootable {

    BathRoom(String name) {
        super(name);
    }

    public String interact(Player player) {
        player.addToScore(5);
        return "flushed the toilet... whhiirrllll";
    }

    public String loot(Player player) {
        return "Toilet Paper";
    }

    @Override
    public String getDescription() {
        return "A room featuring a toilet and sink, the toilet seat is still warm...";
    }

}
