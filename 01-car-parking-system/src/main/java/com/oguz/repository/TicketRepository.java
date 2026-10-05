package com.oguz.repository;

import com.oguz.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class TicketRepository {
    private EntityManager em = JpaUtil.getEntityManager();


}
