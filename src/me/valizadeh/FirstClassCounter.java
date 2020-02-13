package me.valizadeh;

public class FirstClassCounter extends BaseCounter<FirstClassPassenger> implements Runnable {

    public FirstClassCounter() {
        informationBooth.setFirstClassCounter(this);
    }

    @Override
    public void checkin(FirstClassPassenger passenger) {
        super.checkin(passenger);
        System.out.println("Please let me help you with your luggage!");
    }

    @Override
    protected boolean isInCorrectQueue(Passenger passenger) {
        return passenger instanceof FirstClassPassenger;
    }
}
