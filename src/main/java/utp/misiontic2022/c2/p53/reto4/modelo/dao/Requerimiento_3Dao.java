package utp.misiontic2022.c2.p53.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p53.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p53.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        String query= "select Cargo, Salario from Lider group by Cargo having MAX(Salario)>700000";
        try {
            Statement statement=conexion.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                Requerimiento_3 requerimiento_3=new Requerimiento_3();

                requerimiento_3.setCargo(resultSet.getString("Cargo"));
                requerimiento_3.setMaxSalario(resultSet.getInt("Salario"));

                respuesta.add(requerimiento_3);
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.err.println("Error al consultar el dato del segundo requerimiento");
            e.printStackTrace();
        } finally {
            conexion.close();
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}