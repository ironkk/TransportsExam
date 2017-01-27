/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dam
 */
public class Truck {

    private String model;

    private int capacity;

    private TruckDriver driver;

    public Truck() {
    }

    public Truck(String model, int capacity, TruckDriver driver) {
        this.model = model;
        this.capacity = capacity;
        this.driver = driver;
    }

    public TruckDriver getDriver() {
        return driver;
    }

    public void setDriver(TruckDriver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Truck{" + "model=" + model + ", capacity=" + capacity + ", driver=" + driver + '}';
    }

}
