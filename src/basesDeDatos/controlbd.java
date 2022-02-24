package basesDeDatos;

import java.sql.*;

/**
 *
 * @author JazBass
 */
//Clase para controlar los métodos principales de la aplicacion
public class controlbd {

    private Connection conexion;
    private String ultimoError;

    public String obtenerMensajeError() {
        return ultimoError;
    }

    public boolean altaContacto(String dni, String nombre, String apellidos, String direccion,
            String telefono, String correo, int edad, String poblacion, String provincia) {
        boolean result = true;
        //Se prepara la instruccion SQL
        String comando = "INSERT INTO DatosAgenda VALUES"
                + "('" + dni + "',"
                + "'" + nombre + "',"
                + "'" + apellidos + "',"
                + "'" + direccion + "',"
                + "'" + telefono + "',"
                + "'" + correo + "',"
                + edad + ","
                + "'" + poblacion + "',"
                + "'" + provincia + "')";
        // Se crea el objeto Statement con la conexión y se ejcuta la instrucción SQL 
        Statement select;
        try {
            select = conexion.createStatement();//Conectamos
            select.execute(comando);//Ejecutamos el comando
        } catch (SQLException e) {
            ultimoError = e.getMessage();
            result = false;
        }
        return result;
    }

    public void crearTabla() {
        //Creamos tabla SQL
        try {
            String comando = "CREATE TABLE IF NOT EXISTS DatosAgenda (dni varchar(10) PRIMARY KEY,";
            comando += "Nombre varchar(20), Apellidos varchar(30),";
            comando += "Direccion varchar(30), Telefono varchar(10),";
            comando += "Correo varchar(20), Edad smallint, Poblacion varchar(20),";
            comando += "Provincia varchar(20))";
            Statement select = conexion.createStatement();
            select.execute(comando);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarTabla() {
        //Método creado solo para el inicio de la aplicación
        try {
            String comando = "DROP TABLE DatosAgenda";
            Statement select = conexion.createStatement();
            select.execute(comando);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void conectar(String dataBase) {
        try {
            //Realizamos la conexión al servidor local MySQL
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + dataBase + "?serverTimezone=UTC", "usuario", "contraseña"); // Esecificar usuario y contraseña de la bbdd
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int bajaContacto(String campo, String valor) {
        int result;
        //Creamos la condición para eliminar el contacto
        String comando = "DELETE FROM DatosAgenda WHERE "
                + campo + "='" + valor + "'";
        //Creamos el objeto statement con la conexión y se ejecuta en SQL
        Statement select;
        try {
            select = conexion.createStatement();
            //Almacenamos la cantidad de filas afectadas con el comando
            result = select.executeUpdate(comando);
            //Si no encuentra el registro devuelve 0
            if (result == 0) {
                ultimoError = "Registro no encontrado";
            }
        } catch (SQLException e) {
            ultimoError = e.getMessage();
            result = 0;
        }
        return result;
    }

    public ResultSet consulta(String campo, String valor) {
        //Creamos la condición SQL
        String comando = "SELECT * FROM DatosAgenda WHERE " + campo + "=";
        if (campo.compareTo("edad") == 0) {
            comando += valor;
        } else {
            comando += "'" + valor + "'";
        }
        Statement select;
        try {
            select = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            select.executeQuery(comando);
            return select.getResultSet();
        } catch (SQLException e) {
            return null;
        }
    }

    public int modificaContacto(String valor[]) {
        int result = 0;
        //Creamos la condicion
        String comando = "UPDATE DatosAgenda SET "
                + "dni='" + valor[0] + "',"
                + "nombre='" + valor[1] + "',"
                + "apellidos='" + valor[2] + "',"
                + "edad=" + valor[3] + ","
                + "direccion='" + valor[4] + "',"
                + "poblacion='" + valor[5] + "',"
                + "provincia='" + valor[6] + "',"
                + "telefono='" + valor[7] + "',"
                + "correo='" + valor[8] + "' "
                + "WHERE dni='" + valor[9] + "'";
        //Objeto Statement con la conexion y se ejecuta la instruccion SQL
        Statement select;
        try {
            select = conexion.createStatement();
            result = select.executeUpdate(comando);
        } catch (SQLException e) {
            ultimoError = e.getMessage();
            result = 0;
        }
        return result;
    }

    public void cierre() throws SQLException {
        conexion.close();
    }
}
