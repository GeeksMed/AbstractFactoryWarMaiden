package abstractfactory.example;

public class FabricaArtilhariaAerea implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoArtilharia(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaAerea(); }
}
