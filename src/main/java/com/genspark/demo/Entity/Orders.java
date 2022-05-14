package com.genspark.demo.Entity;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false,
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_USR_FK"))
    private User user;
    @NotNull
    private String status;
    @NotNull
    private String trackingNumber;

    @NotNull
    private Timestamp createDate;
     private Timestamp endDate;

    public Orders() {
    }

    public Orders(int id, User user, String status, String trackingNumber, Timestamp createDate, Timestamp endDate) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.trackingNumber = trackingNumber;
        this.createDate = createDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Timestamp getCreatedAt() {
        return createDate;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createDate = createdAt;
    }

    public Timestamp getEndAt() {
        return endDate;
    }

    public void setEndAt(Timestamp endAt) {
        this.endDate = endAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + user +
                ", Status='" + status + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
//                ", createdAt=" + createDate +
//                ", endAt=" + endDate +
                '}';
    }
}
