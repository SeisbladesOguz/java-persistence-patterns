package com.oguz;

import com.oguz.entity.Slot;
import com.oguz.repository.SlotRepository;
import com.oguz.util.DatabaseSeeder;
import com.oguz.util.JpaUtil;
import jakarta.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {





        try (EntityManager em = JpaUtil.getEntityManager()) {
            System.out.println("Connection is completed");
        } catch (Exception e) {
            System.err.print("Connection error");
            e.printStackTrace();


        }





    }
}
