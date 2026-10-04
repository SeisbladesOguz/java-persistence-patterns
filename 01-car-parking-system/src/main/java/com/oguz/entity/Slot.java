package com.oguz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "slot")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slotId;

    @Column(name = "number", nullable = false, length = 50)
    private int number;

    @Column(name = "floor_number", nullable = false, length = 50)
    private int floorNumber;

    @Column(name = "isOccupied", nullable = false, length = 50)
    private boolean isOccupied;


    public Slot() {
    }

    public Slot(int slotId, int number, int floorNumber) {
        this.slotId = slotId;
        this.number = number;
        this.floorNumber = floorNumber;
    }

    public Slot(int number, int floorNumber) {
        this.number = number;
        this.floorNumber = floorNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
