package Task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //3.g instantiate
        Room room1 = new Room(3,10,4);
        Room room2 = new Room(4,5,10);
        Room room3 = new Room(1,1,0);

        // Create a collection of rooms
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        //3.I instantiate Call the method Building
        Building building = new Building(roomList,2,1,true);

        int totalLamps = countLampsInBuilding(building);
        System.out.println( " The total Lamps in the building is: " + totalLamps);

        boolean isNormalBuilding = isNormal (building);
        if(isNormalBuilding) {
            System.out.println("This is a normal Building");
        }else {
            System.out.println( " This is an good Building");
        }
    }
    //3.j create static method in main called countLamps
    public static int countLampsInBuilding(Building b){
        int totalLamps = 0;
        for (Room room : b.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    //3.k
    public static boolean isNormal(Building b) {
        if (b.getNumberOfFloors()> b.getRooms().size()) {
            return true;
        }else{
            return false;
        }
    }
}