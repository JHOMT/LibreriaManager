package pe.edu.utp;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> listLibros;

    public Libreria() {
        listLibros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        listLibros.add(libro);
    }
    public void mostrarLibros(){
        if (listLibros.isEmpty()){
            System.out.println("No se registraron libros");
        }else {
            System.out.println("----- Los libros son los siguientes  -----");
            for (Libro libro: listLibros) {
                System.out.println("__________________________________________________________");
                System.out.println("Nombre     :"+libro.getNombre());
                System.out.println("Autor      :"+libro.getAutor());
                System.out.println("N° Paginas :"+libro.getPaginas());
                System.out.println("__________________________________________________________");
            }
        }
    }
    public void buscarTitulo(String titulo){
        System.out.println("Libros con el titulo "+titulo+" :");
        boolean encontrado= false;
        for (Libro libro: listLibros) {
            if (libro.getNombre().equalsIgnoreCase(titulo)){
                System.out.println("Nombre     :"+libro.getNombre());
                System.out.println("Autor      :"+libro.getAutor());
                System.out.println("N° Paginas :"+libro.getPaginas());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("El libro no fue encontrado");
        }
    }
    public void buscarAutor(String autor){
        System.out.println("----- Buscar libros del autor "+autor+" :");
        boolean encontrado= false;
        for (Libro libro: listLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)){
                System.out.println("Nombre     :"+libro.getNombre());
                System.out.println("Autor      :"+libro.getAutor());
                System.out.println("N° Paginas :"+libro.getPaginas());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron resultados con el Autor ingresado");
        }
    }
    public int contarPaginas(){
        int numeroPaginas=0;
        for (Libro libro: listLibros) {
            numeroPaginas+=libro.getPaginas();
        }
        return numeroPaginas;
    }

}
