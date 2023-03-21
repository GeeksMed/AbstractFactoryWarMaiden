package abstractfactory.example;

public class FabricaInfantariaExercito implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoInfantaria(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaExercito(); }
}
