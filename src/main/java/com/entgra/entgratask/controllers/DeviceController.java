package com.entgra.entgratask.controllers;

import com.entgra.entgratask.entities.Device;
import com.entgra.entgratask.services.DeviceService;
import com.entgra.entgratask.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @PostMapping("/add")
    public ResponseEntity<Object> addDevice(@RequestBody Device device) {
        try {
            return ResponseHandler.generateResponse("Successfully device added!", HttpStatus.OK, deviceService.addDevice(device));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getDevice(@PathVariable int id) {
        try {
            return ResponseHandler.generateResponse("Successfully data retrieved!", HttpStatus.OK, deviceService.getDevice(id));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDevice(@PathVariable int id) {
        try {
            return ResponseHandler.generateResponse("Successfully device removed!", HttpStatus.OK, deviceService.deleteDevice(id));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Object> updateDevice(@Valid @RequestBody Device device) {
        try {
            if(device.getId() <= 0) {
                return ResponseHandler.generateResponse("Id can't empty", HttpStatus.OK, null);
            }else {
                return ResponseHandler.generateResponse("Successfully device updated!", HttpStatus.OK, deviceService.updateDevice(device));
            }
        } catch (Exception e) {
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }
}
