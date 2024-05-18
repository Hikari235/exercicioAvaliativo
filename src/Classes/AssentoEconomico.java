package Classes;

public class AssentoEconomico extends Assento {
    
    public AssentoEconomico(int numeroDaPoltrona, int linha, int coluna, double preço) {
        super(numeroDaPoltrona, linha, coluna, preço);
    }

    @Override
    public void setTipoReserva() {
        super.setTipoReserva(1);
    }
}