package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Tiket;
import com.zerofiltre.parkingbot.model.Vehicul;
import com.zerofiltre.parkingbot.service.ParkingService;

public class ParkingBot {


  /**
   * Ceci est la méthode Main
   *
   * @param args : Tableau de données entrées lors du lancement de l'application
   */
  public static void main(String[] args) {
   getTiket();
  }

  private static void getTiket() {
    Vehicul vehicul = new Vehicul();
    vehicul.setRegistrationNumber("LS-324-PM");
    vehicul.setCategory("CITADINE");
    ParkingService ParkingService = new ParkingService();
    Tiket tiket = ParkingService.processIncommingVehicul(vehicul);
    System.out.println(tiket);
  }
  
}
