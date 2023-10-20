package FootballGame;

import FootballGame.Interfaces.IJugador;

public class Jugador implements IJugador {
     private String nombre;
     private int numero;

     private String posicion;

     public Jugador(String nom, int num){
          setName(nom);
          setNumero(num);
     }

     public String getName() {
          return nombre;
     }public void setName(String nombre) {
          this.nombre = nombre;
     }public int getNumero() {
          return numero;
     }


     public String getPosicion() {
          return posicion;
     }


     public void setPosicion(String value) {
          this.posicion = value;
     }

     public void setNumero(int numero) {
          this.numero = numero;
     }
}
