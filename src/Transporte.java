public class Transporte {
    private double capacidadeKg;
    private double velocidadeMedia;

    public Transporte() {
    }

    public Transporte(double capacidadeKg, double velocidadeMedia) {
        this.capacidadeKg = capacidadeKg;
        this.velocidadeMedia = velocidadeMedia;
    }

    // Regra padrão: sobrescrever nas subclasses
    public double calcularFrete(double distancia, double peso) {
        return 0.0;
    }

    // Prazo padrão (horas) = distancia / velocidadeMedia
    public double calcularPrazoEntrega(double distancia) {
        if (velocidadeMedia <= 0) return Double.POSITIVE_INFINITY;
        return distancia / velocidadeMedia;
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

    @Override
    public String toString() {
        return String.format("Transporte[capacidadeKg=%.2f, velocidadeMedia=%.2f]", capacidadeKg, velocidadeMedia);
    }
}
