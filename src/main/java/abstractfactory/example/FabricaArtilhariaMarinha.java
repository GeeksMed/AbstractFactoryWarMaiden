package abstractfactory.example;

public class FabricaArtilhariaMarinha implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoArtilharia(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaMarinha(); }
}
