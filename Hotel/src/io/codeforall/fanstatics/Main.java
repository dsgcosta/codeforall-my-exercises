package io.codeforall.fanstatics;

public class Main {

    public static void main(String[] args) {



        //Bedroom bedroom1 = new Bedroom(1);
       // int[] rooms = {1, 2, 3}; // Example room counts
        Guest guest1 = new Guest("Filipe", true); // Create a guest object as needed
        Hotel hotel1 = new Hotel("Ho Hotel", true, new int[] {0,1,2}, guest1);
        //System.out.println(bedroom1.getBedRoomNumber());
        //System.out.println(hotel1.getHotelName());
        //System.out.println(hotel1.getRoomsAvailable());
        System.out.println(hotel1.getRoomsAvailable());


    }
}
