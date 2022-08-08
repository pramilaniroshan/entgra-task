package com.entgra.entgratask.services;

import com.entgra.entgratask.dao.DeviceDAO;
import com.entgra.entgratask.entities.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    @Autowired
    private DeviceDAO dao;

    public String addDevice (Device device){
        dao.save(device);
        return "New Device added";
    }
}
