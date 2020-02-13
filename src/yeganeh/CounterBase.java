package yeganeh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yeganeh
 */
public class CounterBase {

    Type type;

    public CounterBase(Type type) {
        this.type = type;

    }

    public void checkedInPass(Passenger pass) {
        pass.setCheckedIn(true);
    }
}
