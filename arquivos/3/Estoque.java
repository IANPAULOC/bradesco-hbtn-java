import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class Estoque {

    String path;

    public Estoque(String path) {
        this.path = path;
    }


    public void adicionarProduto(String nome, int quantidade, double preco) {
    }

    public void excluirProduto(int idExcluir) {
    }

    public void exibirEstoque() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            while(true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                String[] separacao = line.toString().split(",");
                String id = separacao[0];
                String nome = separacao[1];
                String quantidade = separacao[2];
                String preco = separacao[3];
                System.out.println("Id: " + id );
                System.out.println("Nome: " + nome );
                System.out.println("Quantidade: " + quantidade );
                System.out.println("Preço: " + preco );
            }
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
    }
}
