package yeganeh;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yeganeh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        EcoCounter ecoCounter = new EcoCounter();
        BusCounter busCounter = new BusCounter();
        FclsCounter fclCounter = new FclsCounter();

        Passenger[] passengers = {new Passenger(Type.ECO, "Yeganeh"), new Passenger(Type.ECO, "Roya"),
            new Passenger(Type.ECO, "Alireza"), new Passenger(Type.ECO, "Ali"), new Passenger(Type.ECO, "Majid"),
            new Passenger(Type.BUS, "Kamyar"), new Passenger(Type.FCLS, "Mitra"), new Passenger(Type.BUS, "Sami"),
            new Passenger(Type.FCLS, "Hanieh")};

        Passenger[] passengers1 = {new Passenger(Type.ECO, "Yeganeh"), new Passenger(Type.ECO, "Yeganeh"),
            new Passenger(Type.ECO, "Alireza"), new Passenger(Type.ECO, "Ali"), new Passenger(Type.ECO, "Majid"),
            new Passenger(Type.BUS, "Kamyar"), new Passenger(Type.FCLS, "Mitra"), new Passenger(Type.BUS, "Kamyar"),
            new Passenger(Type.FCLS, "Hanieh")};

        Passenger[] passengers2 = {new Passenger(Type.ECO, "Yeganeh"), new Passenger(Type.ECO, "Yeganeh"),
            new Passenger(Type.ECO, "Alireza"), new Passenger(Type.ECO, "Ali"), new Passenger(Type.ECO, "Majid"),
            new Passenger(Type.BUS, "Kamyar"), new Passenger(Type.FCLS, "Mitra"), new Passenger(Type.BUS, "Kamyar"),
            new Passenger(Type.FCLS, "Hanieh")};

        EcoCounter.queue.addAll(Arrays.asList(passengers));
        BusCounter.queue.addAll(Arrays.asList(passengers1));
        FclsCounter.queue.addAll(Arrays.asList(passengers2));

        Thread t = new Thread(ecoCounter);
        Thread t1 = new Thread(busCounter);
        Thread t2 = new Thread(fclCounter);

        t.start();
        t1.start();
        t2.start();
    }

}
