import java.util.Scanner;

public class Elcuento {
    public static void main(String[] args) {

        int pasosT = 0, pasosL = 0, tortuga, liebre, meta = 50;

        Scanner lector = new Scanner(System.in);

        System.out.println("===========Carrera de la liebre y la tortuga========");
        System.out.println("====================================================");

        while(pasosT < meta && pasosL < meta){

            System.out.println("Ingrese los paso de la Liebre: ");
            liebre = lector.nextInt();

            System.out.println("=================================");

            System.out.println("Ingrese los pasos de la Tortuga: ");
            tortuga = lector.nextInt();

            pasosL += liebre;
            pasosT += tortuga;

        }
        
        System.out.println("===========El Ganador es....==============");

        if(pasosL >= meta && pasosT >= meta){
            System.out.println("Quedaron en empate");
        }else if(pasosL >= meta ){
            System.out.println("la liebre");
        }else{
            System.out.println("la Tortuga");
        }
        


    }
}
