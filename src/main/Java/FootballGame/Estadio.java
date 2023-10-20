package FootballGame;

public class Estadio {

    private String nombre;
    private String ciudad;
    private String pais;

    public Estadio(String nombre, String ciudad, String pais){
        setName(nombre);
        setCiudad(ciudad);
        setPais(pais);
    }

    public String toString(){
        return nombre + ", "+ciudad+" ("+pais+")";
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
