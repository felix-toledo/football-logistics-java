package FootballGame;

import FootballGame.Interfaces.IJugador;

public abstract class TarjetaBase {
     IJugador jugador;
     String tipo;

     public TarjetaBase(String tipoTarjeta, IJugador jugador){
          setJugador(jugador);
          setColor(tipoTarjeta);
     }

     private void setJugador(IJugador jugador) {
          this.jugador = jugador;
     }

     public String toString(){
          return String.format("Tarjeta %s para %s",
                  getColor(),
                  getJugador().getName());
     }

     public void setColor(String tipo) {
          this.tipo = tipo;
     }public String getColor() {
          return tipo;
     }public IJugador getJugador() {
          return jugador;
     }
}
