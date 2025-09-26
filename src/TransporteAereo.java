public class TransporteAereo extends Transporte {
    private double altitudeMax;
    private double taxaSeguranca;


    public TransporteAereo(double altitudeMax, double taxaSeguranca) {
        this.altitudeMax = altitudeMax;
        this.taxaSeguranca = taxaSeguranca;
    }

    public TransporteAereo(double capacidadeKg, double velocidadeMedia, double distancia, double peso,
            double altitudeMax, double taxaSeguranca) {
        super(capacidadeKg, velocidadeMedia, distancia, peso);
        this.altitudeMax = altitudeMax;
        this.taxaSeguranca = taxaSeguranca;
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

    public double calcularFrete(double distancia, double peso) {
        return (distancia * 0.80) + (peso * 0.30) + 150;
    }

    public double calcularPrazoEntrega(double distancia, double velocidadeMedia){
        return distancia / velocidadeMedia;
    }

}

