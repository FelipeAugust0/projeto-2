public class Transporte{
    private double distancia;
    private double pesoCarga;
    private double capacidadePeso;
    private double velocidadeMedia;
    private String tipoCarga;
    private double frete;

    public Transporte(Double distancia, Double pesoCarga, Double capacidadePeso, Double velocidadeMedia,
            String tipoCarga, double frete) {
        this.distancia = distancia;
        this.pesoCarga = pesoCarga;
        this.capacidadePeso = capacidadePeso;
        this.velocidadeMedia = velocidadeMedia;
        this.tipoCarga = tipoCarga;
        this.frete = frete;

    }
    public Double getDistancia() {
        return distancia;
    }
    public double getFrete() {
        return frete;
    }
    public void setFrete(double frete) {
        this.frete = frete;
    }
    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
    public Double getPesoCarga() {
        return pesoCarga;
    }
    public void setPesoCarga(Double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
    public Double getCapacidadePeso() {
        return capacidadePeso;
    }
    public void setCapacidadePeso(Double capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }
    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }
    public void setVelocidadeMedia(Double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }
    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public void calcularFrete(Double distancia, Double pesoCarga){
        
    }
}

