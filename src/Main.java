
class persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int setEdad(int edad) {
        return this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}


public class Main {
    public static void main(String[] args) {
        persona persona = new persona();
        persona.setEdad(20);
        persona.setNombre("Sebas");
        persona.setTelefono(1122334455);
        System.out.println(persona.getNombre() + ": " + persona.getEdad() + " | " + persona.getTelefono());

        persona persona2 = new persona();
        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono(1348713423);
        System.out.println(persona.getNombre() + ": " + persona.getEdad() + " | " + persona.getTelefono());


    }
}