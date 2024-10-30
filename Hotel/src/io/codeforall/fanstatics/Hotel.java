package io.codeforall.fanstatics;

public class Hotel {

    private String hotelName;
    private boolean roomAvailability;

    private int[] numberOfRooms;
    private Bedroom bedroom; //Calling bedroom class to relate to hotel class

    private Guest guest;

    public Hotel(String hotelName, boolean roomAvailability, int[] numberOfRooms, Guest guest) {
        this.hotelName = hotelName;
        this.roomAvailability = true;
        this.numberOfRooms = numberOfRooms;
        this.guest = guest;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRoomsAvailable() {
        int totalRooms = 0;
        for (int rooms : numberOfRooms) {
            totalRooms += rooms;
        }
        return totalRooms;
    }

    public void checkRoomsAvailable(int totalRooms) {

    }
    //public int testCheckIn(){
        //if(numberOfRooms > 3) {
          //  setRoomsAvailable(numberOfRooms);
        //}
        //return numberOfRooms;
    //}
}
    /*
    *
    *     public int use(int money) {

        // exception case handling
        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;
        }

        // normal case
        this.money -= money;
        return money;

    }
    *
    *
    *
    *
    * for (int i = 0; i < numberOfRooms.length; i++) {
    *     System.out.println(numberOfRooms[i]);
      }

      */




