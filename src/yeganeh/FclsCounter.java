package yeganeh;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yeganeh
 */
public class FclsCounter extends CounterBase implements Runnable {

    public static Queue<Passenger> queue;

    public FclsCounter() {
        super(Type.BUS);
        queue = new ConcurrentLinkedQueue<>();
    }

    @Override
    public synchronized void run() {
        for (Passenger passenger : queue) {
            passenger = queue.remove();
            queue.remove(passenger);

            switch (passenger.getType().toString()) {
                case "ECO":
                    System.out.println("Dear " + passenger.getName() + " You're In a Wrong Counter");
                    System.out.println("Please Go to Economy Counter");
                    EcoCounter.queue.add(passenger);
                    break;

                case "BUS":
                    System.out.println("Dear " + passenger.getName() + " You're In a Wrong Counter");
                    System.out.println("Please Go to Business Counter");
                    BusCounter.queue.add(passenger);
                    break;

                case "FCLS":
                    System.out.println("Welcome!" + " Dear " + passenger.getName());
                    System.out.println("Here You Are Some Choclates");
                    this.checkedInPass(passenger);
                    System.out.println("You're Now CheckedIn");
                    System.out.println("Your Suitcase Is Loaded Now");
                    break;
            }
        }
    }

}
