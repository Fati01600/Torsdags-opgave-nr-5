package Task3;

import java.util.ArrayList;

//3.d Create Building Class with following fields
public class Building {
    private int numberOfFloors;
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloor;
    private boolean isOfficeBuilding;

    //3.e Constructor for the following fields
    public Building(ArrayList<Room> rooms1, int numberOfBathrooms1, int numberOfFloors1, boolean isOfficeBuilding1) {
        this.rooms = rooms1;
        this.numberOfBathrooms = numberOfBathrooms1;
        this.numberOfFloor = numberOfFloors1;
        this.isOfficeBuilding = isOfficeBuilding1;
    }

    //3.f getters for the following fields
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean getIsOfficeBuilding(){
        return getIsOfficeBuilding();
    }
}
