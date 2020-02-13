package me.valizadeh;

public class BusinessCounter extends BaseCounter<BusinessPassenger> implements Runnable {

    public BusinessCounter() {
        informationBooth.setBusinessCounter(this);
    }

    @Override
    public void checkin(BusinessPassenger passenger) {
        super.checkin(passenger);
        System.out.println("Here is your chocolate!");
    }

    @Override
    protected boolean isInCorrectQueue(Passenger passenger) {
        return passenger instanceof BusinessPassenger;
    }
}
