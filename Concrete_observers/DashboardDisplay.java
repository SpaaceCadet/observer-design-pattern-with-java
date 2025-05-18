package Concrete_observers;

import Concrete_Subject.Weatherstation;
import Interfaces_observer.Observer;

import java.util.Date;

public class DashboardDisplay implements Observer {

    Weatherstation weather_station;

    public DashboardDisplay(Weatherstation weather_station) {
        this.weather_station = weather_station;
        weather_station.attach(this);

    }
    public void update(Double temperature){
        Date date_object = new Date();

        System.out.println("Dashboard notification : " + date_object.toString() + " Actual temperature now : "+temperature.toString());

    }

}
