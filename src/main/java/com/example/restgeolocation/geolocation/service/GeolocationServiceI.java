package com.example.restgeolocation.geolocation.service;

import com.example.restgeolocation.geolocation.entity.Geolocation;

import java.util.List;

public interface GeolocationServiceI {
    List<Geolocation> getAll();
    Geolocation getById(Long id);
    List<Geolocation> getByDeviceId(String deviceId);
    Geolocation save(Geolocation geolocation);
}
