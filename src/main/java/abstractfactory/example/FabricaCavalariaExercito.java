package abstractfactory.example;

public class FabricaCavalariaExercito implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoCavalaria(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaExercito(); }
}
