package FootballGame;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Var {
    private Partido partido;
    IntegranteDelVar asistenteDeVideo;
    ArrayList<IntegranteDelVar> aVar = new ArrayList<>();

    public Var(Partido par){
        setPartido(par);
    }
    public Var (Partido partido, AsistenteDeVideo asistenteDeVideo, AVAR avar1, AVAR avar2, AVAR avar3) throws Exception {
        setPartido(partido);
        setAsistenteDeVideo(asistenteDeVideo);
        setAVar(avar1);
        setAVar(avar2);
        setAVar(avar3);
    }

    public void setAsistenteDeVideo(IntegranteDelVar asistenteDeVideo) {
        this.asistenteDeVideo = asistenteDeVideo;
    }

    public ArrayList<IntegranteDelVar> getaVar() {
        return aVar;
    }

    public IntegranteDelVar getAsistenteDeVideo() {
        return asistenteDeVideo;
    }

    public int cantidadTarjetasRojas(){
        ArrayList<TarjetaBase> tarjetas = partido.getTarjetas();
        ArrayList<TarjetaBase> tarjetaRoja = tarjetas.stream()
                                                      .filter(tarjeta -> tarjeta instanceof TarjetaRoja)
                                                      .collect(Collectors.toCollection(ArrayList::new));
        return tarjetaRoja.size();
    }

    public void setAVar(IntegranteDelVar integrante) throws Exception {
        if(aVar.size() == 3){
            throw new Exception("No pueden haber mas de dos arbitros");
        } else{
            aVar.add(integrante);
        }
    }

    public int cantidadTarjetasAmarillas(){
        ArrayList<TarjetaBase> tarjetas = partido.getTarjetas();
        ArrayList<TarjetaBase> tarjetasAmarillas = tarjetas.stream()
                .filter(tarjeta -> tarjeta instanceof TarjetaAmarilla)
                .collect(Collectors.toCollection(ArrayList::new));
        return tarjetasAmarillas.size();
    }

    public int cantidadTarjetas(Equipo equipo){
        return cantidadTarjetasAmarillas() + cantidadTarjetasRojas();
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
