package com.oguz.entity;
import com.oguz.entity.Car;
import com.oguz.entity.Slot;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;


    @ManyToOne
    @JoinColumn(name = "slot_ıd")
    private Slot slot;


    @ManyToOne
    @JoinColumn (name = "car_id")
    private Car car;

    @Column(name = "entry_time" , nullable = false)
    private LocalDateTime entryTime;

    @Column (name = "exit_time")
    private LocalDateTime exitTime;

    public Ticket(int ticketId , Slot slot , Car car , LocalDateTime entryTime , LocalDateTime exitTime){
       this.ticketId = ticketId;
       this.slot = slot;
       this.car = car;
       this.entryTime = entryTime;
       this.exitTime = exitTime;
    }

    public Ticket(Slot slot , Car car , LocalDateTime entryTime , LocalDateTime exitTime){

    }


    public Ticket(){

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
