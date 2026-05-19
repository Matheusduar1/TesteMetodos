package orientacaoaobjetos;

public class Emprestimo extends Servicos {
    private double valor;
    private double taxa;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calculaTaxa(){
        return this.valor * 0.1 + super.calculaTaxa();
    }
}
