package scr.matrices;
import java.util.*;
public class GestorMatrices {
    static Random random = new Random();

    //Ejercicio #11
    public static void buscar_numero(){
        int [][] matriz = new int [4][4];
        
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                matriz[i][j] = random.nextInt(50);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero a buscar: ");
        int num = sc.nextInt();

        boolean numero_encontrado=false;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matriz[i][j]==num){

                    System.out.println("Encontrado en: "+i+","+j);
                    numero_encontrado=true;
                    break;
                }
            }

            if(numero_encontrado)
                break;
        }

        if(!numero_encontrado)
            System.out.println("No fue encontrado ");

        System.out.println();
    }

    //Ejercicio #12
    public static void diagonal_secundaria(){
        int n=4;

        int[][] matriz = new int [n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matriz[i][j] = random.nextInt(101)-50;

        int suma=0;

        for(int i=0;i<n;i++)
            suma += matriz[i][n-1-i];

        System.out.println("Suma diagonal secundaria: "+suma+"\n");
    }

    //Ejercicio #13
    public static void matriz_simetrica(){
        int[][] m = {{1,2,3},{2,4,5},{3,5,6}};

        boolean simetrica=true;

        for(int i=0;i<m.length;i++)
            for(int j=0;j<m.length;j++)
                if(m[i][j]!=m[j][i])
                    simetrica=false;

        System.out.println("¿Es simetrica?: "+simetrica);

        System.out.println("Esquinas: ");
        System.out.println(m[0][0]+" "+m[0][2]);
        System.out.println(m[2][0]+" "+m[2][2]);

        System.out.println();
    }

    //Ejercicio #14
    public static void transpuesta(){
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] t = new int [3][2];

        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                t[j][i] = m[i][j];

        System.out.println("Transpuesta: ");

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++)
                System.out.print(t[i][j]+" ");

            System.out.println();
        }
        System.out.println();
    }

    //Ejercicio #15
    public static void intercambiar_filas(){
        int[][] m = new int[3][3];

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                m[i][j] = random.nextInt(10);

        for(int j=0;j<3;j++){
            int temp = m[0][j];
            m[0][j] = m[1][j];
            m[1][j] = temp;
        }

        System.out.println("Matriz con filas intercambiadas: ");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            System.out.print(m[i][j]+" ");

        System.out.println();
        }
    }

    public static void main(String[] args){

        buscar_numero();
        diagonal_secundaria();
        matriz_simetrica();
        transpuesta();
        intercambiar_filas();
    }

}
