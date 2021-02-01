package edu.wctc;

abstract public class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;


    Room(String name) {
       this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Room getAdjoiningRoom(char direction ) {
        if (direction == 'n') {
            return this.north;
        } else if (direction == 's') {
            return this.south;
        } else if (direction == 'e') {
            return this.east;
        } else if (direction == 'w') {
            return this.west;
        } else if (direction == 'u') {
            return this.up;
        } else if (direction == 'd') {
            return this.down;
        } else {
            return null;
        }
    }

    public abstract String getDescription();

    public String getExits() {
        String response = "";
        if (this.north != null) {
            response += "North ";
        }

        if (this.south != null) {
            response += "South ";
        }

        if (this.east != null) {
            response += "East ";
        }

        if (this.west != null) {
            response += "West ";
        }

        if (this.up != null) {
            response += "Up ";
        }

        if (this.down != null) {
            response+= "Down ";
        }

        return response;
    }

    public boolean isValidDirection(char direction) {
        if (direction == 'n' && this.north != null) {
            return true;
        } else if (direction == 's' && this.south != null) {
            return true;
        } else if (direction == 'e' && this.east != null) {
            return true;
        } else if (direction == 'w' && this.west != null) {
            return true;
        } else if (direction == 'u' && this.up != null) {
            return true;
        } else if (direction == 'd' && this.down != null) {
            return true;
        } else {
            return false;
        }
    }

    public void setDown(Room room) {
        this.down = room;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public void setUp(Room room) {
        this.up = room;
    }

    public void setWest(Room room) {
        this.west = room;
    }

}
