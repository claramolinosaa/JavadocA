
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
/**
 * Clase {@code operaciones} que ofrece métodos para realizar operaciones matemáticas
 * específicas como calcular el módulo, el cuadrado de un número, y la raíz cuadrada.
 * 
 * Esta clase ayuda a manejar cálculos matemáticos comunes necesarios en diversas aplicaciones,
 * asegurando que las operaciones como la división por cero o raíces de números negativos sean
 * manejadas apropiadamente.
 */
public class operaciones {

    /**
     * Calcula el módulo de dos enteros.
     * 
     * Este método lanza una excepción {@link IllegalArgumentException} si el divisor es cero.
     * 
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resto de la división de {@code a} sobre {@code b}.
     * @throws IllegalArgumentException Si {@code b} es igual a cero, ya que la división por cero
     *                                  no está permitida.
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Calcula el cuadrado de un número entero.
     * 
     * @param a El número a elevar al cuadrado.
     * @return El cuadrado de {@code a}.
     */
    public int calcularCuadrado(int a) {
        return a * a;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * 
     * Este método lanza una excepción {@link IllegalArgumentException} si el número es negativo.
     * 
     * @param a El número del cual calcular la raíz cuadrada.
     * @return La raíz cuadrada de {@code a}.
     * @throws IllegalArgumentException Si {@code a} es menor que cero, ya que no se puede calcular
     *                                  la raíz cuadrada de un número negativo.
     */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}