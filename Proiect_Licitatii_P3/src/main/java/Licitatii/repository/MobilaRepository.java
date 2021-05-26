package Licitatii.repository;

import Licitatii.Config.SqlConfig;
import Licitatii.Produse.Mobila;
import Licitatii.Produse.Produs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MobilaRepository {

    public static void insertMobila(Mobila mobila) {
        String sql = "INSERT INTO `mobila` (`mobila_id`, `denumire`, `material`, `produs_id`) VALUES (?,?,?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ProdusRepository.insertProdus(
                    new Produs(mobila.getProdus_id(), mobila.getInceperea_licitatiei(), mobila.getInceperea_licitatiei(), mobila.getSfarsitul_licitatiei(), mobila.getAnul_fabricarii())
            );

            preparedStatement.setInt(1, mobila.getMobila_id());
            preparedStatement.setString(2, mobila.getDenumire());
            preparedStatement.setString(3, mobila.getMaterial());
            preparedStatement.setInt(4, mobila.getProdus_id());

            preparedStatement.executeUpdate();
            System.out.println("Mobila a fost adaugata");
        }catch (SQLException exception) {
            System.err.println("Nu se poate insera in tabel");
        }
    }

    public static void updateMobilaMaterialById(String newMaterial, int id) {
        String sql = "UPDATE `mobila` m INNER JOIN `produs` p ON\n" +
                "p.`produs_id` = m.`produs_id`\n" +
                "SET m.`material` = ? \n" +
                "WHERE `mobila_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newMaterial);
            statement.setInt(2, id);
            statement.executeUpdate();

            System.out.println("Materialul mobilei cu id-ul " + id + " a fost schimbata");
        }catch (SQLException exception) {
            System.err.println("Nu s-a putut schimba materialul mobilei " + id);
        }
    }

    public static void deleteMobilaById(int id) {
        String sql = "DELETE FROM `mobila` WHERE `mobila_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Mobila cu id-ul " + id + " a fost stearsa");
        }catch (SQLException exception) {
            System.err.println("Mobila nu a putut fi stearsa");
        }
    }
}
