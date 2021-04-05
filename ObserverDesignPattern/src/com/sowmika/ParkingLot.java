package com.sowmika;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSpace> parkingSpaces;

    public ParkingLot() {
        this.parkingSpaces = new ArrayList<>();
    }

    private void register(ParkingSpace parkingSpace) {
        parkingSpaces.add(parkingSpace);
    }
}
