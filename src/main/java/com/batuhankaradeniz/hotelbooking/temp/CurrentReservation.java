package com.batuhankaradeniz.hotelbooking.temp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.crypto.Data;
import java.util.Date;

public class CurrentReservation {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private int id;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private int stayPeriod;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String room;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private double price;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private int rooms;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private int children;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String openBuffet;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private Date arrivalDate;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private int usertId;

    public CurrentReservation() {
    }

    public CurrentReservation(@NotNull(message = "is required")
                              @Size(min = 1, message = "is required")int id,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")int stayPeriod,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")String room,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")double price,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")int rooms,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")int children,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")String openBuffet,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")Date arrivalDate,
                              @NotNull(message = "is required")
                              @Size(min = 1, message = "is required")int usertId) {
        this.id = id;
        this.stayPeriod = stayPeriod;
        this.room = room;
        this.price = price;
        this.rooms = rooms;
        this.children = children;
        this.openBuffet = openBuffet;
        this.arrivalDate = arrivalDate;
        this.usertId = usertId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStayPeriod() {
        return stayPeriod;
    }

    public void setStayPeriod(int stayPeriod) {
        this.stayPeriod = stayPeriod;
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

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getOpenBuffet() {
        return openBuffet;
    }

    public void setOpenBuffet(String openBuffet) {
        this.openBuffet = openBuffet;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getUsertId() {
        return usertId;
    }

    public void setUsertId(int usertId) {
        this.usertId = usertId;
    }

    @Override
    public String toString() {
        return "CurrentReservation{" +
                "id=" + id +
                ", stayPeriod=" + stayPeriod +
                ", room='" + room + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", children=" + children +
                ", openBuffet='" + openBuffet + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", usertId=" + usertId +
                '}';
    }
}
