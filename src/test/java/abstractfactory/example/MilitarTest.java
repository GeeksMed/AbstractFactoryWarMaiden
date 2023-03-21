package abstractfactory.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class MilitarTeste{
    @Test
    void deveSerSoldadoForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Forca Aerea", militar.designarForcaArmada());
    }
}