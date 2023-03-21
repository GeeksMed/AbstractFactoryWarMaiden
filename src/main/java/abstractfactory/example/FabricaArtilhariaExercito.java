package abstractfactory.example;

public class FabricaArtilhariaExercito implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoArtilharia(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaExercito(); }
}
