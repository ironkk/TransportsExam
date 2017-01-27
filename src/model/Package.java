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
public class Package {

    private String customer;

    private TruckDriver driver;

    private City city;

    public Package() {
    }

    public Package(String customer, TruckDriver driver, City city) {
        this.customer = customer;
        this.driver = driver;
        this.city = city;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public TruckDriver getDriver() {
        return driver;
    }

    public void setDriver(TruckDriver driver) {
        this.driver = driver;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Package{" + "customer=" + customer + ", driver=" + driver + ", city=" + city + '}';
    }

}
