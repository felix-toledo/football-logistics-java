package FootballGame;

public class Entrada {
    private String name;
    private Partido partido;
    private int price;

    public Entrada(Partido partido, String name, int price){
        setPartido(partido);
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        String string = "[Entrada] Partido " + getPartido().getLocal().getAbreviatura() + " vs. " + getPartido().getVisitante().getAbreviatura() + " el " + getPartido().getFechaFormateada();
        return string;
    }

    public boolean esVip(){
        return this instanceof EntradaVip;
    }
}
