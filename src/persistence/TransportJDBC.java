/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.City;
import model.Package;
import model.Truck;
import model.TruckDriver;

/**
 *
 * @author dam
 */
public class TransportJDBC {

    private Connection conexion;

    //connect bbdd
    public void connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/transport";
        String usr = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, usr, pass);
    }

    //disconnect bbdd
    public void disconnect() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

    public void insertPackage(Package s) throws SQLException {
        String insert = "insert into package values (null,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(2, s.getCustomer());
        ps.setString(3, s.getDriver().getName());
        ps.setString(4, s.getCity().getName());
        ps.executeUpdate();
        ps.close();
    }

    public void insertTruck(Truck t) throws SQLException {
        String insert = "insert into truck values (null,?,?,?)";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(2, t.getModel());
        ps.setInt(3, t.getCapacity());
        ps.setString(4, t.getDriver().getName());
        ps.executeUpdate();
        ps.close();
    }

    public void UpdateSalary(TruckDriver t) throws SQLException {
        String update = "update truckdriver set salary=? where name = ?;";
        PreparedStatement ps = conexion.prepareStatement(update);
        ps.setDouble(1, t.getSalary());
        ps.executeUpdate();
        ps.close();
    }

    public List<Truck> selectTruckByTruckDriver(TruckDriver t) throws SQLException {
        List<Truck> trucks = new ArrayList<>();
        String select = "select name from truckdriver where truck= ?";
        PreparedStatement st = conexion.prepareStatement(select);
        st.setString(1, t.getName());
        ResultSet rs = st.executeQuery();

        Truck ts = new Truck();
        TruckDriver td = new TruckDriver();
        while (rs.next()) {

            ts.setDriver(td);

        }
        trucks.add(ts);
        rs.close();
        st.close();
        return trucks;
    }

    public List<Package> packageByCity(String city) throws SQLException {
        List<Package> packages = new ArrayList<>();
        String select = "select SUM(idpackage) from package where city = ?;";
        PreparedStatement st = conexion.prepareStatement(select);
        st.setString(1, city);
        ResultSet rs = st.executeQuery();

        Package p = new Package();
        City c = new City();
        while (rs.next()) {

            p.setCity(c);
        }
        packages.add(p);
        rs.close();
        st.close();
        return packages;
    }

    public String nameEnviosCityGroupByEnvios(String name, Package p) throws SQLException {
        String query = "select nombre, SUM (idpackage) from city, package where idpackage=? and postalcode=? group by ='p'";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);
        while (rs.next()) {

        }
        rs.close();
        return query;

    }

}
