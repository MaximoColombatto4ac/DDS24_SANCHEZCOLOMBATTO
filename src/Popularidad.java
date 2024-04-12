public abstract class Popularidad {
    public Popularidad() {
    }
    public String detalleCompleto(Cancion c){
        String texto = "";
        texto += icono();
        texto += "-";
        texto += leyenda(c);
        return texto;
    }
    public abstract void actualizarEstado(Cancion c);
    protected abstract String icono();
    protected abstract String leyenda(Cancion c);
}
