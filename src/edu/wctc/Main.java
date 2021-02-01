package edu.wctc;
import java.util.*;

public class Main {

    public static void output(String msg) {
        System.out.println(msg);
    }
    public static void checkChoice(Maze maze, char choice) {
        if (choice == 'l') {
            output(maze.lootCurrentRoom());
        } else if ( choice == 'i') {
            output(maze.interactWithCurrentRoom());
        } else if ( choice == 'x') {
            output(maze.exitCurrentRoom());
            output("*** Your Score: " + maze.getPlayerScore() + " ***");
        } else if ( choice == 'v') {
            output(maze.getPlayerInventory());
        } else {
            if(!maze.move(choice)) {
                output("Try again!");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        Maze maze = new Maze(player);
        Scanner sc = new Scanner(System.in);


        while(!maze.isFinished) {
            output(maze.getCurrentRoomName());
            output("   " + maze.getCurrentRoomDescription());
            output("All Possible Directions");
            output("   " + maze.getCurrentRoomExits());
            output("What will you do in this room?");
            output("   l = loot | i = interact | x = attempt escape | v = inventory");
            output("Or will you try a different room?");
            output("   n = north | e = east | s = south | w = west | u = up | d = down");
            char choice = sc.nextLine().charAt(0);

            checkChoice(maze, choice);

        }

    }
}
