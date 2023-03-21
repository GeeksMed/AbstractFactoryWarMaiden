package abstractfactory.example;

public class FabricaInfantariaAerea implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoInfantaria(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaAerea(); }
}
