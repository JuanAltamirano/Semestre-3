import java.util.Arrays;

public class Borbuja {

    void bubbleSort(int array[]) {
        int size = array.length;
        
        // ejecutar el bucle dos veces, uno para recorrer el array y otro para hacer la comparación
        for (int i = 0; i < size - 1; i++)
          for (int j = 0; j < size - i - 1; j++)
    
            // Orden ascencente
            if (array[j] > array[j + 1]) {
    
              // intercambiar posicione
              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;
            }
      }
    
      // imprimir en pantalla
      public static void main(String args[]) {
        int[] data = { 34, 7, 23, 32, 5, 62, 70, 2, 3, 10, 22, 23, 17, 14, 12, 11, 90, 78, 44 };
        Borbuja bs = new Borbuja();
        bs.bubbleSort(data);
        System.out.println("Matriz ordenada en orden ascendente:");
        System.out.println(Arrays.toString(data));
      }

    
}
