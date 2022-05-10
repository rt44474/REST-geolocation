package com.example.restgeolocation.geolocation.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
public class Geolocation implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String deviceId;
    private Long latitude;
    private Long longitude;

}
