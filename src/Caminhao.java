public class Caminhao extends TransporteTerrestre{
    private String modeloCaminhao;
    private String placa;
    
    public Caminhao(Double distancia, Double pesoCarga, Double capacidadePeso, Double velocidadeMedia, String tipoCarga,
            String tipoCombustivel, int numeroEixos, String modeloCaminhao, String placa, double frete) {
        super(distancia, pesoCarga, capacidadePeso, velocidadeMedia, tipoCarga, tipoCombustivel, numeroEixos, frete);
        this.modeloCaminhao = modeloCaminhao;
        this.placa = placa;
    }
    //alterações

    public String getModeloCaminhao() {
        return modeloCaminhao;
    }

    public void setModeloCaminhao(String modeloCaminhao) {
        this.modeloCaminhao = modeloCaminhao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
