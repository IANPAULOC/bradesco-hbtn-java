import java.io.*;


public class Estoque {

    String path;
    int id;

    public Estoque(String path) {
        this.path = path;
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String[] pegaId = null;
            int id = 0;
            while (true){
                String line = bufferedReader.readLine();
                if (line != null){
                    pegaId = line.split(",");
                    id =  Integer.parseInt(pegaId[0]);
                }else {
                    acrescentaId(id);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path , true))) {
            bufferedWriter.write("\n" + id + "," + nome + "," + quantidade + "," + preco);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    private void acrescentaId(int id) {
        this.id = id +1;
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
