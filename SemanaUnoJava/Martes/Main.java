import java.util.*;
public class Main{
    private static Scanner sc = new Scanner (System.in);
    public static int Menu(){
        int opcion;
        System.out.println();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Angulo");
        System.out.println("6. Magnitud");
        System.out.println("7. Salir");
        System.out.println();
        System.out.print("Elige tu opción: ");
        opcion = sc.nextInt();
        return opcion;
    }
    public static void main(String args[]){        
        Complejo calculadora,complejo1,complejo2,resultado;
        Process p;
        calculadora = new Complejo();
        double real, imag;
        int opcion;
        do{
            opcion = Menu();
            
            switch(opcion){
                case 1: 
                    System.out.print("Escribe el primer real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = sc.nextDouble();                    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = sc.nextDouble();                    
                    complejo2 = new Complejo (real, imag);                    
                    resultado = complejo1.suma(complejo2);
                    if (resultado.getImaginario() < 0.0)
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + -resultado.getImaginario());
                    else
                       System.out.println("El resultado es: " + 
                       resultado.getReal() + "+ i" + resultado.getImaginario());
                    break;

                case 2:
                    System.out.print("Escribe el primer real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = sc.nextDouble();    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = sc.nextDouble();
                    complejo2 = new Complejo (real, imag);
                    resultado = complejo1.resta(complejo2);                    
                    if (resultado.getImaginario() <0.0)
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + -resultado.getImaginario());
                    else
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + resultado.getImaginario());
                    break;

                case 3:
                    System.out.print("Escribe el primer real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = sc.nextDouble();    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = sc.nextDouble();
                    complejo2 = new Complejo (real, imag);
                    resultado = complejo1.resta(complejo2);
                    resultado = complejo1.multiplicacion(complejo2);
                    if (resultado.getImaginario() <0.0)
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + -resultado.getImaginario());
                    else
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + resultado.getImaginario());
                    break;

                case 4:
                    System.out.print("Escribe el primer real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imag = sc.nextDouble();    
                    complejo1 = new Complejo (real, imag);    
                    System.out.print("Escribe el segundo real: ");
                    real = sc.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imag = sc.nextDouble();
                    complejo2 = new Complejo (real, imag);
                    resultado = complejo1.resta(complejo2);
                    resultado = complejo1.division(complejo2);
                    if (resultado.getImaginario() <0.0)
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + -resultado.getImaginario());
                    else
                      System.out.println("El resultado es: " + 
                      resultado.getReal() + "+ i" + resultado.getImaginario());
                    break;

                case 5:
                System.out.print("Escribe el primer real: ");
                real = sc.nextDouble();
                System.out.print("Escribe el primer imaginario: ");
                imag = sc.nextDouble();    
                complejo1 = new Complejo (real, imag);    
                System.out.print("Escribe el segundo real: ");
                real = sc.nextDouble();
                System.out.print("Escribe el segundo imaginario: ");
                imag = sc.nextDouble();
                complejo2 = new Complejo (real, imag);

                System.out.println("El angulo del primer número complejo es: " + complejo2.ang(complejo1)+"°");
                System.out.println("El angulo del segundo número complejo es: " + complejo1.ang(complejo2)+"°");
                break;

                case 6:
                System.out.print("Escribe el primer real: ");
                real = sc.nextDouble();
                System.out.print("Escribe el primer imaginario: ");
                imag = sc.nextDouble();    
                complejo1 = new Complejo (real, imag);    
                System.out.print("Escribe el segundo real: ");
                real = sc.nextDouble();
                System.out.print("Escribe el segundo imaginario: ");
                imag = sc.nextDouble();
                complejo2 = new Complejo (real, imag);

                System.out.println("La magnitud del primer numero complejo es: "+(int)complejo2.magnitud(complejo1));
                System.out.println("La magnitud del segundo numero complejo es: "+(int)complejo1.magnitud(complejo2));
                break;

                case 7:
                break;
            }
        }while(opcion!=7);
    }
}