package basesDeDatos;
import java.sql.*;
import com.healthmarketscience.jackcess.Database.FileFormat;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author JazBass
 */
public class controlacceso {
    
    private Connection conexion;
    final String dbPath = "C:/Users/Asus/Documents/Java";//Ruta para el archivo Access
    String nombreDataBase;
    
    public controlacceso(String nombreBase){
        nombreDataBase = nombreBase;
        crearBaseDeDatos();
    }
    private void crearBaseDeDatos(){
        //Creamos un archivo Access para almacenar usuario y contraseña
        File archivo;
        try {
            archivo = new File(dbPath + nombreDataBase);
            if (!archivo.exists()) {
                DatabaseBuilder.create(FileFormat.V2010, archivo);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void conectar(){
        try {
            //Realizamos la conexión al servidor Access
            conexion = DriverManager.getConnection("jdbc:ucanaccess://"+dbPath+nombreDataBase);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void cierre(){
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void crearTabla(){
        //Creamos la tabla
        try {
            String comando = "CREATE TABLE gestores"
                    + " (usuario char, pass char)";
            Statement select = conexion.createStatement();
            select.execute(comando);
            //Instertamos Usuario y contraseña para LogIn
            comando = "INSERT INTO gestores VALUES('gestor1', 'cctg12')";
            select.execute(comando);
        } catch (SQLException e) {
            System.out.println("aa");
            System.out.println(e.getMessage());
        }
    }
    public boolean consulta(String user, String pass){
        //Creamos la condición
        String comando= "SELECT * FROM gestores WHERE usuario ='"+user+"' AND pass ='"+ pass+"'" ;
        Statement select;
        try {
            select= conexion.createStatement();
            ResultSet r = select.executeQuery(comando);
            //Ejecutamos el comando, si encuentra en registro devuelve true
            return r.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
