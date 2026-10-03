package crudproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Dirección de la base de datos (puerto por defecto 3306)
    private static final String URL = "jdbc:mysql://localhost:3306/tienda_senati";
    // Usuario por defecto en XAMPP / MariaDB
    private static final String USUARIO = "root";
    // Contraseña por defecto en XAMPP suele ser vacía
    private static final String CLAVE = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }
}