package FootballGame;

import FootballGame.Interfaces.IImprimible;

public class PantallaLed {
    public String imprimir(IImprimible algoImprimible){
        return algoImprimible.impresion();
    }
}
