public class TransporteTerrestre extends Transporte {
    private int numeroEixos;
    private String tipoCombustivel;
    
    public TransporteTerrestre(int numeroEixos, String tipoCombustivel) {
        this.numeroEixos = numeroEixos;
        this.tipoCombustivel = tipoCombustivel;
    }

    public TransporteTerrestre(double capacidadeKg, double velocidadeMedia, double distancia, double peso,
            int numeroEixos, String tipoCombustivel) {
        super(capacidadeKg, velocidadeMedia, distancia, peso);
        this.numeroEixos = numeroEixos;
        this.tipoCombustivel = tipoCombustivel;
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

    public double calcularFrete(double distancia, double peso) {
        return (distancia * 0.50) + (peso * 0.10);
    }

    public double calcularPrazoEntrega(double distancia, double velocidadeMedia){
        return distancia / velocidadeMedia;
    }
}
