package collecciones;

import java.util.*;
import java.util.stream.Collectors;

public class OpReduccion1 {
    public static void main(String[] args) {
        //forma1
        List<String> nombres = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("Forma1");
        System.out.println(nombres);

        //forma2
        List<String> nombres2 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        System.out.println("\nForma2");
        System.out.println(nombres2);

        //forma3
        Set<String> nombres3 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());
        System.out.println("\nForma3");
        System.out.println(nombres3);

        //Forma4
        SortedSet<String> nombres4 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("\nForma4");
        System.out.println(nombres4);
    }
}
