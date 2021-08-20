package utp.misiontic2022.c2.p53.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p53.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p53.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        String query="select c.Proveedor, p.Constructora, c.Pagado from Compra c join Proyecto p where c.ID_Proyecto ==p.ID_Proyecto  and Proveedor in ('Homecenter','JUMBO') and Pagado == 'Si' and Constructora like '%S.A.%' order by Proveedor";
        try {
            Statement statement=conexion.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                Requerimiento_2 requerimiento_2=new Requerimiento_2();

                requerimiento_2.setProveedor(resultSet.getString("Proveedor"));
                requerimiento_2.setConstructora(resultSet.getString("Constructora"));
                requerimiento_2.setPagado(resultSet.getString("Pagado"));

                respuesta.add(requerimiento_2);
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