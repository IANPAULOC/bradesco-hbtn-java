import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            System.out.println("Conteúdo do arquivo 'exemplo.txt':\n");
            String lines;
            while ((lines = bufferedReader.readLine()) != null){
                System.out.println(lines);
            }
            System.out.println("\nLeitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }

    }
}