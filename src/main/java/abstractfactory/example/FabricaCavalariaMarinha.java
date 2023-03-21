package abstractfactory.example;

public class FabricaCavalariaMarinha implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoCavalaria(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaMarinha(); }
}
