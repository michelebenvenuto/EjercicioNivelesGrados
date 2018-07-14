import java.util.ArrayList;
public class Grado {
    private ArrayList<String>Estudiantes= new ArrayList();

    public ArrayList<String> getEstudiantes() {
        return Estudiantes;
    }

    public void agregarEstudiante(String estudiate) {
        Estudiantes.add(estudiate);
    }
    public void quitarEstudante(String estudiate){
        Estudiantes.remove(estudiate);
    }
}
