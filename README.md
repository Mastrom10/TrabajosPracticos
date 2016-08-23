# Consideraciones para el desarrollo de los TPs:

* Sugerimos el uso de IntellijIdea o Eclipse. Si utiliza IntelliJIdea, baje la versión “ultimate” y adquiera desde la misma página la key como alumno.
* Todo el código debe estar subido a su repositorio GIT. Para ello cree una cuenta en www.github.com
* Todos los TP de la materia estarán bajo un módulo principal llamado "Paradigmas". Para ello debe seguir los siguientes pasos. File -> New -> Project… -> Java

![Imagen Uno](https://github.com/Mastrom10/TrabajosPracticos/blob/master/ImagenesReadme/imagen1.png "Optional Title")

* Cada TP es un módulo separado. Para crear un nuevo módulo haga click derecho sobre el módulo principal “Paradigmas” y seleccione New -> Module

![Imagen Dos](https://github.com/Mastrom10/TrabajosPracticos/blob/master/ImagenesReadme/imagen2.png "Optional Title")

* Cada ejercicio es un paquete separado dentro de ese módulo.
* Cada uno de los ejercicios debe tener su correspondiente clase de Test que prueba la función implementada. Es la forma más ordenada y reproducible de probar su código. Además, durante la corrección, se correrán los tests de todos los ejercicios obligatorios. (ver en la siguiente página el instructivo para hacer los Tests)

* Toda clase debe estar documentada con el nombre de los integrantes del grupo.

* Si encuentra clases de utilidad que puedan ser usadas en más de un módulo, cree un módulo llamado “Utilidades” y aloje allì sus clases.



## Como implementar Test en IntelliJIdea

* Todos los test deben ir en la carpeta test. Para crear la carpeta test debe seguir los siguientes pasos
    * Seleccionar el módulo (por ejemplo TP1)
    * Segundo botón del mouse -> new directory y poner "test"
    * segundo botón del mouse sobre la carpeta "test" y seleccionar "mark directory as "test sources root"

![Imagen Tres](https://github.com/Mastrom10/TrabajosPracticos/blob/master/ImagenesReadme/Imagen3.png "Optional Title")

* Para crear la clase de Test de una clase C1 siga los siguientes pasos
    * Posicione el cursor en el editor de la clase C1
    * Presione CTRL + SHIFT + T
    * En los radio button, seleccione Junit4 (la primera vez deberá presionar el botón FIX para que baje la librería)
    * ![Imagen Cuatro](https://github.com/Mastrom10/TrabajosPracticos/blob/master/ImagenesReadme/Imagen4.png "Optional Title")
    * Seleccione los métodos de la clase para los cuales desea hacer test. Alcanza con que lo haga para el método principal que implementa la funcionalidad. Si desarrolló otros métodos para modularizar, no es obligatorio (aunque sugerido) que los testee.
    * Puede implementar más de un método test. Serán ejecutados todos los métodos que tengan la annotation @Test
    * Utilice los métodos estáticos de la clase Assert para agregar validaciones en su código. SI al correrlo hay alguna que da error, será informado claramente.
    * En el método setUp y tearDown puede escribir código. El método setUp se ejecutará antes de cada test y el tearDown luego de cada método marcado con el @Test test.
    * ![Imagen Cinco](https://github.com/Mastrom10/TrabajosPracticos/blob/master/ImagenesReadme/Imagen5.png "Optional Title")



# ANEXO

* Como leo valores enteros de la Consola?
```
Scanner sc = new Scanner(System.in);
String frase = sc.next();
```

* Como leo Strings de la Consola?
```
Scanner sc = new Scanner(System.in);
int cantidadDeHabitantes = sc.nextInt();
```

* Como leo valores a través de una GUI?
```
String frase = JOptionPane.showInputDialog("Introduzca una frase");
System.out.println(frase);
```
* Cómo obtener un número Random entre 0 y 2?
```
int numeroRandom = new Random().nextInt(3);
```
* Cómo convierto un String que tiene un valor numérico en un tipo numérico?
```
String unNumeroComoString="4";
int numero = new Integer(unNumeroComoString);
```

* Como leo un archivo?
```
try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\a.txt"));
      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
```

* Como escribo en un archivo?
```
try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\file.txt"));
      bufferedWriter.write("aLine");
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
```

* Como separo una línea por un carácter determinado?
    * Investigue el método Split.

