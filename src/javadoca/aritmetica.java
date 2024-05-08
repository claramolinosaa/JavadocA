
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
**
 * Clase {@code aritmetica} que proporciona métodos básicos para realizar
 * operaciones aritméticas como sumar, restar, multiplicar y dividir.
 * 
 * Esta clase es útil para manejar cálculos aritméticos simples de manera
 * eficiente y segura, evitando operaciones no permitidas como la división por cero.
 */
public class aritmetica {

    /**
     * Suma dos enteros.
     * 
     * @param a El primer entero a sumar.
     * @param b El segundo entero a sumar.
     * @return El resultado de la suma de {@code a} y {@code b}.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta un entero de otro.
     * 
     * @param a El minuendo.
     * @param b El sustraendo.
     * @return El resultado de restar {@code b} de {@code a}.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos enteros.
     * 
     * @param a El primer entero a multiplicar.
     * @param b El segundo entero a multiplicar.
     * @return El producto de {@code a} y {@code b}.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide un entero por otro.
     * 
     * Este método lanza una excepción {@link IllegalArgumentException} si el divisor es cero.
     * 
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de dividir {@code a} por {@code b} como un número decimal.
     * @throws IllegalArgumentException Si {@code b} es igual a cero, ya que no es posible dividir por cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

