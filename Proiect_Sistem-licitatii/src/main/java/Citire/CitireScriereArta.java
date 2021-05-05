package Citire;

import Proiect.Arta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireScriereArta {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public void ReadArta(){

        ArrayList<Arta> artaList = new ArrayList<>();
        String path = "src/main/resources/Arta.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path)))
        {
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] data = line.split(",");
                artaList.add(new Arta(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4], (data[5])));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        for(Arta i : artaList) {
            System.out.println(ANSI_RED + i + ANSI_RESET);
        }
    }

    public void WriteArta() {
        String path = "src/main/resources/Arta.csv";
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
            csvWriter.append(",");
            csvWriter.append(scanner.nextLine());
            csvWriter.append("\n");
            csvWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
