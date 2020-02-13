package me.valizadeh;

import java.util.Set;

public class CounterManager {

    public static void startCheckin(Set<Passenger> passengerList) {
        BaseCounter[] counters = {new EconomyCounter(), new BusinessCounter(), new FirstClassCounter()};
        linePassengers(passengerList, counters);

        for (BaseCounter counter : counters) {
            new Thread(counter).start();
        }

        boolean checkinDone = false;
        while (!checkinDone) {
            if(allQueuesAreEmpty(counters)) {
                closeAllCounters(counters);
                checkinDone = true;
            }
        }
    }

    private static void closeAllCounters(BaseCounter[] counters) {
        for (BaseCounter counter : counters) {
            counter.setOpen(false);
        }
    }

    private static boolean allQueuesAreEmpty(BaseCounter[] counters) {
        boolean allQueuesAreEmpty = true;
        for (BaseCounter counter : counters) {
            if(!counter.isPassengerQueueEmpty()) {
                allQueuesAreEmpty = false;
            }
        }
        return allQueuesAreEmpty;
    }

    private static void linePassengers(Set<Passenger> passengerList, BaseCounter[] counters) {
        int i = 0;
        for (Passenger passenger : passengerList) {
            if (i % 2 == 0) {
                counters[0].lineInQueue(passenger);
            } else if (i % 3 == 0) {
                counters[1].lineInQueue(passenger);
            } else {
                counters[2].lineInQueue(passenger);
            }
            i++;
        }
    }
}
