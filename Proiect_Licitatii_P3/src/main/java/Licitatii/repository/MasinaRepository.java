package Licitatii.repository;

import Licitatii.Config.SqlConfig;
import Licitatii.Produse.Masina;
import Licitatii.Produse.Produs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MasinaRepository {

    public static void insertMasina(Masina masina) {
        String sql = "INSERT INTO `masina` (`masina_id`, `model`, `culoare`, `motor`, `produs_id`) VALUES (?,?,?,?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ProdusRepository.insertProdus(
                    new Produs(masina.getProdus_id(), masina.getInceperea_licitatiei(), masina.getInceperea_licitatiei(), masina.getSfarsitul_licitatiei(), masina.getAnul_fabricarii())
            );

            preparedStatement.setInt(1, masina.getMasina_id());
            preparedStatement.setString(2, masina.getModel());
            preparedStatement.setString(3, masina.getCuloare());
            preparedStatement.setDouble(4, masina.getMotor());
            preparedStatement.setInt(5, masina.getProdus_id());

            preparedStatement.executeUpdate();
            System.out.println("Masina a fost adaugata");
        }catch (SQLException exception) {
            System.err.println("Nu se poate insera in tabel");
        }
    }

    public static void updateMasinaCuloareById(String newCuloare, int id) {
        String sql = "UPDATE `masina` m INNER JOIN `produs` p ON\n" +
                "p.`produs_id` = m.`produs_id`\n" +
                "SET m.`culoare` = ? \n" +
                "WHERE `masina_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newCuloare);
            statement.setInt(2, id);
            statement.executeUpdate();

            System.out.println("Culoarea masinii cu id-ul " + id + " a fost schimbata");
        }catch (SQLException exception) {
            System.err.println("Nu s-a putut schimba culoarea masinii " + id);
        }
    }

    public static void deleteMasinaById(int id) {
        String sql = "DELETE FROM `masina` WHERE `masina_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Masina cu id-ul " + id + " a fost stearsa");
        }catch (SQLException exception) {
            System.err.println("Masina nu a putut fi stearsa");
        }
    }
}
