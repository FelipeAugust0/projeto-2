public class Caminhao extends TransporteTerrestre {
    private String tipoCarga;

    public Caminhao(int numeroEixos, String tipoCombustivel, String tipoCarga) {
        super(numeroEixos, tipoCombustivel);
        this.tipoCarga = tipoCarga;
    }

    public Caminhao(double capacidadeKg, double velocidadeMedia, double distancia, double peso, int numeroEixos,
            String tipoCombustivel, String tipoCarga) {
        super(capacidadeKg, velocidadeMedia, distancia, peso, numeroEixos, tipoCombustivel);
        this.tipoCarga = tipoCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public double calcularFrete(double distancia, double peso) {
        double base = super.calcularFrete(distancia, peso);
        return base * 1.2;
    }

    @Override
    public double calcularPrazoEntrega(double distancia, double velocidadeMedia) {
        return super.calcularPrazoEntrega(distancia, velocidadeMedia);
    }
}