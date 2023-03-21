package abstractfactory.example;

public class FabricaInfantariaMarinha implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoInfantaria(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaMarinha(); }
}
