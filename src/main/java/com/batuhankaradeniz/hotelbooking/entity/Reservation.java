package com.batuhankaradeniz.hotelbooking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int id;

    @Column(name = "reservation_room")
    private String room;

    @Column(name = "reservation_price")
    private double price;

    @Column(name = "reservation_num_of_rooms")
    private int rooms;

    @Column(name = "reservation_num_of_persons")
    private int persons;

    @Column(name = "reservation_num_of_children")
    private int children;

    @Column(name = "reservation_open_buffet")
    private String openbuffet;

    @Column(name = "reservation_arrival_date")
    private Date arrivalDate;

    @Column(name = "reservation_stayed_days")
    private int stayedDays;

    @Column(name = "reservation_user_id")
    private int userId;

    protected Reservation(){}

    public Reservation(int id, String room, double price, int rooms, int persons, int children, String openbuffet, Date arrivalDate, int stayedDays, int userId) {
        this.id = id;
        this.room = room;
        this.price = price;
        this.rooms = rooms;
        this.persons = persons;
        this.children = children;
        this.openbuffet = openbuffet;
        this.arrivalDate = arrivalDate;
        this.stayedDays = stayedDays;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getOpenbuffet() {
        return openbuffet;
    }

    public void setOpenbuffet(String openbuffet) {
        this.openbuffet = openbuffet;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getStayedDays() {
        return stayedDays;
    }

    public void setStayedDays(int stayedDays) {
        this.stayedDays = stayedDays;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", room='" + room + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", persons=" + persons +
                ", children=" + children +
                ", openbuffet='" + openbuffet + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", stayedDays=" + stayedDays +
                ", userId=" + userId +
                '}';
    }
}
