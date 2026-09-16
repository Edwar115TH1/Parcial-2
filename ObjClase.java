public class ObjClase {

    /*Crear atributos 
    luego generar los metodos Get and set de c/u y el constructor con los parametros. */
    int    codigo;
    String titulo;
    String genero;
    int    duracion;

    public ObjClase(){

    }

    public ObjClase(int codigo, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
