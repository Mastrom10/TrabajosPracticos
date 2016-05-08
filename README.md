PRUEBA
# TrabajoPracticoJAVA - TP3: Algoritmos III

* Ejercicios Obligatorios: todos (excepto el de fibonnacci) - (elegir entre el 5 y el 6) *

* Sugerencia:  Previo a comenzar el desarrollo, investigue los métodos provistos por la clase String. *

##Ejercicio 1 - Expresión aritmética

Realice una función que reciba un String representando una expresión aritmética simple y devuelva el resultado como double.
Las expresiones a resolver son de la forma: dos operandos y un operador (+, -, *, /). Para simplificar la interpretación de las expresiones, el operando1 está separado por un carácter “blanco” del operador y el operador está separado por un carácter “blanco” del operando2.
Ejemplo de la expresión:
```
15 * 12
```
Resultado esperado:
```
15 * 12 = 180
```
Utilice el método split definido en el ejercicio anterior. Para convertir un String a entero utilice la siguiente sentencia

```
string operando1;
int a = Integer.parseInt(“45”);
```

## Ejercicio 2 - Prolog en Java
Desarrolle un programa que sepa interpretar un lenguaje declarativo para describir familias.
La sintaxis que el “programador” de este nuevo lenguaje puede usar, está acotada a
```
padre(nombre, nombre2)
madre(nombre3, nombre4)
```
El programa en este lenguaje se escribe en un archivo que se lee cuando arranca el programa. El path del archivo es uno de los parámetros.
Luego, el usuario podrá hacer preguntas sobre la base de los hechos declarados en el archivo. Los tipos de preguntas que se soportan son los siguientes
```
esHermano(unNombre, otroNombre)
esAbuelo(unNombre,otroNombre)
```
El programa deberá responder SI o NO a cada pregunta que le ingresen por consola.
Considere el uso de un mapa.
No necesita desarrollar test para este ejercicio, se opera desde la consola.


## Ejercicio 3 - Expresiones regulares en Java

Desarrolle una clase Verificadora que permita realizar las siguientes validaciones para un String dado:

* Un String representa un número de teléfono de Argentina.
* Un String es una dirección de mail
* Un String representa una fecha en el formato dd/mm/aaaa

Cada uno es un método diferente y debe utilizar expresiones regulares de Java.


## Ejercicio 4.a - Ahorcado en Java

Realice el juego del ahorcado. La computadora elige la palabra. Las posibles palabras las lee de un archivo. El usuario tiene que intentar adivinarla sin fallar más de 5 veces.
Se considera un fallo cuando el usuario arriesga una letra y la misma no está en la palabra o cuando arriesga una palabra que no es la elegida.
Luego de cada entrada del usuario, el programa debe mostrar la palabra completa hasta el momento. Para las letras no adivinadas debe mostrar un guión. Las letras se deben mostrar separadas por un blanco para que quede más legible. Cuando termine el juego debe informar el resultado.
No necesita desarrollar test para este ejercicio, se opera desde la consola. Si desea, investiga como desarrollar la GUI utilizando JavaFX


## Ejercicio 4.b - Expresión balanceada

Diseñe e implemente una solución que reciba como parámetro una expresión (como String)  del estilo {[1+2+(3*4)]/4} y devuelva un booleano que indique si está o no balanceada.
Pista: Piense en una pila.


## Ejercicio 5 - Matriz traspuesta
Realice un programa que reciba el path de un archivo de entrada que contiene una matriz y genere un archivo con la matriz traspuesta. El path del archivo de salida también se recibe como parámetro.
El Test debe ejecutar el programa y luego hacer validaciones para verificar que el archivo de salida tiene el resultado correcto. Para ello deberá leerlo y verificar por ejemplo que la cantidad de filas, es la cantidad de columnas de la matriz original.


## Ejercicio 6 - Me quedo con el de mayor varianza
Realice un programa que lee el path de un archivo con el siguiente formato
	```
	Id	campo1	 campo2 campo3 campo4
	```
El ID es un entero y el resto de los campos son double. Los ids pueden estar repetidos. El programa debe generar un archivo sin IDs repetidos.  En caso de que el ID esté repetido, con qué fila me quedo? Con la que tenga mayor varianza.
El path del archivo de salida también se recibe como parámetro.
El Test debe ejecutar el programa y luego hacer validaciones para verificar que el archivo de salida tiene el resultado correcto.

## Ejercicio 7.a - Factorial recursivo

Implemente factorial de forma recursiva

## Ejercicio 7.b - Factorial recursivo

Escriba un programa recursivo que reciba un número entero y devuelva el n-ésimo número de la serie de Fibonacci.


## Ejercicio 8 - Cadenas de forma recursiva (para pensar….y pensar)

Implemente un programa recursivo que permita generar todas las combinaciones de tamaño k de los literales “A” (representando Azul) y “N” (representando Blanco). k se toma como parámetro. El orden importa, es decir BNB es distinto a BBN.
Por ejemplo si k=3 las combinaciones son
	```
BBB
BBN
BNB
BNN
NBB
NBN
NNB
NNN
	```
El programa recibe el parámetro K y devuelve un arreglo de Strings con todas las combinaciones.
Piense (no es necesario que lo implemente) como lo resolvería iterativo.

