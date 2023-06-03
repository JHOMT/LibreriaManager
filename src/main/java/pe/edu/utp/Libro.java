package pe.edu.utp;

public class Libro {
    private String nombre;
    private String autor;
    private int paginas;

    public Libro(String nombre, String autor, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
