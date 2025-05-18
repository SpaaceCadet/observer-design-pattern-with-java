package Concrete_observers;

import Concrete_Subject.Weatherstation;
import Intefaces_observer.Observer;

import java.util.Date;

public class PhoneDisplay implements Observer {

    Weatherstation weather_station;


    public PhoneDisplay(Weatherstation weather_station) {
        this.weather_station = weather_station;
        weather_station.attach(this);

    }

    public void update(Double temperature){
        Date date_object = new Date();
        System.out.println("Phone notification : " + date_object.toString() + " Actual temperature now : "+temperature.toString());
    }

}
