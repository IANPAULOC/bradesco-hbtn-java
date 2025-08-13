public class PersonagemGame{

    private String nome;
    private int saudeAtual;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!(nome == null || nome.isEmpty())){
            this.nome = nome;
        }

    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0){
            status = "vivo";
        }
        if (this.saudeAtual == 0){
            status = "morto";
        }

    }

    public void tomarDano (int quantidadeDeDano){
        if (getSaudeAtual() - quantidadeDeDano <= 0){
            setSaudeAtual(0);
        }else {
            setSaudeAtual(saudeAtual - quantidadeDeDano);
        }
    }

    public void receberCura (int quantidadeDeCura){
        if (getSaudeAtual() + quantidadeDeCura >= 100){
            setSaudeAtual(100);
        }else {
            setSaudeAtual(saudeAtual + quantidadeDeCura);
        }
    }

}

