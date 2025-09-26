public class AviaoCarga extends TransporteAereo {
    private double autonomiaHoras;

    public AviaoCarga(double capacidadeKg, double velocidadeMedia, double altitudeMax, double taxaSeguranca, double autonomiaHoras) {
        super(capacidadeKg, velocidadeMedia, altitudeMax, taxaSeguranca);
        this.autonomiaHoras = autonomiaHoras;
    }

    public double getAutonomiaHoras() {
        return autonomiaHoras;
    }

    public void setAutonomiaHoras(double autonomiaHoras) {
        this.autonomiaHoras = autonomiaHoras;
    }

    @Override
    public double calcularFrete(double distancia, double peso) {
        double base = super.calcularFrete(distancia, peso);
        return base * 1.10;
    }
}
