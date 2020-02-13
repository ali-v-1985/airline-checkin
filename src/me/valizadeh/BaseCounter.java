package me.valizadeh;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class BaseCounter<P extends Passenger> implements Counter<P>, Runnable {

    protected Queue<Passenger> checkInQueue;

    private boolean open;

    protected InformationBooth informationBooth;

    public BaseCounter() {
        this.checkInQueue = new ConcurrentLinkedQueue<>();
        this.open = true;
        this.informationBooth = InformationBooth.getInstance();
    }

    protected void lineInQueue(Passenger passenger) {
        checkInQueue.add(passenger);
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    protected abstract boolean isInCorrectQueue(Passenger passenger);

    @Override
    public void checkin(P passenger) {
        System.out.println(this.getClass().getSimpleName() +" : Welcome " + passenger.getName());
        passenger.setCheckin(true);
    }

    public boolean isPassengerQueueEmpty() {
        return checkInQueue.isEmpty();
    }

    @Override
    public void run() {
        while (isOpen()) {
            Passenger passenger = checkInQueue.poll();
            if(isInCorrectQueue(passenger)) {
                this.checkin((P) passenger);
            } else {
                informationBooth.showQueue(passenger);
            }
        }
    }
}
