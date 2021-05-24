/**
 * Чтение строк из входного файла и перезапись валидных номеров в один документ, и тех, которые не соответствуют требованиям, в другой
 */

import java.io.*;
import java.util.Scanner;

public class OperationsWithDocumentNumbers {
    public static void main(String[] args) {
        System.out.println("Введите путь к файлу");
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        System.out.println("Введите путь к файлу, который будет содержать валидные номера документов");
        String pathToFileValidNumbers = scanner.nextLine();
        System.out.println("Введите путь к файлу, который будет содержать невалидные номера документов");
        String pathToFileInvalidNumbers = scanner.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(pathToFile));
            FileWriter fw = new FileWriter(pathToFileValidNumbers);
            FileWriter fw1 = new FileWriter(pathToFileInvalidNumbers)) {

            String s;
            while((s = br.readLine()) != null) {
                if ((s.length() == 15) && (s.startsWith("docnum") || s.startsWith("contract"))) {
                    fw.write(s + "\n");
                } else if (s.length() != 15){
                    fw1.write(s + ": Invalid line length \n");
                }else if(!s.startsWith("docnum") || !s.startsWith("contract")){
                    fw1.write(s + ": Invalid start of the document number \n");
                }
            }

            }catch (IOException e) {
            System.out.println("Произошла ошибка");
        }
        scanner.close();

    }
}
