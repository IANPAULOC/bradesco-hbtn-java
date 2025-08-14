public class Gerente extends Empregado {


    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            setBonificacao(getSalarioFixo() * 0.2 +
                    ((departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01));
            return getBonificacao();
        } else {
            return 0;
        }
    }
}
