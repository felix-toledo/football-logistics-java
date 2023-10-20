package FootballGame;

public abstract class TarjetaBase {
     Jugador jugador;
     String tipo;

     public TarjetaBase(String tipoTarjeta, Jugador jugador){
          setJugador(jugador);
          setColor(tipoTarjeta);
     }

     private void setJugador(Jugador jugador) {
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
     }public Jugador getJugador() {
          return jugador;
     }
}
