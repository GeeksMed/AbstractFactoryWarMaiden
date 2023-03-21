package abstractfactory.example;

public class Militar {
    private Soldado soldado;
    private ForcaArmada forcaArmada;

    public Militar (FabricaAbstrata fabricaAbstrata){
        this.soldado = fabricaAbstrata.formacaoSoldado();
        this.forcaArmada = fabricaAbstrata.designarForcaArmada();
    }

    public String formacaoSoldado(){return this.soldado.formacaoSoldado();}
    public String designarForcaArmada(){return this.forcaArmada.designarForcaArmada();}
}
