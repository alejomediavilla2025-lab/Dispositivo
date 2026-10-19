package prueba;
import dispositivo.Dispositivo;

public class Main {
    public static void main(String[] args) {

        // Objetos tipo dispositivo
        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        // Asignacion de valores usando los metodos setters del dipositivo 1
        dispositivo1.setNombre("Computadora");
        dispositivo1.setMarca("Lenovo");
        dispositivo1.setTipo("Laptop");
        dispositivo1.setActivo(true);

        // Asignacion de valores usando los metodos setters del dipositivo 2
        dispositivo2.setNombre("Laptop");
        dispositivo2.setMarca("Samsung");
        dispositivo2.setTipo("Smartphone");
        dispositivo2.setActivo(false);

        // Imprimir-Consultar valores usando los metodos getters de los dispositivos
        System.out.println("\n=== DISPOSITIVO 1 ===");
        System.out.println("Nombre: " + dispositivo1.getNombre());
        System.out.println("Marca: " + dispositivo1.getMarca());
        System.out.println("Tipo: " + dispositivo1.getTipo());
        System.out.println("Activo: " + dispositivo1.isActivo());

        System.out.println("\n=== DISPOSITIVO 2 ===");
        System.out.println("Nombre: " + dispositivo2.getNombre());
        System.out.println("Marca: " + dispositivo2.getMarca());
        System.out.println("Tipo: " + dispositivo2.getTipo());
        System.out.println("Activo: " + dispositivo2.isActivo());

        // Comprobar que los objetos son independientes
        dispositivo2.setNombre("Tablet");

        System.out.println("Nombre dispositivo 1: "
                + dispositivo1.getNombre());

        System.out.println("Nombre dispositivo 2: "
                + dispositivo2.getNombre());

        // Probar los metodos activar y desactivar
        System.out.println("\n=== ACTIVAR Y DESACTIVAR ===");

        // Desactivar el dispositivo 1
        dispositivo1.desactivar();
        System.out.println("Dispositivo 1 activo: " + dispositivo1.isActivo());

        // Activar el dispositivo 2
        dispositivo2.activar();
        System.out.println("Dispositivo 2 activo: " + dispositivo2.isActivo());

        // Validar el nombre del dispositivo
        System.out.println("\n=== VALIDACION DE NOMBRE ===");
        // asignar un nombre valido
        dispositivo1.setNombre("Smartphone");
        //intentar asignar un nombre invalido
        dispositivo1.setNombre("");
        //imprimir el nombre del dispositivo
        System.out.println("Nombre despues de validar: " + dispositivo1.getNombre());



        // Prueba final del funcionamiento de los dispositivos
        System.out.println("\n=== PRUEBA FINAL ===");

        dispositivo1.setNombre("Computadora");
        dispositivo1.setNombre("");

        dispositivo1.activar();
        dispositivo2.desactivar();

        System.out.println("Dispositivo 1: "
                + dispositivo1.getNombre());
        System.out.println("Estado dispositivo 1: "
                + dispositivo1.isActivo());
        System.out.println("Estado dispositivo 2: "
                + dispositivo2.isActivo());



    }
}