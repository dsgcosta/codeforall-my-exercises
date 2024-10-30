package io.codeforall.fanstatics;

public class Bedroom {

    private int bedRoomNumber;
    private boolean isOccupied;

    public Bedroom(int bedRoomNumber, boolean isOccupied) {
        this.bedRoomNumber = bedRoomNumber;
        this.isOccupied = false;
    }

    public int getBedRoomNumber() {
        return bedRoomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
