package Licitatii.repository;

import Licitatii.Config.SqlConfig;
import Licitatii.Produse.Produs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdusRepository {
    public static void insertProdus(Produs produs) {
        String sql = "INSERT INTO `produs` (`produs_id`, `inceperea_licitatiei`, `sfarsitul_licitatiei`, `pretul_estimativ`, `anul_fabricarii`)\n" +
                "\tVALUES (?,?,?,?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, produs.getProdus_id());
            preparedStatement.setString(2, produs.getInceperea_licitatiei());
            preparedStatement.setString(3, produs.getSfarsitul_licitatiei());
            preparedStatement.setString(4, produs.getPret_estimativ());
            preparedStatement.setInt(5, produs.getAnul_fabricarii());

            preparedStatement.executeUpdate();
            System.out.println("A fost inserat obiectul : " + produs.getProdus_id());
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println("ERROR");
        }
    }
}
