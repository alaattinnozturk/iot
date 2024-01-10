package com.iot.iot.entities;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="field")
@Entity
public class Field {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ParselNo")
    private String name;

    @Column(name = "time")
    private LocalDateTime date;

    @Column(name="isCheck")
    private boolean isCheck;

    @PrePersist
    protected void onCreate() {
        this.date = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.date = LocalDateTime.now();
    }



    
}
