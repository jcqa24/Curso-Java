import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {

    public static void updateUser(Connection con, int id, String name, String pass){
        // Update users set name = 'name' , pass = 'pass' Where id = 'id'
        String sql = "Update users set name = '"+name+"' , pass = '"+pass+"' Where id = '"+id+"'";
        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate(sql);

            if(result == 1){
                System.out.println("Se modificaron los datos del usuario : "+name);
            }else{
                System.out.println("El usuario con id: "+id+"no existe");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }

    public static void updateUser(Connection con, int id, String value, int opc){
        // Update users set name = 'name' , pass = 'pass' Where id = 'id'

        String sql = "";

        if(opc == 1){
            sql = "Update users set name = '"+value+"' Where id = '"+id+"'";
        }else{
            sql = "Update users set pass = '"+value+"' Where id = '"+id+"'";
        }

        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate(sql);

            if(result == 1){
                System.out.println("Se modificaron los datos del usuario : "+value);
            }else{
                System.out.println("El usuario con id: "+id+"no existe");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }

    public static void deleteUser(Connection con, int id){
        // Delete From users Where id = 'id'
        String sql = "Delete From users Where id = '"+id+"'";
        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate(sql);

            // -> 1 => El usuario se borro
            // != 1 => No se borro
            if(result == 1){
                System.out.println("Se borro al usuario con id "+id);
            }else{
                System.out.println("El usuario con id "+id+" no existe");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertUser(Connection con, String name, String pass){
        String sql = "Insert Into users(name,pass) Values('"+name+"','"+pass+"')";
        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }



    public static void Consulta(Connection con) {
        String sql = "SELECT * FROM users";
        Statement stmt;
        ResultSet rs;
        int id;
        String name,pass;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                pass = rs.getString("pass");

                System.out.println("ID: "+id+" , Name: "+name+" , Pass: "+pass);

            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }

    public static Connection ConectarBD( String bd){
        Connection connection;
        String host = "jdbc:mysql://localhost/";
        String user = "root";
        String pass = "";

        System.out.println("Conectando…");

        try {
            connection = DriverManager.getConnection(host+bd, user,pass);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return  connection;

    }

    public static void Desconeccion(Connection cb){
        try {
            cb.close();
            System.out.println("Desconectando... !!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Connection cb = ConectarBD("pruebas");
        //deleteUser(cb,6);
        Consulta(cb);
        //insertUser(cb,"usuario6","12345678");
        updateUser(cb,6,"NuevoPass123",2);
        System.out.println("=========================");
        Consulta(cb);
        Desconeccion(cb);

    }
}