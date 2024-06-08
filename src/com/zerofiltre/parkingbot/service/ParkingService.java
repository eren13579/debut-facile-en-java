package com.zerofiltre.parkingbot.service;

import java.util.Date;

import com.zerofiltre.parkingbot.model.Tiket;
import com.zerofiltre.parkingbot.model.Vehicul;

public class ParkingService {
    public Tiket processIncommingVehicul(Vehicul vehicul){
        Tiket tiket = new Tiket();
        Date now = new Date();
        tiket.setEntringTime(now);
        tiket.setVehicul(vehicul);
        return tiket;
    }
}

