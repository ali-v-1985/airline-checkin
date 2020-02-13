package me.valizadeh;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Passenger> passengerList = PassengerListGenerator.getPassengerList();

        CounterManager.startCheckin(passengerList);
    }
}
