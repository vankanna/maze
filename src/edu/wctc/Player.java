package edu.wctc;
import java.util.*;

import java.lang.reflect.Array;

public class Player {
    int score = 0;
    List<String> inventory = new ArrayList<String>();

    public void addToInventory(String item) {
        this.inventory.add(item);
    }

    public void addToScore(int score) {
        this.score += score;
    }

    public String getInventory() {
        if (this.inventory.size() == 0) {
            return "Inventory Empty";
        } else {
            return "Inventory---\n" + String.join("\n", this.inventory) + "\n----------";
        }
    }

    public int getScore() {
        return this.score;
    }
}
