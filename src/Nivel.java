import java.util.ArrayList;
public class Nivel {
    private String nombreNivel;
    private ArrayList<Grado> Grados;

    public ArrayList<Grado> getGrado() {
        return Grados;
    }

    public void agregarGrado(Grado grado){
        this.Grados.add(grado);
    }

    public String getNombreNivel() {
        return nombreNivel;
    }
    public Nivel(String nombreNivel){
        this.nombreNivel=nombreNivel;
        this.Grados=new ArrayList<>();
    }
}
