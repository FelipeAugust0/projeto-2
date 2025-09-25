public class TransporteTerrestre extends Transporte{
    private String tipoCombustivel;
    private int numeroEixos;
    
    public TransporteTerrestre(Double distancia, Double pesoCarga, Double capacidadePeso, Double velocidadeMedia,
            String tipoCarga, String tipoCombustivel, int numeroEixos, double frete) {
        super(distancia, pesoCarga, capacidadePeso, velocidadeMedia, tipoCarga, frete);
        this.tipoCombustivel = tipoCombustivel;
        this.numeroEixos = numeroEixos;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
}
