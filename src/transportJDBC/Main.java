/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportJDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import model.City;
import model.Truck;
import model.TruckDriver;
import model.Package;
import persistence.TransportJDBC;

/**
 *
 * @author dam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransportJDBC gestor = new TransportJDBC();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //COnexion a la base de datos
            System.out.println("Estableciendo conexión con la bbdd...");
            gestor.connect();
            System.out.println("Conectado a la bbdd de players(Transport)");
            TruckDriver p = new TruckDriver("47112440E", "XAVI", "938053052", 10.3);
            City c = new City("08700", "BCN");
            Truck t = new Truck("CMAION", 120, p);
            Package pc = new Package("XAVI", p, c);

            //1
            gestor.insertPackage(pc);
            System.out.println("Package insertado");

            //2
            gestor.insertTruck(t);
            System.out.println("Camión insertado");

            //3
            System.out.println("CAMIONES CONDUCTOR DADO");
            gestor.selectTruckByTruckDriver(p);

            //4
            System.out.println("MODIFY SALARY TRUCKDRIVER");
            gestor.UpdateSalary(p);

            //5
            System.out.println("LISTA POR CIUDAD");
            gestor.packageByCity("BCN");

            //6
            System.out.println("NOMBRE Y Nº ENVIOS ");
            gestor.packageByCity("BCN");

            gestor.disconnect();
            System.out.println("Cerrada la conexión con la bbdd.");
        } catch (SQLException ex) {
            System.out.println("Error con la BBDD: " + ex.getCause());
        }

    }
}
