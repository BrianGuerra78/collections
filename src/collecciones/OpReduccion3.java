package collecciones;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OpReduccion3 {
    public static List<Estudiantes> getStudents(){
        return Arrays.asList(
                new Estudiantes("John", "Smith", "Miami", 7.38, 19),
                new Estudiantes("Jane", "Miler", "New York", 8.4, 21),
                new Estudiantes("Michael", "Peterson", "New York", 7.5, 20),
                new Estudiantes("Gabriella", "Roberson", "Miami", 9.1, 20),
                new Estudiantes("Kyle", "Miller", "Miami", 9.83, 20)
        );
    }

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Andres", "Jaime", "Sara", "Cesar", "Javier", "Rosa", "Mariana");
        Map<Boolean, List<String>>nombresMapa = nombres.stream().collect(
                Collectors.partitioningBy(nombre -> nombre.length() > 4));
        System.out.println(nombresMapa);

        System.out.println("Nombres que si cumplen con la condicion");
        System.out.println(nombresMapa.get(true));
        System.out.println("\nNombres que no cumplen con la condicion");
        System.out.println(nombresMapa.get(false));

        System.out.println("------------------------");

        List<Estudiantes> estudiantes = getStudents();
        Map<Boolean, List<Estudiantes>> estudiantesMapa = estudiantes.stream()
                .collect(Collectors.partitioningBy(student -> student.getName().length() >4));
        System.out.println(estudiantesMapa);

        System.out.println("------------------------");

        Map<Boolean, List<Estudiantes>> estudiantesSobresalietes = estudiantes.stream()
                .collect(Collectors.partitioningBy(Estudiantes::calificacionExcelente));
        System.out.println("\nEstudiantes con calificacion sobresaliente");
        System.out.println(estudiantesSobresalietes.get(true));
        System.out.println("\nEstudiantes con calificaciones insuficientes");
        System.out.println(estudiantesSobresalietes.get(false));
    }
}
