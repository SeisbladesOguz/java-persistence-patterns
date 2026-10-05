package com.oguz.service;

import com.oguz.entity.Car;
import com.oguz.entity.Slot;
import com.oguz.entity.Ticket;
import com.oguz.repository.SlotRepository;

import java.util.List;

public class Recording {

    public Recording(){

    }

   public  void carParkingAvaliableSlots(){
        List<Slot> emptySlotList =  SlotRepository.findEmptySlots();

        for(int i = 0; i <= emptySlotList.size() - 1; i++ ){
           Slot emptySlots = emptySlotList.get(i);
           int emptySlotsNumber = emptySlots.getNumber();
           System.out.println("Empty slot is: " + emptySlotsNumber);
        }
   }

}
