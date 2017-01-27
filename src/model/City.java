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
public class City {

    private String postalcode;

    private String name;

    public City() {
    }

    public City(String postalcode, String name) {
        this.postalcode = postalcode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "City{" + "postalcode=" + postalcode + ", name=" + name + '}';
    }

}
