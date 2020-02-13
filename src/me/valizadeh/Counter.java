package me.valizadeh;

public interface Counter<P extends Passenger> {

    void checkin(P passenger);
}
