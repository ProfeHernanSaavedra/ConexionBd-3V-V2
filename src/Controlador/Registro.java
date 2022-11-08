package Controlador;

import Modelo.Carrera;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USRVI-LC2
 */
public class Registro {

    public boolean agregarCarrera(Carrera carrera) {

        try {
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            //String query = "Insert into carrera (idCarrera,nombre) values (?,?)";
            String query = "Insert into carrera (nombre) values (?)";
            PreparedStatement stmt = conx.prepareStatement(query);
            //stmt.setInt(1, carrera.getIdCarrera());
            stmt.setString(1, carrera.getNombre());

            stmt.executeUpdate();
            stmt.close();
            conx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error de SQL al ingresar carrera " + e.getMessage());
            return false;
        }

    }

    public boolean eliminar(String nombre) {
        try {
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            String query = "DELETE FROM carrera where nombre = ?";
            PreparedStatement stmt = conx.prepareStatement(query);

            stmt.setString(1, nombre);

            int op = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?", "Eliminar", 1);
            System.out.println(op);
            if (op == 0) {
                stmt.executeUpdate();
                stmt.close();
                conx.close();

                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            System.out.println("Error de SQL al ingresar carrera " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(Carrera carrera) {
        try {
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            String query = "UPDATE carrera set nombre = ? where nombre = ?";
            PreparedStatement stmt = conx.prepareStatement(query);

            stmt.setString(1, carrera.getNombre());
            stmt.setString(2, carrera.getNombre());

            stmt.executeUpdate();
            stmt.close();
            conx.close();

            return true;
        } catch (SQLException e) {

            System.out.println("Error de SQL al actualizar carrera " + e.getMessage());
            return false;
        }
    }

    public List<Carrera> buscarTodos() {

        List<Carrera> lista = new ArrayList<>();

        try {
            Conexion con = new Conexion();
            Connection conx = con.obtenerConexion();

            String query = "SELECT * FROM carrera order by idCarrera";
            PreparedStatement stmt = conx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Carrera carrera = new Carrera();
                carrera.setIdCarrera(rs.getInt("idCarrera")); //debe ser igual que los campos de la BD
                carrera.setNombre(rs.getString("nombre"));

                lista.add(carrera);
            }
            rs.close();
            stmt.close();
            conx.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL al listar carreras " + e.getMessage());
        }
        return lista;

    }

}
