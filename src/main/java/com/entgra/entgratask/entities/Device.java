package com.entgra.entgratask.entities;

import com.entgra.entgratask.entities.enums.Status;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String model;
    @Column
    private Status status;
    @Column
    private Timestamp enrolledTime;

    public Device() {}

    public Device(int id, String name, String model, Status status, Timestamp enrolledTime) {
        super();
        this.id = id;
        this.name = name;
        this.model = model;
        this.status = status;
        this.enrolledTime = enrolledTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getEnrolledTime() {
        return enrolledTime;
    }

    public void setEnrolledTime(Timestamp enrolledTime) {
        this.enrolledTime = enrolledTime;
    }
}
