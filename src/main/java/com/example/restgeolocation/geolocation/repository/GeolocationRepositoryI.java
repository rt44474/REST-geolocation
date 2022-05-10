package com.example.restgeolocation.geolocation.repository;

import com.example.restgeolocation.geolocation.entity.Geolocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeolocationRepositoryI extends JpaRepository<Geolocation, Long> {
    List<Geolocation> findByDeviceId(String deviceId);
}
