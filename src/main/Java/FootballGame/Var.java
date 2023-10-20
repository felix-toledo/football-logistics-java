package FootballGame;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Var {
    private Partido partido;

    public Var(Partido par){
        setPartido(par);
    }

    public int cantidadTarjetasRojas(){
        ArrayList<TarjetaBase> tarjetas = partido.getTarjetas();
        ArrayList<TarjetaBase> tarjetaRoja = tarjetas.stream()
                                                      .filter(tarjeta -> tarjeta instanceof TarjetaRoja)
                                                      .collect(Collectors.toCollection(ArrayList::new));
        return tarjetaRoja.size();
    }

    public int cantidadTarjetasAmarillas(){
        ArrayList<TarjetaBase> tarjetas = partido.getTarjetas();
        ArrayList<TarjetaBase> tarjetasAmarillas = tarjetas.stream()
                .filter(tarjeta -> tarjeta instanceof TarjetaAmarilla)
                .collect(Collectors.toCollection(ArrayList::new));
        return tarjetasAmarillas.size();
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
