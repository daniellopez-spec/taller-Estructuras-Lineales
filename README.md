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
___________________________________________
Ejercicio"#2:
En este ejercicio se generan los 100 primeros numeros pares, por lo tanto primero se crea un arreglo llamado numeros_pares con 100 posiciones, lo que significa que puede guardar 100 numeros.
Luego se utiliza un ciclo for que recorre cada posicion del arreglo. En cada iteracion se calcula un numero par usando la operacion (i+1)*2 y ese valor se guarda en el arreglo y de esta manera se generan numeros como 2,4,6,8,10 y asi sucesivamente.
Despues de llenar el arreglo, se recorre nuevamente para imprimir todos los numeros en la consola en una sola linea.
___________________________________________
Ejercicio#3:
En este ejercicio se trabajan numeros aleatorios y el calculo de factoriales, primero se crean dos arreglos el cual uno es llamado numeros, donde va a guardar algunos numeros generados aleatoriamente y otro llamado factoriales, donde se guardara el factorial de cada numero.
Para generar los numeros aleatorios se utiliza la clase Random, para este caso se generan numeros entre 1 y 10 usando random.nextInt(10)+1.
Luego cada numero generado se envia al metodo factorial(), que calcula su factorial multiplicando todos los numeros desde el 1 hasat el valor propuesto.
Al final el programa lo que hara es imprimir los numeros que se generan y luego los factoriales correspondientes.
___________________________________________
Ejercicio#4:
En este ejercicio el objetivo sera encontrar un numero mayor y menor dentro de un conjunto de numeros, por lo tanto creamos un arreglo con 25 posiciones donde se guardaran numeros aleatorios entre -50 y 50.
Mientras se generan los numeros, el programa va comparando cada uno de los valores con dos variables llamadas mayor y menor, por lo tanto si numero generado es mas grande que el valor actual de mayor, entonces se actualiza la variable y si es mas pequeño que menor tambien se actualiza.
Al final del proceso se imprime en la consola el numero mayor y menor encontrados dentro del arreglo.
___________________________________________
Ejercicio#5:
En el ultimo ejercicio de este segmento se trabaja con la inversion de numeros. Primero se crean dos arreglos el cual uno es numeros, donde se guardaran numeros aleatorios y otro llamado invertidos, donde se guardaran esos mismos numeros pero con sus digitos invertidos.
Luego se generan 20 numeros aleatorios entre 0 y 999 usando random.nextInt(1000) y se guardan en el arreglo mine.
Cada numero se envia al metodo invertir() el cual toma los digitos del numero y los reorganiza en orden inverso, por ejemplo si el numero es 123, el metodo devolvera el 321 y se guardara en el arreglo invertidos.
Finalmente el programa imprime en la consola los numeros originales y luego los numeros ya invertidos para poder comparar los resultados.
___________________________________________
Main:
Todos estos ejercicios se ejecutan desde el método main, que es el punto de inicio del programa. Dentro de este método se llaman los otros métodos (numeros_primos, numeros_pares, factoriales, mayor_menor e invertir_arreglo) para que cada ejercicio se ejecute y muestre su resultado en la consola.
___________________________________________
- Gestor ArrayList:

