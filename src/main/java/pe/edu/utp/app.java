package pe.edu.utp;

public class app {
    public static void main(String[] args) {
        Libreria libreria= new Libreria();
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 218);
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);

        libreria.mostrarLibros();
        System.out.println("El total de paginas de los libros es "+libreria.contarPaginas());
    }
}
