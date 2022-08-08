package com.entgra.entgratask.dao;

import com.entgra.entgratask.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceDAO extends JpaRepository<Device,Integer> {
}
