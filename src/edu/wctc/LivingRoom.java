package edu.wctc;

public class LivingRoom extends Room {

    LivingRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Just a normal living room.";
    }
}
