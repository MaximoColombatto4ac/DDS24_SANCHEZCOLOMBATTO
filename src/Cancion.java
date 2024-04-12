import java.time.LocalDate;

public class Cancion {
    //Atributos
    private String nombre;
    private  Album album;
    private int reproducciones;
    private Popularidad popularidad;
    private int likes;
    private int dislikes;
    private LocalDate ultRepreducida;

    //Constructor
    public Cancion(String nombre, Album album, int reproducciones, Popularidad popularidad, int likes, int dislikes, LocalDate ultRepreducida) {
        this.nombre = nombre;
        this.album = album;
        this.reproducciones = reproducciones;
        this.popularidad = popularidad;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ultRepreducida = ultRepreducida;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDate getUltRepreducida() {
        return ultRepreducida;
    }

    public void setUltRepreducida(LocalDate ultRepreducida) {
        this.ultRepreducida = ultRepreducida;
    }

    // Metodos
    public void reproducir(){
        this.reproducciones++;
        this.popularidad.actualizarEstado(this);
        this.setUltRepreducida(LocalDate.now());
    }
    public void detalleCompleto(){
        this.popularidad.detalleCompleto(this);
    }
    public void cambiarPopularidad(){}
}
