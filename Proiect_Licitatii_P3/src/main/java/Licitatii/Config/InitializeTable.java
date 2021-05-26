package Licitatii.Config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InitializeTable {

    public static void setUpDb() {
        List<String> SQLTables = new ArrayList<>();

        // PRODUS

        SQLTables.add("create table if not exists produs\n" +
                "(\n" +
                "\tprodus_id int not null,\n" +
                "    inceperea_licitatiei datetime not null,\n" +
                "    sfarsitul_licitatiei datetime not null,\n" +
                "    pretul_estimativ varchar(45) not null,\n" +
                "    anul_fabricarii int not null,\n" +
                "    primary key (produs_id)\n" +
                ");");

        // ARTA

        SQLTables.add("create table if not exists arta\n" +
                "(\n" +
                "\tarta_id int not null,\n" +
                "    tipul_obiectului varchar(45) not null,\n" +
                "    nume varchar(45) not null,\n" +
                "    autor varchar(45) not null,\n" +
                "    produs_id int not null,\n" +
                "    primary key (arta_id),\n" +
                "    foreign key (produs_id) references produs(produs_id) on delete cascade\n" +
                ");");

        // CEAS

        SQLTables.add("create table if not exists ceas\n" +
                "(\n" +
                "\tceas_id int not null,\n" +
                "    model varchar(45) not null,\n" +
                "    firma varchar(45) not null,\n" +
                "    produs_id int not null,\n" +
                "    primary key (ceas_id),\n" +
                "    foreign key (produs_id) references produs(produs_id) on delete cascade\n" +
                ");");

        // IMOBIL

        SQLTables.add("create table if not exists imobil\n" +
                "(\n" +
                "\timobil_id int not null,\n" +
                "    tip_imobil varchar(45) not null,\n" +
                "    zona varchar(45) not null,\n" +
                "    produs_id int not null,\n" +
                "    primary key (imobil_id),\n" +
                "    foreign key (produs_id) references produs(produs_id) on delete cascade\n" +
                ");");

        // MASINA

        SQLTables.add("create table if not exists masina\n" +
                "(\n" +
                "\tmasina_id int not null,\n" +
                "    model varchar(45) not null,\n" +
                "    culoare varchar(45) not null,\n" +
                "    produs_id int not null,\n" +
                "    motor double not null,\n" +
                "    primary key (masina_id),\n" +
                "    foreign key (produs_id) references produs(produs_id) on delete cascade\n" +
                ");");

        // MOBILA

        SQLTables.add("create table if not exists mobila\n" +
                "(\n" +
                "\tmobila_id int not null,\n" +
                "    denumire varchar(45) not null,\n" +
                "    material varchar(45) not null,\n" +
                "    produs_id int not null,\n" +
                "    primary key (mobila_id),\n" +
                "    foreign key (produs_id) references produs(produs_id) on delete cascade\n" +
                ");");

        Connection dataBaseConnection = SqlConfig.getDataBaseConnection();

        for(String table : SQLTables) {
            try(Statement statement = dataBaseConnection.createStatement()) {
                statement.execute(table);
                System.out.println("Tabelul a fost creat cu succes");
            }catch (SQLException exception) {
                System.out.println("Tabelul nu a putut fi creat\n" + exception.getMessage());
            }
        }
    }
    private InitializeTable() {

    }
}
