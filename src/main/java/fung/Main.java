package main.java.fung;

import main.java.fung.model.*;
import main.java.fung.service.Travel;

public class Main {
    public static void main(String[] args) {
        Transportation selfDriving = new SelfDriving();
        Travel travelBySelfDriving = new Travel(selfDriving);
        boolean seflDrivingAvailability = travelBySelfDriving.isavailability(500);
        Transportation bus = new Bus();
        Travel travelByBus = new Travel(bus);
        boolean busAvailability = travelByBus.isavailability(500);
        Transportation rail = new Rail();
        Travel travelByRail = new Travel(rail);
        boolean railAvailability = travelByRail.isavailability(500);
        Transportation aircraft = new Aircraft();
        Travel travelByAircraft = new Travel(aircraft);
        boolean aircraftAvailability = travelByAircraft.isavailability(500);
    }
}
