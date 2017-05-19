public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter", "El misterio del principe","Fantasia",2004);
        Libro libro = new Libro("Seductor Infalible", "Seductor", "guia", 170);

        libro1.abrirElLibro();

        libro1.datosDelLibro();

        libro.datosDelLibro();

        System.out.print("");
    }
}
