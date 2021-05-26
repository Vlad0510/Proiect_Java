package Licitatii.repository;

import Licitatii.Config.SqlConfig;
import Licitatii.Produse.Arta;
import Licitatii.Produse.Produs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArtaRepository {

    public static void insertArta(Arta arta) {
        String sql = "INSERT INTO `arta` (`arta_id`, `tipul_obiectului`, `nume`, `autor`, `produs_id`)\n" +
                "\tVALUES (?,?,?,?,?)";
        Connection connection = SqlConfig.getDataBaseConnection();

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ProdusRepository.insertProdus(
                    new Produs(arta.getProdus_id(), arta.getInceperea_licitatiei(), arta.getInceperea_licitatiei(), arta.getSfarsitul_licitatiei(), arta.getAnul_fabricarii())
            );

            preparedStatement.setInt(1, arta.getArta_id());
            preparedStatement.setString(2, arta.getTipul_obiectului());
            preparedStatement.setString(3, arta.getNume());
            preparedStatement.setString(4, arta.getAutor());
            preparedStatement.setInt(5, arta.getProdus_id());

            preparedStatement.executeUpdate();
            System.out.println("A fost inserat obiectul de arta : " + arta.getProdus_id() + ":" + arta.getArta_id());
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.out.println("ERROR");
        }
    }

    public static void updateArtaAutorById(String newAutor, int id) {
        String sql = "UPDATE `arta` a INNER JOIN `produs` p ON\n" +
                "p.`produs_id` = a.`produs_id`\n" +
                "SET a.`autor` = ? \n" +
                "WHERE `arta_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newAutor);
            statement.setInt(2, id);
            statement.executeUpdate();

            System.out.println("Autorul lucrarii cu id-ul " + id + " a fost schimbat");
        }catch (SQLException exception) {
            System.err.println("Nu s-a putut schimba autorul lucrarii " + id);
        }
    }

    public static void deleteArtaById(int id) {
        String sql = "DELETE FROM `arta` WHERE `arta_id` = ?";
        Connection connection = SqlConfig.getDataBaseConnection();
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Obiectul de arta cu id-ul " + id + " a fost sters");
        }catch (SQLException exception) {
            System.err.println("Obiectul de arta nu a putut fi sters");
        }
    }
}
