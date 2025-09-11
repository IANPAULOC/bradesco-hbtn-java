import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {

        String fileName = "funcionarios.csv"; // Nome do arquivo fixo para leitura

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            while(true){
                String line = bufferedReader.readLine();
                if (line == null){
                    System.out.println("Leitura do arquivo concluída.");
                    break;
                }
                String[] separacao = line.toString().split(",");
                String nome = separacao[0];
                String idade = separacao[1];
                String dep = separacao[2];
                String sal = separacao[3];
                System.out.println("Funcionário: " + nome );
                System.out.println("Idade: " + idade );
                System.out.println("Departamento: " + dep );
                System.out.println("Salarial: " + sal );
                System.out.println("------------------------");
            }


        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }

    }
}
