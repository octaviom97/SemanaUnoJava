import java.util.*;

public class Mainm{

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
        return opcion;
    }

    public static void main (String[] Args){
        int i, j, opcion;
        int m1[][] = new int [3][3];
        int m2[][] = new int [3][3];
        int m3[][] = new int [3][3];
         
        Scanner sc = new Scanner (System.in);
         
        System.out.println("\nIntroduce los valores de la matriz 1 :");
            for (i=0; i<=2; i++){
                for (j=0; j<=2; j++){
                    System.out.print("Valor " + i + " , " + j + " : ");
                    m1 [i][j]= sc.nextInt();
                }
            }

        System.out.println("\nIntroduce los valores de la matriz 2 :");
            for (i=0; i<=2; i++){
                for (j=0; j<=2; j++){
                System.out.print("Valor " + i + " , " + j + " : ");
                m2 [i][j]= sc.nextInt();
                }
            }


        do
        {
            opcion = Menu();
            
            switch(opcion){
                case 1: 
                    for (i=0; i<=2; i++){
                        for (j=0; j<=2; j++){
                        m3 [i][j]= m1[i][j]+m2[i][j];
                        }
                    }
                        
                    System.out.println("\nSuma de matrices:");
                    for (i=0;i<=2;i++){
                        for (j=0;j<=2;j++) {
                        System.out.print(m3[i][j] + " ");
                        }
                        System.out.println("");
                    }
                break;

                case 2:
                    for (i=0; i<=2; i++){
                        for (j=0; j<=2; j++){
                        m3 [i][j]= m1[i][j]-m2[i][j];
                        }
                    }
                        
                    System.out.println("\nResta de matrices:");
                    for (i=0;i<=2;i++){
                        for (j=0;j<=2;j++) {
                        System.out.print(m3[i][j] + " ");
                        }
                        System.out.println("");
                    }
                break;

                case 3:
                break;

                case 4:
                    int[][] mT = new int[m1[0].length][m1.length];
                        for (i=0; i < m1.length; i++){
                            for (j=0; j < m1[i].length; j++){
                                mT[j][i] = m1[i][j];
                            }
                        }
                    System.out.println("\nMatriz 1 transpuesta:");
                    for (i=0;i<=2;i++){
                        for (j=0;j<=2;j++) {
                        System.out.print(mT[i][j] + " ");
                        }
                        System.out.println("");
                    }

                    int[][] mT2 = new int[m2[0].length][m2.length];
                        for (i=0; i < m2.length; i++){
                            for (j=0; j < m2[i].length; j++){
                            mT2[j][i] = m2[i][j];
                            }
                        }
                    System.out.println("\nMatriz 2 transpuesta:");
                    for (i=0;i<=2;i++){
                        for (j=0;j<=2;j++) {
                        System.out.print(mT2[i][j] + " ");
                        }
                        System.out.println("");
                    }
                break;

                case 5:
                opcion=7;
                break;

                case 6:
                    System.out.println("\nIntroduce los valores de la matriz 1 :");
                        for (i=0; i<=2; i++){
                            for (j=0; j<=2; j++){
                                System.out.print("Valor " + i + " , " + j + " : ");
                                m1 [i][j]= sc.nextInt();
                            }
                        }

                    System.out.println("\nIntroduce los valores de la matriz 2 :");
                        for (i=0; i<=2; i++){
                            for (j=0; j<=2; j++){
                            System.out.print("Valor " + i + " , " + j + " : ");
                            m2 [i][j]= sc.nextInt();
                            }
                        }
                break;

                case 7:
                break;
            }

        }while(opcion!=7);
    
    }
}