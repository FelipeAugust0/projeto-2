public class Transporte {
    private double capacidadeKg;
    private double velocidadeMedia;
    protected double distancia;
    protected double peso; 

    public Transporte() {
    }

    public Transporte(double capacidadeKg, double velocidadeMedia) {
        this.capacidadeKg = capacidadeKg;
        this.velocidadeMedia = velocidadeMedia;
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

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
