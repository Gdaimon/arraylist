package arraylist;

import java.util.ArrayList;

public class ArrayListPrueba {


    public static void main(String[] args) {
        
        
        // Constructores
        // Java 1.4
        //List carros = new ArrayList();
        //carros.add(new Object());
        //carros.add(1);
        //carros.add("Pedro");
        
        // Java 1.5 y Java 1.6
        //List<String> carros = new ArrayList<String>();
        //List carros = new ArrayList<String>();
        
        // Java 1.7
        //List<String> carros = new ArrayList<>();
        //List carros = new ArrayList<>();
        
        /*
        // Arreglo
        Persona[] personas = new Persona[3];
        // Persona personas[] = new Persona[3];
        personas[0] = new Persona("Juan", 10, "4221515");
        personas[1] = new Persona("Martha", 22, "4222020");
        personas[2] = new Persona("Pepe", 18, "4100102");
        // Error me sali del tamaño declarado
        // personas[3] = new Persona("Juana", 15, "4100102");
        // personas[4] = new Persona("Juana", 15, "4100102");
        */
        
        // Capacidad inicial 10 elemntos
        ArrayList<Persona> personas = new ArrayList<>();
        // Indico cantidad de elementos
        personas.ensureCapacity(15);     
        
        personas.add(new Persona("Juan", 10, "4221515"));
        personas.add(new Persona("Martha", 22, "4222020"));
        personas.add(new Persona("Pepe", 18, "4100102"));
        
        personas.trimToSize();
        personas.add(new Persona("Juana", 15, "4100102"));
        /*
        for(Persona persona : personas){
            System.out.println(persona.mostrarDatosPersona());
        }
        */
        /*
        for(int index = 0; index < personas.size(); index++){
            Persona persona = personas.get(index);
            System.out.println(persona.mostrarDatosPersona());
        }
        */
        /*
        // Convertir Arraylist a un Array
        Persona[] arregloPersonas = new Persona[personas.size()];
        personas.toArray(arregloPersonas);
        */
       
        /**
         * Genera error
        for(Persona persona : personas){
           System.out.println(persona.mostrarDatosPersona());
           if(persona.getNombre().equalsIgnoreCase("martha")){
               personas.remove(persona);
           }
        }
        */
        /*
        Iterator<Persona> iterador = personas.iterator();
        while(iterador.hasNext()){
            // Mostar posicion en memoria porque no se implemento el toString
            // System.out.println(iterador.next());
            // Objeto de tipo Persona
             // System.out.println(iterador.next().mostrarDatosPersona());
             Persona persona = iterador.next();
             System.out.println(persona.mostrarDatosPersona());
           if(persona.getNombre().equalsIgnoreCase("martha")){
               iterador.remove();
           }
        }
        
        System.out.println("======================");
        for(Persona persona : personas){
            System.out.println(persona.mostrarDatosPersona());
        }*/
        
        for(Persona persona : personas){
            System.out.println(persona.mostrarDatosPersona());
        }
        
        // setter y getter
        System.out.println(personas.get(1).mostrarDatosPersona());
        // Similar
        // personas[1] = new Persona("Martha", 22, "4222020");
        personas.set(1, new Persona("Sandra", 15, "4100020"));
        System.out.println("======================");
        for(Persona persona : personas){
            System.out.println(persona.mostrarDatosPersona());
        }
    }
    
}
