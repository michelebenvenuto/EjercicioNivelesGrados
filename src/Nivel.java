import java.util.ArrayList;
public class Nivel {
    private ArrayList<Object> Grados = new ArrayList();

    public ArrayList<Object> getGrado() {
        return Grados;
    }

    public void agregarGrado(Object grado){
        this.Grados.add(grado);
    }
    public void quitarGrado(String grado){
        this.Grados.remove(grado);
    }
}
