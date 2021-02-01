package edu.wctc;

public class Conservatory extends Room implements Interactable, Lootable, Exit{

    Conservatory(String name) {
        super(name);
    }
    public String interact(Player player) {
        player.addToScore(10);
        return "moved aside many vines, a hole large enough to fit through is seen.";
    }

    public String loot(Player player) {
        return "A strange plant";
    }

    public String exit(Player player) {
        player.addToScore(25);
        return "exited the house.";
    }

    @Override
    public String getDescription() {
        return "An attached greenhouse that hasn't been maintained. There is over growth everywhere, something is scurrying around.";
    }
}
