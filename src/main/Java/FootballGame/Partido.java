package FootballGame;

import java.util.ArrayList;

public class Partido {
     Equipo local;
     Equipo visitante;
     private String nombre;
     private Estadio estadio;
     private ArrayList<TarjetaBase> tarjetas = new ArrayList<>();

     Arbitro arbitro;
     ArrayList<Arbitro> arbitroLinea = new ArrayList<>();
     Arbitro arbitroAsistente;


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
     }public Partido(Estadio estadio, Equipo local, Equipo visitante, String nombrePartido, Arbitro arbitro, Arbitro linea1, Arbitro linea2, Arbitro arbitroAsistente) throws Exception {
          setEstadio(estadio);
          setLocal(local);
          setVisitante(visitante);
          setNombre(nombrePartido);
          setArbitro(arbitro);
          setArbitroAsistente(arbitroAsistente);
          setArbitroLinea(linea1);
          setArbitroLinea(linea2);
     }

     public void setArbitro(Arbitro arbitro) {
          this.arbitro = arbitro;
     }

     public Arbitro getArbitro() {
          return arbitro;
     }

     public void setArbitroAsistente(Arbitro arbitroAsistente) {
          this.arbitroAsistente = arbitroAsistente;
     }

     public Arbitro getArbitroAsistente() {
          return arbitroAsistente;
     }

     public void setArbitroLinea(Arbitro arbitroLineaActual) throws Exception {
          if(arbitroLinea.size() == 2){
               throw new Exception("No pueden haber mas de dos arbitros");
          } else{
               arbitroLinea.add(arbitroLineaActual);
          }
     }

     public ArrayList<Arbitro> getArbitroLinea() {
          return arbitroLinea;
     }

     public void setLocal(Equipo local) {
          this.local = local;
     }

     public Equipo getLocal() {
          return local;
     }
     public void setVisitante(Equipo visitante) {
          this.visitante = visitante;
     }


     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public Equipo getVisitante() {
          return visitante;
     }

     public void setTarjetas(ArrayList<TarjetaBase> tarjetas) {
          this.tarjetas = tarjetas;
     }

     public String getNombre() {
          return nombre;
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
