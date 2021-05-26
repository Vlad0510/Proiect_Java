package Licitatii.repository;

import Licitatii.Config.SqlConfig;
import Licitatii.Produse.Imobil;
import Licitatii.Produse.Produs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImobilRepository {

    public static void insertImobil(Imobil imobil) {
        String sql = "INSERT INTO `imobil` (`imobil_id`, `tip_imobil`, `zona`, `produs_id`) VALUES (?,?,?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ProdusRepository.insertProdus(
                    new Produs(imobil.getProdus_id(), imobil.getInceperea_licitatiei(), imobil.getInceperea_licitatiei(), imobil.getSfarsitul_licitatiei(), imobil.getAnul_fabricarii())
            );

            preparedStatement.setInt(1, imobil.getImobil_id());
            preparedStatement.setString(2, imobil.getTip_imobil());
            preparedStatement.setString(3, imobil.getZona());
            preparedStatement.setInt(4, imobil.getProdus_id());

            preparedStatement.executeUpdate();
            System.out.println("A fost inserat imobilul : " + imobil.getProdus_id() + ":" + imobil.getImobil_id());
        }catch (SQLException exception) {
            System.err.println("Nu se poate insera in tabel");
        }
    }

    public static void updateImobilTipById(String newTip, int id) {
        String sql = "UPDATE `imobil` i INNER JOIN `produs` p ON\n" +
                "p.`produs_id` = i.`produs_id`\n" +
                "SET i.`tip_imobil` = ? \n" +
                "WHERE `imobil_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newTip);
            statement.setInt(2, id);
            statement.executeUpdate();

            System.out.println("Tipul imobilului cu id-ul " + id + " a fost schimbat");
        }catch (SQLException exception) {
            System.err.println("Nu s-a putut schimba tipul imobilului " + id);
        }
    }

    public static void deleteImobilById(int id) {
        String sql = "DELETE FROM `imobil` WHERE `imobil_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Imobilul cu id-ul " + id + " a fost sters");
        }catch (SQLException exception) {
            System.err.println("Imobilul nu a putut fi sters");
        }
    }
}
