package com.aga.hosen.hosenproject;

/**
 * Created by user on 08/03/2018.
 */

public class Queue2 {
    private String ID;
    private String PHnumber;
    private boolean isCompleted;

    @Override
    public String toString() {
        return "Queue2{" +
                "ID='" + ID + '\'' +
                ", PHnumber='" + PHnumber + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPHnumber() {
        return PHnumber;
    }

    public void setPHnumber(String PHnumber) {
        this.PHnumber = PHnumber;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Queue2() {
    }

    public Queue2(String ID, String PHnumber, boolean isCompleted) {
        this.ID = ID;
        this.PHnumber = PHnumber;
        this.isCompleted = isCompleted;
    }
}

