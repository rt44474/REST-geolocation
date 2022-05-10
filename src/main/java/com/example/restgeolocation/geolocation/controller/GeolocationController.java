package com.example.restgeolocation.geolocation.controller;

import com.example.restgeolocation.geolocation.entity.Geolocation;
import com.example.restgeolocation.geolocation.service.GeolocationServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/geolocation"})
public class GeolocationController {

    @Autowired
    private GeolocationServiceI geolocationServiceI;

    @GetMapping
    public ResponseEntity<List<Geolocation>> getAll(){
        return ResponseEntity.ok(geolocationServiceI
            .getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Geolocation> getById(@PathVariable Long id){
        return ResponseEntity.ok(geolocationServiceI
            .getById(id));
    }

    @GetMapping("/byDeviceId/{deviceId}")
    public ResponseEntity<List<Geolocation>> getByDeviceId(@PathVariable String deviceId){
        return ResponseEntity.ok(geolocationServiceI
            .getByDeviceId(deviceId));
    }


    @PostMapping
    public ResponseEntity<Geolocation> save(@RequestBody Geolocation geolocation){
        return ResponseEntity.ok(geolocationServiceI
            .save(geolocation));
    }


}
