package yeganeh;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeganeh
 */
public enum Type {

    ECO("Economy"),
    BUS("Business"),
    FCLS("FirstClass");

    String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }    
}