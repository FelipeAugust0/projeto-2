public class Transporte {
    private double capacidadeKg;
    private double velocidadeMedia;
    private double distancia;
    private double peso; 

    public Transporte() {
    }

    public Transporte(double capacidadeKg, double velocidadeMedia, double distancia, double peso) {
        this.capacidadeKg = capacidadeKg;
        this.velocidadeMedia = velocidadeMedia;
        this.distancia = distancia;
        this.peso = peso;
    }
    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(double capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public double calcularPrazoEntrega(double distancia){
        return distancia / this.velocidadeMedia;
    }
}

