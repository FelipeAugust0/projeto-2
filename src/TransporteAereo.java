public class TransporteAereo extends Transporte {
    private double altitudeMax;
    private double taxaSeguranca; // usar conforme enunciado (ex.: 150)

    public TransporteAereo(double capacidadeKg, double velocidadeMedia, double altitudeMax, double taxaSeguranca) {
        super(capacidadeKg, velocidadeMedia);
        this.altitudeMax = altitudeMax;
        this.taxaSeguranca = taxaSeguranca;
    }

    // Regra do enunciado:
    // frete = (distancia * 0.80) + (peso * 0.30) + taxaSeguranca
    @Override
    public double calcularFrete(double distancia, double peso) {
        return (distancia * 0.80) + (peso * 0.30) + taxaSeguranca;
    }

    public double getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(double altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public double getTaxaSeguranca() {
        return taxaSeguranca;
    }

    public void setTaxaSeguranca(double taxaSeguranca) {
        this.taxaSeguranca = taxaSeguranca;
    }
}

