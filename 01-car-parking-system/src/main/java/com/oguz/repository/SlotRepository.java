package com.oguz.repository;

import com.oguz.entity.Slot;
import com.oguz.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class SlotRepository {

    public SlotRepository() {

    }

    public static List<Slot> findAllSlots() {
        try (EntityManager em = JpaUtil.getEntityManager()) {
            return em.createQuery("SELECT s FROM Slot s , Slot.class").getResultList();
        }


    }



}
