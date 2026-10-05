package com.oguz.service;

import com.oguz.entity.Car;
import com.oguz.entity.Slot;
import com.oguz.entity.Ticket;
import com.oguz.repository.SlotRepository;

import java.util.List;

public class Recording {

    public Recording(){

    }


   public static void carParkingAvaliableSlots(){



        List<Slot> emptySlotList =  SlotRepository.findEmptySlots();

        for(int i = 0; i <= emptySlotList.size(); i++ ){
           Slot emptySlots = emptySlotList.get(i);
           System.out.println("Empty slot is: " + emptySlots);
        }
        //Find empty slot and create Ticket.




   }



}
