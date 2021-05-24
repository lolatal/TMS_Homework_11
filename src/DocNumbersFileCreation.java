/**
 * Класс, в котором создается новый файл, хранящий список всех номеров документов
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocNumbersFileCreation {
    public static void main(String[] args) {
        System.out.println("Введите путь для создания нового файла");
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        File myFile = new File(pathToFile);

        try (FileWriter fw = new FileWriter(myFile)) {
            fw.write("docnum-23-as-45");
            fw.write("\ndocnum-67-fd-82");
            fw.write("\ncontract-lmtg-5-pit");
            fw.write("\nconkract-a-9-ek");
            fw.write("\ndocnum-uh-07-5l");
            fw.write("\ncontract-1-n-p7");
            fw.write("\ncontract-85-g-3");
            fw.write("\ndecnum-klm-02-f");
            fw.write("\ncentract-3-k4-0");
            fw.write("\ndocnu-kum-02-mf");
            fw.write("\ncontract-6-n-p7");
            fw.write("\ndocnum-klm-02-fdk");

        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        }
    }
}
