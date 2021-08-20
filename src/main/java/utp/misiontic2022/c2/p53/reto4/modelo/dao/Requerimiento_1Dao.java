package utp.misiontic2022.c2.p53.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p53.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p53.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta="select Constructora, Ciudad, Banco_Vinculado, Porcentaje_Cuota_Inicial, Clasificacion, Fecha_Inicio from Proyecto where Ciudad =='Pereira'";
        try {
            // Recorrer los registros en los VO específicos
            Statement statement=conexion.createStatement();
            ResultSet resultados=statement.executeQuery(consulta);
            while(resultados.next()){
                Requerimiento_1 requerimiento_1=new Requerimiento_1();

                requerimiento_1.setConstructora(resultados.getString("Constructora"));
                requerimiento_1.setCiudad(resultados.getString("Ciudad"));
                requerimiento_1.setBanco(resultados.getString("Banco_Vinculado"));
                requerimiento_1.setPorcentaje(resultados.getDouble("Porcentaje_Cuota_Inicial"));
                requerimiento_1.setClasificacion(resultados.getString("Clasificacion"));
                requerimiento_1.setFecha(resultados.getString("Fecha_Inicio"));

                respuesta.add(requerimiento_1);

            }

            statement.close();
            resultados.close();

        } catch (SQLException e) {
            System.err.println("Error al consultar el dato del primer requerimiento");
            e.printStackTrace();
        } finally {
            if(conexion!=null)
                conexion.close();
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}