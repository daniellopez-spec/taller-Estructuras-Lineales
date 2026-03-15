# taller-Estructuras-Lineales
Proyecto realizado para la materia de estructura de datos
Estudiante: Daniel Estiven Lopez Velasco
Semestre: 4-Desarrollo de software
Explicacion trabajos 

- Gestor Arreglos.
Ejercicio#1:
En este primer ejercicio se quiere demostrar los 10 primeros numeros primos, para eso se debe crear un arreglo llamado numeros_primos donde ya estan almacenados esos valores: 2,3,5,7,11,13,17,19,23,29.
Despues utilizamos un ciclo for para recorrer todo el arreglo, por lo tanto cada vez que el ciclo pasa por un elemento, toma el numero y lo imprime en la consola usando System.out.print.
Una vez que se ejecuta el programa desde el main, se llama el metodo numeros_primos() y en la consola aparece el mensaje "Primeros 10 numeros primos" seguido de todos los numeros del arreglo.

Ejercicio"#2:
En este ejercicio se generan los 100 primeros numeros pares, por lo tanto primero se crea un arreglo llamado numeros_pares con 100 posiciones, lo que significa que puede guardar 100 numeros.
Luego se utiliza un ciclo for que recorre cada posicion del arreglo. En cada iteracion se calcula un numero par usando la operacion (i+1)*2 y ese valor se guarda en el arreglo y de esta manera se generan numeros como 2,4,6,8,10 y asi sucesivamente.
Despues de llenar el arreglo, se recorre nuevamente para imprimir todos los numeros en la consola en una sola linea.

Ejercicio#3:
En este ejercicio se trabajan numeros aleatorios y el calculo de factoriales, primero se crean dos arreglos el cual uno es llamado numeros, donde va a guardar algunos numeros generados aleatoriamente y otro llamado factoriales, donde se guardara el factorial de cada numero.
Para generar los numeros aleatorios se utiliza la clase Random, para este caso se generan numeros entre 1 y 10 usando random.nextInt(10)+1.
Luego cada numero generado se envia al metodo factorial(), que calcula su factorial multiplicando todos los numeros desde el 1 hasat el valor propuesto.
Al final el programa lo que hara es imprimir los numeros que se generan y luego los factoriales correspondientes.

Ejercicio#4:
En este ejercicio el objetivo sera encontrar un numero mayor y menor dentro de un conjunto de numeros, por lo tanto creamos un arreglo con 25 posiciones donde se guardaran numeros aleatorios entre -50 y 50.
Mientras se generan los numeros, el programa va comparando cada uno de los valores con dos variables llamadas mayor y menor, por lo tanto si numero generado es mas grande que el valor actual de mayor, entonces se actualiza la variable y si es mas pequeño que menor tambien se actualiza.
Al final del proceso se imprime en la consola el numero mayor y menor encontrados dentro del arreglo.

Ejercicio#5:
En el ultimo ejercicio de este segmento se trabaja con la inversion de numeros. Primero se crean dos arreglos el cual uno es numeros, donde se guardaran numeros aleatorios y otro llamado invertidos, donde se guardaran esos mismos numeros pero con sus digitos invertidos.
Luego se generan 20 numeros aleatorios entre 0 y 999 usando random.nextInt(1000) y se guardan en el arreglo mine.
Cada numero se envia al metodo invertir() el cual toma los digitos del numero y los reorganiza en orden inverso, por ejemplo si el numero es 123, el metodo devolvera el 321 y se guardara en el arreglo invertidos.
Finalmente el programa imprime en la consola los numeros originales y luego los numeros ya invertidos para poder comparar los resultados.

- Gestor ArrayList:




