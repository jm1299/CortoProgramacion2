package corto;

import javax.swing.DefaultListModel;

public class Estudiante {

    final DefaultListModel model = new DefaultListModel();

    private String nombre, apellido, grado, carnet;

    public Estudiante(String nombre, String apellido, String grado, String carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.carnet = carnet;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    // En este metodo genero un carent aleatorio con dos letras y cuatro numeros
    public void carnet() {

//Declaramos las variables que vamos a usar
        Estudiante generador = new Estudiante();
        String LetrasMay1, LetrasMay2, numeros1, numeros2, numeros3, numeros4, resultado = "";

        int numeroCaracteres = 1;//Esta variable indica el número de carácteres que vamos a usar para hacer unico al usuario

        LetrasMay1 = "ABCDEFGHIJQLMNÑOPQRTSUVWXYZ";//Declaramos el abecedario en minúscula

        LetrasMay2 = "ABCDEFGHIJQLMNÑOPQRTSUVWXYZ";//Declaramos el abecedario en mayúscula

        numeros1 = "1234567890";//Declaramos los números
        numeros2 = "1234567890";//Declaramos los números
        numeros3 = "1234567890";//Declaramos los números
        numeros4 = "1234567890";//Declaramos los números

        resultado = generador.aleatorio(resultado, LetrasMay1, numeroCaracteres);
        resultado = generador.aleatorio(resultado, LetrasMay2, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros1, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros2, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros3, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros4, numeroCaracteres);

        String arrayPalabras[] = resultado.split("");

        resultado = "";

        for (int i = 0; arrayPalabras.length > i; i++) {

            resultado = resultado + arrayPalabras[i];

        }

    }

//Este es el método generados de números y letras aleatorios
    public String aleatorio(String resultado, String palabras, int numero) {

        String[] arrayPalabra = palabras.split("");

        int numeroAleatorio = 0;

        for (int i = 0; i < numero; i++) {

            numeroAleatorio = (int) (Math.random() * (arrayPalabra.length - 1) + 0);

            resultado = resultado + arrayPalabra[numeroAleatorio];

        }

        return resultado;

    }
}
