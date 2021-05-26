package Licitatii.repository;

import Licitatii.Config.SqlConfig;
import Licitatii.Produse.Ceas;
import Licitatii.Produse.Produs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CeasRepository {

    public static void insertCeas(Ceas ceas) {
        String sql = "INSERT INTO `ceas` (`ceas_id`, `model`, `firma`, `produs_id`)\n" +
                "\tVALUES (?,?,?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ProdusRepository.insertProdus(
                    new Produs(ceas.getProdus_id(), ceas.getInceperea_licitatiei(), ceas.getInceperea_licitatiei(), ceas.getSfarsitul_licitatiei(), ceas.getAnul_fabricarii())
            );

            preparedStatement.setInt(1, ceas.getCeas_id());
            preparedStatement.setString(2, ceas.getModel());
            preparedStatement.setString(3, ceas.getFirma());
            preparedStatement.setInt(4, ceas.getProdus_id());

            preparedStatement.executeUpdate();
            System.out.println("A fost inserat ceasul : " + ceas.getProdus_id() + ":" + ceas.getCeas_id());
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println("ERROR");
        }
    }

    public static void updateCeasModelById(String newModel, int id) {
        String sql = "UPDATE `ceas` c INNER JOIN `produs` p ON\n" +
                "p.`produs_id` = c.`produs_id`\n" +
                "SET c.`model` = ? \n" +
                "WHERE `ceas_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newModel);
            statement.setInt(2, id);
            statement.executeUpdate();

            System.out.println("Modelul ceasului cu id-ul " + id + " a fost schimbat");
        }catch (SQLException exception) {
            System.err.println("Nu s-a putut schimba modelul ceasului " + id);
        }
    }

    public static void deleteCeasById(int id) {
        String sql = "DELETE FROM `ceas` WHERE `ceas_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Ceasul cu id-ul " + id + " a fost sters");
        }catch (SQLException exception) {
            System.err.println("Ceasul nu a putut fi sters");
        }
    }
}
