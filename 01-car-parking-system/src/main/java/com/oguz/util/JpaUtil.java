package com.oguz.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Map;

public class JpaUtil {

    // Goal: This class provides an EntityManager to other classes.

    private JpaUtil(){

    }

    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("car-parking-system-pu",

    Map.of ("jakarta.persistence.jdbc.password" , DB_PASSWORD != null ? DB_PASSWORD : "")


    );

    public static EntityManager getEntityManager(){


        EntityManager em = emf.createEntityManager();

        return em;
    }


}
