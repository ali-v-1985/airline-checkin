package me.valizadeh;

import java.util.HashSet;
import java.util.Set;

public class PassengerListGenerator {



    public static Set<Passenger> getPassengerList() {
        Set<Passenger> passengers = new HashSet<>();

        int economy = 0;
        int business = 0;
        int firstClass = 0;
        for (int i = 0; i < 232; i++) {
             if(i % 2 == 0) {
                 passengers.add(new EconomyPassenger(NameGenerator.generate()));
                 economy++;
             } else if (i % 3 == 0) {
                 passengers.add(new FirstClassPassenger(NameGenerator.generate()));
                 firstClass++;
             } else {
                 passengers.add(new BusinessPassenger(NameGenerator.generate()));
                 business++;
             }
        }
        System.out.println("firstClass = " + firstClass);
        System.out.println("business = " + business);
        System.out.println("economy = " + economy);
        return passengers;
    }
}
