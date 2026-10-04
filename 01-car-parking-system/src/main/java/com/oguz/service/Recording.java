package com.oguz.service;

import com.oguz.entity.Car;
import com.oguz.entity.Ticket;

public class Recording {

    public Recording(){

    }


   public Ticket carParking(int carNumber , String carModel){

        Car newCar = new Car(carNumber , carModel);


        //Find empty slot and create Ticket.

        Ticket newTicket = new Ticket();

        return null;
   }

}
