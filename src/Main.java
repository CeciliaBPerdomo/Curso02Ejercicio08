public class Main {
    public static void main(String[] args) {
        // Crear un objeto persona en el main.
        Persona persona = new Persona();

        // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        // por último muéstralas por consola.
        persona.setNombre("Cecilia Perdomo");
        System.out.println("Nombre: " + persona.getNombre());

        persona.setEdad(38);
        System.out.println("Edad: " + persona.getEdad());

        persona.setTelefono(123456789);
        System.out.println("Telefono: " + persona.getTelefono());
    }
}

// Crear clase Persona
class Persona{
    // Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private int telefono;

    // Crear gets y sets de cada propiedad.
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}