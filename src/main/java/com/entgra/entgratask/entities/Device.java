package com.entgra.entgratask.entities;

import com.entgra.entgratask.entities.enums.Status;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


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

    @Column()
    @CreationTimestamp
    private LocalDateTime enrolled_time;

    public Device() {}

    public Device(String name, String model, String status) {
        super();
        this.name = name;
        this.model = model;
        this.status = Status.valueOf(status.toUpperCase());
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getEnrolled_time() {
        return enrolled_time;
    }
}
