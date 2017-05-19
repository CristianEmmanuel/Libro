import java.util.List;

/**
 * Created by cristian on 19/05/17.
 */
public class Libro {

    private String titulo;
    private String subTitulo;
    private String genero;
    private int cantPag;

    public Libro(String titulo, String subTitulo, String genero, int cantPag) {
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.genero = genero;
        this.cantPag = cantPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }

    public void abrirElLibro(){
        System.out.println("Usted esta abriendo el libro cuyo titulo es : "+this.getTitulo());
    }
    public void leerElLibro(){
        System.out.println("Usted esta Leyendo el libro cuyo titulo es : " +this.getTitulo());

    }
    public void datosDelLibro(){
        System.out.println("El titulo es : " + this.getTitulo()+
                "\nEl subtitulo : "+ this.getSubTitulo()+
                "\nDel genero : " + this.getGenero()+
                "\nQue contiene : "+this.getCantPag()+
                " paginas\n");

    }
}
