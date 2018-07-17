import java.util.ArrayList;
public class Grado {
    private String nombreGrado;
    private ArrayList<Estudiante> Estudiantes;

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public void agregar0Estudiantes(Estudiante estudiante) {
        this.Estudiantes.add(estudiante);
    }
}
