import Concrete_Subject.Weatherstation;
import Concrete_observers.DashboardDisplay;
import Concrete_observers.PhoneDisplay;

public class main {




    public static void main(String[] args)
    {
        double temperature = 20;

        System.out.println("Current temperature is : "+temperature);
        Weatherstation weather_station = new Weatherstation(temperature);
        PhoneDisplay my_phone  = new PhoneDisplay(weather_station);
        DashboardDisplay my_dashboard = new DashboardDisplay(weather_station);
        weather_station.setTemperature(40);



    }


}
