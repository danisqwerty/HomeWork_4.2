package com.example.homework_42;

import java.io.Serializable;

public class Ticket implements Serializable {

    private  int id;
    private String departurePlace;
    private String departureDate;
    private String arrivalPlace;
    private String arrivalDate;
    private float costT;

    public Ticket(int id, String departurePlace, String departureDate, String arrivalPlace, String arrivalDate, float costT) {
        this.id = id;
        this.departurePlace = departurePlace;
        this.departureDate = departureDate;
        this.arrivalPlace = arrivalPlace;
        this.arrivalDate = arrivalDate;
        this.costT = costT;
    }

    // get / set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public float getCostT() {
        return costT;
    }

    public void setCostT(float costT) {
        this.costT = costT;
    }

//toString

    @Override
    public String toString() {
        return "ЖД Билет\n" +
                "Пассажир" + id + "\n" +
                "Пункт отправления:" + departurePlace + "в" + departureDate + "\n" +
                "Пункт прибытия:" + arrivalPlace + "в" + arrivalDate + "\n" +
                "coastT = " + costT;
    }
}


