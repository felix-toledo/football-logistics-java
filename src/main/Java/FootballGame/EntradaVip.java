package FootballGame;

public class EntradaVip extends Entrada{
    public EntradaVip(Partido partido, String name, int price){
        super(partido, name, price);
    }

    @Override
    public String toString(){
        String string = "[Entrada VIP] Partido " + getPartido().getLocal().getAbreviatura() + " vs. " + getPartido().getVisitante().getAbreviatura() + " el " + getPartido().getFechaFormateada();
        return string;
    }


}
