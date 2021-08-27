
package arraylist;
public class Persona {

    private String nombre;
    private int edad;
    private String telefono;

    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String mostrarDatosPersona(){
        StringBuilder stringBuilder = new StringBuilder("La persona se llama: ");
        stringBuilder.append(this.nombre)
                .append(", tiene: ")
                .append(this.edad)
                .append(", años y su telefono es: ")
                .append(this.telefono);
        // return "La persona se llama: "+this.nombre+ ", tiene: "+ this.edad+", años y su telefono es: "+this.telefono;
        return stringBuilder.toString();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
