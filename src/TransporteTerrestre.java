public class TransporteTerrestre extends Transporte {
    private int numeroEixos;
    private String tipoCombustivel;

    public TransporteTerrestre(double capacidadeKg, double velocidadeMedia, int numeroEixos, String tipoCombustivel) {
        super(capacidadeKg, velocidadeMedia);
        this.numeroEixos = numeroEixos;
        this.tipoCombustivel = tipoCombustivel;
    }
    @Override
    public double calcularFrete(double distancia, double peso) {
        return (distancia * 0.50) + (peso * 0.10);
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
