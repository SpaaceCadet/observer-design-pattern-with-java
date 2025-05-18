package Concrete_Subject;

import Interfaces_observer.Observer;
import Interfaces_observer.Subject;

import java.util.ArrayList;

public class Weatherstation implements Subject {

    private double temperature;
    private  ArrayList<Observer> observers;

    public Weatherstation(double temperature) {
        this.temperature = temperature;
        this.observers = new ArrayList<Observer>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        this.observers.add(o);

    }

    @Override
    public void detach(Observer o) {
        this.observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i <  this.observers.size(); i++) {
            Observer observer_item = this.observers.get(i);
            observer_item.update(this.temperature);

        }


    }
}
