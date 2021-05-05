package Citire;

import Proiect.Mobila;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CitireScriereMobila {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void ReadMobila() {

        ArrayList<Mobila> mobilaList = new ArrayList<>();
        String path = "src/main/resources/Mobila.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path)))
        {
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] data = line.split(",");
                mobilaList.add(new Mobila(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        for(Mobila i : mobilaList) {
            System.out.println(ANSI_YELLOW + i + ANSI_RESET);
        }
    }

    public void WriteMobila() {
        String path = "src/main/resources/Mobila.csv";
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
