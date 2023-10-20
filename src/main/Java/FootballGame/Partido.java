package FootballGame;

import java.util.ArrayList;

public class Partido {
     Equipo local;
     Equipo visitante;
     private String nombre;
     private Estadio estadio;
     private ArrayList<TarjetaBase> tarjetas = new ArrayList<>();

     public Partido(Estadio estad, Equipo l, Equipo v, String f){
          setEstadio(estad);
          this.local = l;
          this. visitante = v;
          setName(f + " "+l.getAbreviatura() + "x" + v.getAbreviatura());
     }
     public Partido(Equipo l, Equipo v, String f){
          this.local = l;
          this. visitante = v;
          setName(f + " "+l.getAbreviatura() + "x" + v.getAbreviatura());
     }

     public void agregar(TarjetaBase tarjeta){
          tarjetas.add(tarjeta);
     } public int tarjetasCantidad(){
          return tarjetas.size();
     } 

     public ArrayList<TarjetaBase> getTarjetas() {
          return tarjetas;
     }

     public String getName(){
          return nombre;
     } public void setName(String name){
          this.nombre = name;
     }

     public Estadio getEstadio() {
          return estadio;
     }

     public void setEstadio(Estadio estadio) {
          this.estadio = estadio;
     }
}