Ejercicio#6:
En este ejercicio se trabaja con un ArrayList para guardar numeros enteros, por lo tanto primero creamos una lista vacia llamada lista.
Luego el programa empezara a generar numeros aleatorios entre -10 y 10 usando random.nextInt(21) - 10, cada numero que se genera se agrega a la lista con lista.add(num).
Este caso se repite dentro de un ciclo do-while hasta que aparezca el numero 10, y en este momento el ciclo se detiene.
Despues de tener todos los numeros en la lista, se calcula la suma recorriendo la lista con un for y acumulando los valores en una variable y luego se calcula la media, dividiendo la suma entre el tamaño de kla lista usando lista.size().
Al finalizar el programa muestra en la consola la lista completa, la suma de todos los numeros y la media.
___________________________________________
Ejercicio#7:
Para este ejercicio utilizamos un ArrayList para trabajar la insercion y la eliminacion de elementos.
Primero se crea una lista vacia y se llena con los primeros 20 numeros pares, utilizando un ciclo for que multiplica cada numero por 2.
Despues se mostrara la lista inicial y se utiliza un Scanner para que el usuario ingrese un numero desde el teclado.
El programa busca la posicion correcta donde debe ir ese numero dentro de la lista para mantener el orden, usando un ciclo while. Una vez encontrada la posicion el numero se insertara en una lista con lista.add(pos, n).
Y finalizando se imprimira la lista final despues de la eliminacion.
___________________________________________
Ejercicio#8:
Para este ejercicio se debe analizar cuantas veces aparece cada numero dentro de una lista.
Primero cramos una ArrayList y se llena con 100 numeros aleatorios entre 1 y 20, luego el programa revisa cada numero del 1 al 20 para cada uno, recorre toda la lista contando cuantas veces aparece ese valor. Ese conteo se guarda en una variable llamada cont.
Se imprime en la consola cuantas veces aparece el numero y mientras se hace el conteo, el programa tambien guarda cual es el numero que mas se repite, al final se mostrara cual fue el numero mas frecuente dentro de la lista.
___________________________________________
Ejercicio#9:
En este ejercicio se trabaja con ordenamiento y separacion de numeros.
Primero creamos un ArrayList y se llena con 20 numeros aleatorios entre el 1 y 100.
Luego se mostrara la lista original y luego se organizara de forma ascendente usando Collections.sort(lista) y se imprime el resultado.
Despues se ordenara de forma descendente usando Collections.sort(lista, Collections.reverseOrder()).
Luego el programa crea dos listas  nuevas de las cuales una sera para guardar los numeros pares y otra para los numeros impares.
Recorriendo la lista se revisara cada numero:-si el numero es divisible entre 2 se agrega a la lista de pares, y si no, se agrega a la lista de impares.
Al final imprimira ambas listas para ver como quedaron a la hora de separar los numeros.
___________________________________________
Ejercicio#10:
En este ejercicio se trabaja con resultados de partidos de fútbol almacenados como texto.
Primero se define una cadena llamada datos donde están varios partidos con el formato:
equipo_local :: equipo_visitante :: goles_local :: goles_visitante.
Luego esa cadena se divide en varios partidos usando split(" "), y cada partido se guarda dentro de un ArrayList.
Después el programa recorre cada partido, separa sus datos usando split("::") y obtiene el nombre del equipo local, el visitante y los goles de cada uno.
Con esa información el programa realiza varias operaciones:
Muestra los partidos donde ganó el equipo visitante.
Cuenta cuántas veces ganó el Barcelona.
Cuenta cuántos partidos fueron ganados por el equipo local.
También revisa cuáles partidos terminaron en empate, guardándolos en otra lista llamada empates.
Finalmente se muestran los empates y el número total de partidos ganados por el equipo local.
___________________________________________
Main:
Todos los ejercicios(#6 - #10) se ejecutan desde el metodo main:
>Lista_hasta_diez()
>insertar_eliminar()
>frecuencia()
>ordenar_separar()
>liga()
Mostrando los resultados en la consola.
___________________________________________
- Gestor Matrices:

Ejercicio#11:
En este ejercicio se trabaja con una matriz de 4x4, por lo tanto lo primero sera crear la matriz con int[][] matriz = new int[4][4].
Después se utiliza un doble ciclo for para recorrer todas las filas y columnas y llenar la matriz con números aleatorios entre 0 y 49 usando random.nextInt(50).
Luego se usa un Scanner para que el usuario ingrese un número que quiere buscar dentro de la matriz.
El programa vuelve a recorrer toda la matriz comparando cada valor con el número que el usuario ingresó. Si encuentra el número, muestra en la consola la posición donde se encuentra, indicando la fila y la columna.
Si después de revisar toda la matriz el número no aparece, el programa muestra el mensaje “No fue encontrado”.
___________________________________________
Ejercicio#12:
En este ejercicio se trabaja con la diagonal secundaria de una matriz cuadrada. Primero se crea una matriz de tamaño 4x4 y se llena con números aleatorios entre -50 y 50.
Después se calcula la suma de los elementos que están en la diagonal secundaria. Esa diagonal se obtiene usando la posición [i][n-1-i], que corresponde a los elementos que van desde la esquina superior derecha hasta la esquina inferior izquierda.
El programa recorre esas posiciones y va sumando los valores en una variable llamada suma.
Al final se muestra en la consola la suma total de los elementos de la diagonal secundaria.
___________________________________________
Ejercicio#13:
En este ejercicio se verifica si una matriz es simétrica. Se crea una matriz de 3x3 con valores definidos.
Una matriz es simétrica cuando los elementos cumplen que m[i][j] es igual a m[j][i], es decir, que la matriz es igual a su transpuesta.
Para comprobar esto, el programa recorre toda la matriz con dos ciclos for y compara cada elemento con su posición inversa. Si encuentra algún valor diferente, la matriz deja de ser simétrica.
Luego se imprime en la consola si la matriz es o no simétrica.
Además, el programa también muestra los elementos de las cuatro esquinas de la matriz para visualizarlos.
___________________________________________
Ejercicio#14:
En este ejercicio se calcula la matriz transpuesta. Primero se define una matriz de tamaño 2x3 con algunos valores.
Después se crea otra matriz llamada t que tendrá el tamaño 3x2, que es el tamaño inverso de la matriz original.
El programa recorre la matriz original y copia sus valores intercambiando las posiciones de fila y columna, es decir, el valor de m[i][j] se guarda en t[j][i].
De esta forma se obtiene la matriz transpuesta. Finalmente se recorre la nueva matriz y se imprime en la consola.
___________________________________________
Ejercicio #15:
En este último ejercicio se trabaja con una matriz 3x3. Primero se crea la matriz y se llena con números aleatorios entre 0 y 9.
Luego el programa intercambia los valores de la primera fila con la segunda fila. Para hacerlo, recorre cada columna y utiliza una variable temporal llamada temp para guardar el valor mientras se realiza el intercambio.
Después de hacer el intercambio, se imprime la matriz completa en la consola para mostrar cómo quedaron los valores después de cambiar las filas.
___________________________________________
Main
Todos estos ejercicios se ejecutan desde el método main.
Dentro de este método se llaman los diferentes métodos:
buscar_numero(), diagonal_secundaria(), matriz_simetrica(), transpuesta(), intercambiar_filas()
Cada uno se ejecuta en orden y muestra su resultado en la consola.









