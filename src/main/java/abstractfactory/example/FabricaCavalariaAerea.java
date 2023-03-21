package abstractfactory.example;

public class FabricaCavalariaAerea implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoCavalaria(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaAerea(); }
}
