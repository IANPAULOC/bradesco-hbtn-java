public class Empregado {

    private final double salarioFixo;
    private double bonificacao;

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
    public double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            setBonificacao(getSalarioFixo() * 0.1);
            return getBonificacao();
        }else{
            return 0;
        }
    }

    public double calcularSalarioTotal(Departamento departamento) {
            return getSalarioFixo() + calcularBonus(departamento);

        }



}
