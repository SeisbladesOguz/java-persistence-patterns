package com.oguz.util;

import com.oguz.entity.Slot;
import com.oguz.repository.SlotRepository;

public class DatabaseSeeder {



    public DatabaseSeeder(){

    }

    public static void firstSlotData(){

        int currentSlotNumber = 1;


        for(int floor =1 ; floor <=3 ; floor++){

            for(int slotNum = 1; slotNum <= 5; slotNum++){

                Slot newSlot = new Slot(currentSlotNumber , floor , false);
                currentSlotNumber++;
                SlotRepository.save(newSlot);
            }
        }

    }


}
