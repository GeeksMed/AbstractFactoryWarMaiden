package abstractfactory.example;

public class FabricaEngenhariaAerea implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoEngenharia(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaAerea(); }
}
