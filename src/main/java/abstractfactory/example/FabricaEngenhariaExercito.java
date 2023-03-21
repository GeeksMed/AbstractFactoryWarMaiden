package abstractfactory.example;

public class FabricaEngenhariaExercito implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoEngenharia(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaExercito(); }
}
