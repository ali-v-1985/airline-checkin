package me.valizadeh;

public class EconomyCounter extends BaseCounter<EconomyPassenger> {

    public EconomyCounter() {
        informationBooth.setEconomyCounter(this);
    }

    @Override
    public void checkin(EconomyPassenger passenger) {

        super.checkin(passenger);
    }

    @Override
    protected boolean isInCorrectQueue(Passenger passenger) {
        return passenger instanceof EconomyPassenger;
    }
}
