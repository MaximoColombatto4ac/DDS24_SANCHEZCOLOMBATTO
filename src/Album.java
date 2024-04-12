import java.time.LocalDate;
import java.util.ArrayList;

public class Album {
 private Artista artista;
 private ArrayList<Cancion> canciones;
 private LocalDate fecha;

 //Contructor
public Album(Artista artista, ArrayList<Cancion> canciones, LocalDate fecha) {
    this.artista = artista;
    this.canciones = canciones;
    this.fecha = fecha;
}

//Getters y Setters
public Artista getArtista() {
    return artista;
}

public void setArtista(Artista artista) {
    this.artista = artista;
}

public ArrayList<Cancion> getCanciones() {
    return canciones;
}

public void setCanciones(ArrayList<Cancion> canciones) {
    this.canciones = canciones;
}

public LocalDate getFecha() {
    return fecha;
}

public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}
}
