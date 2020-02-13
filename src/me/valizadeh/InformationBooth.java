package me.valizadeh;

public final class InformationBooth {

    private static final InformationBooth INFORMATION_BOOTH = new InformationBooth();

    private EconomyCounter economyCounter;
    private BusinessCounter businessCounter;
    private FirstClassCounter firstClassCounter;

    private InformationBooth() {
    }

    public static final InformationBooth getInstance() {
        return INFORMATION_BOOTH;
    }

    public void showQueue(Passenger passenger) {
        if(passenger instanceof EconomyPassenger) {
            economyCounter.lineInQueue(passenger);
        }else if(passenger instanceof BusinessPassenger) {
            businessCounter.lineInQueue(passenger);
        }else if(passenger instanceof FirstClassPassenger) {
            firstClassCounter.lineInQueue(passenger);
        }
    }

    public void setEconomyCounter(EconomyCounter economyCounter) {
        this.economyCounter = economyCounter;
    }

    public void setBusinessCounter(BusinessCounter businessCounter) {
        this.businessCounter = businessCounter;
    }

    public void setFirstClassCounter(FirstClassCounter firstClassCounter) {
        this.firstClassCounter = firstClassCounter;
    }
}
