public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() throws LivroInvalidoException{
        if ((titulo.length() < 3)){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        return titulo;
    }

    public String getAutor() throws AutorInvalidoException{
        if (!autor.trim().contains(" ") ){
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        return autor;
    }


    public double getPreco() throws LivroInvalidoException{
        if (preco <= 0 ){
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        return preco;
    }

}
