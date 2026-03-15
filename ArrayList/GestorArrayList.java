package scr.ArrayList;
import java.util.*;
public class GestorArrayList {

    static Random random = new Random();

    //Ejercicio #6
    public static void lista_hasta_diez() {
        ArrayList<Integer> lista = new ArrayList<>();

        int num;
        do{
            num= random.nextInt(21)-10;
            lista.add(num);

        }while(num!=10);

        int suma=0;

        for(int x:lista)
            suma+=x;

        double media = (double)suma/lista.size();

        System.out.println("Lista: "+lista);
        System.out.println("Suma: "+suma);
        System.out.println("Media: "+media+"\n");

    }

    //Ejercicio #7
    public static void insertar_eliminar(){
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1;i<=20;i++)
            lista.add(i*2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Lista inicial: "+lista);
        System.out.print("Numero a ingresar: ");
        int n = sc.nextInt();

        int pos=0;

        while(pos<lista.size() && lista.get(pos)<n)
            pos++;
        lista.add(pos,n);

        System.out.println("Lista actualizada: "+lista);
        System.out.print("Numero a eliminar: ");
        int borrar = sc.nextInt();

        lista.remove(Integer.valueOf(borrar));

        System.out.println("Lista final: "+lista+"\n");
    }

    //Ejercicio #8
    public static void frecuencia (){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=0;i<100;i++)
            lista.add(random.nextInt(20)+1);

        int max=0;
        int num_max=0;
        for(int i=1;i<=20;i++){

            int cont=0;
            for(int x:lista)
                if(x==i)
                    cont++;
            
            System.out.println(i+" aparece "+cont+" veces ");
            if(cont>max){
                max=cont;
                num_max=i;
            }
        }
        System.out.println("Numero mas repetido: "+num_max+"\n");
    }

    //Ejercicio #9
    public static void ordenar_separar(){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=0;i<20;i++)
            lista.add(random.nextInt(100)+1);
        
        System.out.println("Original: "+lista);

        Collections.sort(lista);
        System.out.println("Ascendente: "+lista);

        Collections.sort(lista,Collections.reverseOrder());
        System.out.println("Descendente: "+lista);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(int x:lista){
            if(x%2==0)
                pares.add(x);
            else
                impares.add(x);
        }
        System.out.println("Pares: "+pares); 
        System.out.println("Impares: "+impares+"\n");       
    }

    public static void main(String[] args){
        lista_hasta_diez();
        insertar_eliminar();
        frecuencia();
        ordenar_separar();
    }

    //Ejercicio #10
    public static void liga(){
        String datos = "Celta de vigo::Almeria::2::2 "
                + "Villareal::Mallorca::4::3 "
                + "Osasuna::Mallorca::3::2 "
                + "Granada::Valencia::0::4 "
                + "Barcelona::Girona::0::4 ";
        
        ArrayList<String> partidos = new ArrayList<>();

        String[] lista = datos.split(" ");
        for(String p : lista){
            partidos.add(p);
        }

        int victorias_del_Barcelona = 0;
        int victorias_local = 0;

        System.out.println("Partidos donde gano el equipo visitante:\n");
        for(String partido : partidos){
            String[] datos_del_partido = partido.split("::");

            String local = datos_del_partido[0];
            String visitante = datos_del_partido[1];

            int goles_local = Integer.parseInt(datos_del_partido[2]);
            int goles_visitante = Integer.parseInt(datos_del_partido[3]);

            if(goles_visitante > goles_local){
                System.out.println(local +" "+goles_local + " - "
                        + goles_visitante + " " + visitante);
            }

            if(local.equals("Barcelona ") && goles_local > goles_visitante){
                victorias_del_Barcelona++;
            }

            if(visitante.equals("Barcelona ") && goles_visitante > goles_local){
                victorias_del_Barcelona++;
            }

            if (goles_local > goles_visitante) {
                victorias_local++;
                
            }
        }

        System.out.println("\n Veces que gano el Barcelona: " + victorias_del_Barcelona );
        ArrayList<String> empates = new ArrayList<>();

        for(String partido : partidos){
            String[] datos_partido = partido.split(" :: ");

            int goles_local = 
        }
    }
}
