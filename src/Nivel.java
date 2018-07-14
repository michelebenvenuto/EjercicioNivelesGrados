import java.util.ArrayList;
public class Nivel {
     private ArrayList<String> Grados = new ArrayList();

    public ArrayList<String> getGrado() {
        return Grados;
    }

    public void agregarGrado(String grado){
        Grados.add(grado);
    }
    public void quitarGrado(String grado){
        Grados.remove(grado);
    }
}
