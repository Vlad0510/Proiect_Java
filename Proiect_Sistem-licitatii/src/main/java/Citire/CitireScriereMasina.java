package Citire;

import Proiect.Masina;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireScriereMasina {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";


    public void ReadMasina() {
        ArrayList<Masina> masinaList = new ArrayList<>();
        String path = "src/main/resources/Masina.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path)))
        {
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] data = line.split(",");
                masinaList.add(new Masina(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4], Double.parseDouble(data[5]), data[6]));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        for(Masina i : masinaList) {
            System.out.println(ANSI_PURPLE + i + ANSI_RESET);
        }
    }

    public void WriteMasina() {
        String path = "src/main/resources/Masina.csv";
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
                csvWriter.append(String.valueOf(scanner.nextDouble()));
                csvWriter.append(",");
                csvWriter.append(scanner.nextLine());
                csvWriter.append(scanner.nextLine());
                csvWriter.append("\n");
                csvWriter.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
