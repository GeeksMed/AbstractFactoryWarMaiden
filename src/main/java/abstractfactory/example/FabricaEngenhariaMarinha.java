package abstractfactory.example;

public class FabricaEngenhariaMarinha implements FabricaAbstrata{
    @Override
    public Soldado formacaoSoldado() { return new SoldadoEngenharia(); }
    @Override
    public ForcaArmada designarForcaArmada() { return new ForcaArmadaMarinha(); }
}
