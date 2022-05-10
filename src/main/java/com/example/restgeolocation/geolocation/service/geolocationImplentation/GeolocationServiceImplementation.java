package com.example.restgeolocation.geolocation.service.geolocationImplentation;

import com.example.restgeolocation.geolocation.entity.Geolocation;
import com.example.restgeolocation.geolocation.repository.GeolocationRepositoryI;
import com.example.restgeolocation.geolocation.service.GeolocationServiceI;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GeolocationServiceImplementation implements GeolocationServiceI {

    @Autowired
    private GeolocationRepositoryI geolocationRepositoryI;


    @Override
    public List<Geolocation> getAll() {
        return geolocationRepositoryI.findAll();
    }

    @Override
    public Geolocation getById(Long id) {
        Optional<Geolocation> geolocationOptional = this.geolocationRepositoryI.findById(id);
        return geolocationOptional.get();
    }

    @Override
    public List<Geolocation> getByDeviceId(String deviceId) {
        return this.geolocationRepositoryI.findByDeviceId(deviceId);
    }

    @Override
    public Geolocation save(Geolocation geolocation) {
        return this.geolocationRepositoryI.save(geolocation);
    }
}
