package abstractfactory.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class MilitarTeste{
    @Test
    void deveSerSoldadoArtilhariaPertencerForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Forca Aerea", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoCavalariaPertencerForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaCavalariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Forca Aerea", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoEngenhariaPertencerForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaEngenhariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Forca Aerea", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoInfantariaPertencerForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaInfantariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Forca Aerea", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoArtilhariaForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Artilharia", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoCavalariaForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaCavalariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Cavalaria", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoEngenhariaForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaEngenhariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Engenharia", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoInfantariaForcaArmadaAeria(){
        FabricaAbstrata fabricaAbstrata = new FabricaInfantariaAerea();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Infantaria", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoArtilhariaPertencerForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Exercito", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoCavalariaPertencerForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaCavalariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Exercito", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoEngenhariaPertencerForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaEngenhariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Exercito", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoInfantariaPertencerForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaInfantariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Exercito", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoArtilhariaForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Artilharia", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoCavalariaForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaCavalariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Cavalaria", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoEngenhariaForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaEngenhariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Engenharia", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoInfantariaForcaArmadaExercito(){
        FabricaAbstrata fabricaAbstrata = new FabricaInfantariaExercito();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Infantaria", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoArtilhariaPertencerForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Marinha", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoCavalariaPertencerForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaCavalariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Marinha", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoEngenhariaPertencerForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaEngenhariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Marinha", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoInfantariaPertencerForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaInfantariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Marinha", militar.designarForcaArmada());
    }
    @Test
    void deveSerSoldadoArtilhariaForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaArtilhariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Artilharia", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoCavalariaForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaCavalariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Cavalaria", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoEngenhariaForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaEngenhariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Engenharia", militar.formacaoSoldado());
    }
    @Test
    void deveSerSoldadoInfantariaForcaArmadaMarinha(){
        FabricaAbstrata fabricaAbstrata = new FabricaInfantariaMarinha();
        Militar militar = new Militar(fabricaAbstrata);
        assertEquals("Infantaria", militar.formacaoSoldado());
    }
}