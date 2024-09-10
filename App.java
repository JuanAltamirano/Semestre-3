import java.util.ArrayList;
import java.util.Collections;

public class App {

 static Persona[] personas_s;
    public static void main(String[] args) throws Exception{
        
    ArrayList<Persona> personas = new ArrayList<Persona>();
    personas.add(new Persona(25, "Diego"));
    personas.add(new Persona(30,  "Diana"));
    personas.add(new Persona(2,  "Catalina"));
    personas.add(new Persona(45,  "Pedro"));
    personas.add(new Persona(5,  "Sebastian"));

    Collections.sort(personas);

    for(Persona p: personas)
    {
        System.out.println(p);
    }

//ordenamiento con un arreglo estatico:
personas_s = new Persona[10];

//agregar elementos:


//llamar a los dos algoritmos de ordenamiento:


//imprimirlo:

}

//ordenar usando quicksort una lista de objeto con compareTo

public static void miOrdenamiento_QS()
{

}

public static void miOrdenamiento_MG(){
    
}


}
