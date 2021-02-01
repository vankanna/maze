package edu.wctc;

public class Maze {
    Room currentRoom;
    Player player;
    boolean isFinished;

    Maze(Player player) {
        this.player = player;

        Attic attic = new Attic("Attic");
        Basement basement = new Basement("Basement");
        BathRoom bathroom = new BathRoom("Bathroom");
        BedRoom bedroom = new BedRoom("Bedroom");
        Conservatory conservatory = new Conservatory("Conservatory");

        bedroom.setDown(basement);
        bedroom.setUp(attic);
        bedroom.setEast(conservatory);
        bedroom.setWest(bathroom);

        conservatory.setWest(bedroom);
        bathroom.setEast(bedroom);

        attic.setDown(bedroom);
        basement.setUp(bedroom);

        this.currentRoom = bedroom;
        this.isFinished = false;

    }

    public String getCurrentRoomName() {
        return this.currentRoom.getName();
    }
    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public String getPlayerInventory() {
        return this.player.getInventory();
    }

    public int getPlayerScore() {
        return this.player.getScore();
    }

    public String interactWithCurrentRoom() {
        if (this.currentRoom instanceof Interactable) {
            return ((Interactable) this.currentRoom).interact(this.player);
        } else {
            return "Nothing to interact with.";
        }
    }

    public String lootCurrentRoom() {
        if (this.currentRoom instanceof Lootable) {
           String loot = ((Lootable) this.currentRoom).loot(this.player);
           this.player.addToInventory(loot);
           return "You picked up " + loot;
        } else {
            return "Nothing to loot.";
        }
    }

    public String exitCurrentRoom() {
        if (this.currentRoom instanceof Exit) {
            this.isFinished = true;

            return ((Exit) this.currentRoom).exit(this.player);
        } else {
            return "There is no exit.";
        }
    }

    public boolean move(char direction) {
        if(this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }

        return false;
    }

    public boolean isFinished() {
        return this.isFinished;
    }

}
