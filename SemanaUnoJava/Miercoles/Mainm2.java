import java.util.*;

public class Mainm2{

     public static int Menu(){
        Scanner sc = new Scanner (System.in);
        int opcion;
        System.out.println();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicación");
        System.out.println("4. Transposición");
        System.out.println("5. Inversa");
        System.out.println("6. Cambiar valores");
        System.out.println("7. Salir");
        System.out.println();
        System.out.print("Elige tu opción: ");
        opcion = sc.nextInt();
        System.out.println();
        return opcion;
    }

    public static void main (String[] Args){
        int i, j, opcion, aux2, a=0, b=1, c=2;
        int[] aux = new int[9];
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        ArrayList<Integer> m2 = new ArrayList<Integer>();

         for (i=0;i<9;i++){
                        System.out.println("Introduce el valor " + (i+1) + " de la matriz 1: ");
                        aux[i] = sc.nextInt();
                        m1.add(aux[i]);
                    }
                    
                    for (i=0;i<9;i++){
                        aux[i]=i;
                        m1.get(aux[i]);
                    }
                    System.out.println("");
                    for (i=0;i<9;i++){
                        System.out.println("Introduce el valor " + (i+1) + " de la matriz 2: ");
                        aux[i] = sc.nextInt();
                        m2.add(aux[i]);
                    }
                    
                    for (i=0;i<9;i++){
                        aux[i]=i;
                        m2.get(aux[i]);
                    }
                    System.out.println("");  

        do{
            opcion = Menu();
            
            switch(opcion){
                case 1: 
                    a=0;b=1;c=2;
                    System.out.println("La suma de matrices es:\n");
                    for (i=0; i<3;i++){
                        System.out.println(m1.get(a) + m2.get(a)+" "+(m1.get(b) + m2.get(b))+" "+(m1.get(c) + m2.get(c)));
                        a+=3;
                        b+=3;
                        c+=3;
                    }
                    System.out.println("");
                break;

                case 2:
                    a=0;b=1;c=2;
                    System.out.println("La resta de matrices es:\n");
                    for (i=0; i<3;i++){
                        System.out.println(m1.get(a) - m2.get(a)+" "+(m1.get(b) - m2.get(b))+" "+(m1.get(c) - m2.get(c)));
                        a+=3;
                        b+=3;
                        c+=3;
                    }
                    System.out.println("");
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;

                case 6:
                    for (i=0;i<9;i++){
                        System.out.println("Introduce el valor " + (i+1) + " de la matriz 1: ");
                        aux[i] = sc.nextInt();
                        m1.add(aux[i]);
                    }
                    
                    for (i=0;i<9;i++){
                        aux[i]=i;
                        m1.get(aux[i]);
                    }
                    System.out.println("");
                    for (i=0;i<9;i++){
                        System.out.println("Introduce el valor " + (i+1) + " de la matriz 2: ");
                        aux[i] = sc.nextInt();
                        m2.add(aux[i]);
                    }
                    
                    for (i=0;i<9;i++){
                        aux[i]=i;
                        m2.get(aux[i]);
                    }
                    System.out.println("");
                break;

                case 7:
                break;

            }

        } while(opcion!=7);


        



    
    }
}