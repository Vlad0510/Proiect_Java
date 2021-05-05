package Citire;

import Proiect.Ceas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireScriereCeas {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public void ReadCeas() {

        ArrayList<Ceas> ceasList = new ArrayList<>();
        String path = "src/main/resources/Ceas.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path)))
        {
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] data = line.split(",");
                ceasList.add(new Ceas(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        for(Ceas i : ceasList) {
            System.out.println(ANSI_GREEN + i + ANSI_RESET);
        }
    }

    public void WriteCeas() {
        String path = "src/main/resources/Ceas.csv";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter csvWriter = new FileWriter(path, true)) {
            csvWriter.append(scanner.nextLine());
            csvWriter.append(",");
            csvWriter.append(scanner.nextLine());
            csvWriter.append(",");
            csvWriter.append(String.valueOf(scanner.nextInt()));
            csvWriter.append(",");
            csvWriter.append(scanner.nextLine());
            csvWriter.append(scanner.nextLine());
            csvWriter.append(",");
            csvWriter.append(scanner.nextLine());
            csvWriter.append("\n");
            csvWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
