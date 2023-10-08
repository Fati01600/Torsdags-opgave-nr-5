package Task3;

//3.a Create Room.java and make private for following field
public class Room {
    private int numberOfDoors;
    private int getNumberOfLamps;
    private int getNumberOfWindows;

    //3.b Constructor for the above fields
    public Room(int numbersOfDoors1, int numberOfLamps1, int getNumberOfWindows1){
        this.numberOfDoors = numbersOfDoors1;
        this.getNumberOfLamps = numberOfLamps1;
        this.getNumberOfWindows = getNumberOfWindows1;
    }
    //3.c Getter for the above Fields

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getGetNumberOfLamps() {
        return getNumberOfLamps;
    }

    public int getGetNumberOfWindows() {
        return getNumberOfWindows;
    }

    public int getNumberOfLamps() {
        return getNumberOfLamps;
    }
}

