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
public class TruckDriver {

    private String dni;

    private String name;

    private String phone;

    private double salary;

    public TruckDriver() {
    }

    public TruckDriver(String dni, String name, String phone, double salary) {
        this.dni = dni;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "TrucDriver{" + "dni=" + dni + ", name=" + name + ", phone=" + phone + ", salary=" + salary + '}';
    }

}
