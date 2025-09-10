import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName , true))) {
            System.out.println("Digite várias linhas de texto, caso deseje finalizar digite sair");
            String line = scanner.nextLine();
            if (!line.equals(String.valueOf("sair"))){
                bw.write(line + "\n");
                while (!line.equals(String.valueOf("sair"))){
                    System.out.println("Digite várias linhas de texto, caso deseje finalizar digite sair");
                    line = scanner.nextLine();
                    if (!line.equals(String.valueOf("sair"))){
                        bw.write(line + "\n");
                    }else {
                        break;
                    }
                }
            }
        }catch (IOException e){
            e.getMessage();
        }

        scanner.close();
    }
}