public class AviaoCarga extends TransporteAereo {
    private double autonomiaHoras;

    public AviaoCarga(double altitudeMax, double taxaSeguranca, double autonomiaHoras) {
        super(altitudeMax, taxaSeguranca);
        this.autonomiaHoras = autonomiaHoras;
    }

    public AviaoCarga(double capacidadeKg, double velocidadeMedia, double distancia, double peso, double altitudeMax,
            double taxaSeguranca, double autonomiaHoras) {
        super(capacidadeKg, velocidadeMedia, distancia, peso, altitudeMax, taxaSeguranca);
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

    @Override
    public double calcularPrazoEntrega(double distancia, double velocidadeMedia) {
        return super.calcularPrazoEntrega(distancia, velocidadeMedia);
    }
}
