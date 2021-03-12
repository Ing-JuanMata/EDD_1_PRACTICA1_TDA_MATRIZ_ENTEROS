/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING-JUANMATA
 */
public class Matriz {

    private final int tam;
    private final int[][] datos;

    public Matriz(int tam) {
        this.tam = tam;
        datos = new int[tam][tam];
    }

    public boolean insertarValor(int valor, int fila, int columna) {
        if (tam > fila && tam > columna && fila >= 0 && columna >= 0) {
            datos[fila][columna] = valor;
            return true;
        }

        return false;
    }

    public int[][] getDatos() {
        return this.datos;
    }

    /**
     * Obtiene la sumatoria de todos los valores capturados en la matriz
     *
     * @return suma total de la matriz
     */
    public int sumarValores() {
        int suma = 0;
        for (int[] i : datos) {
            for (int j : i) {
                suma += j;
            }
        }
        return suma;
    }

    /**
     * Obtiene la suma de los valores capturados en un renglon de la matriz
     *
     * @param numRenglon Renglon a sumar
     * @return Suma total del valor del renglon
     */
    public int sumarValoresRenglon(int numRenglon) {
        int suma = 0;
        for (int i : datos[numRenglon]) {
            suma += i;
        }

        return suma;
    }

    /**
     * Obtiene la suma de los valores capturados en una columna determinada
     *
     * @param numColumna Columna a sumar
     * @return Valor de la suma en la columna
     */
    public int sumarValoresColumna(int numColumna) {
        int suma = 0;
        for (int[] i : datos) {
            suma += i[numColumna];
        }

        return suma;
    }

    /**
     * Permite hacer un cambio entre renglones de la matriz en cuestion
     *
     * @param ren1 Primer renglon a cambiar
     * @param ren2 Segundo renglon a cambiar
     * @return Confirmacion de la operacion realizada
     */
    public boolean intercambioRenglones(int ren1, int ren2) {
        if (tam > ren1 && tam > ren2 && ren1 >= 0 && ren2 >= 0) {
            int[] aux = datos[ren1];
            datos[ren1] = datos[ren2];
            datos[ren2] = aux;
            return true;
        }

        return false;
    }

    /**
     * Permite hacer un cambio entre columnas de la matriz en cuestion
     *
     * @param col1 Primer columna a cambiar
     * @param col2 Segunda columna a cambiar
     * @return Confirmacion de la operacion realizada
     */
    public boolean intercambioColumnas(int col1, int col2) {
        if (tam > col1 && tam > col2 && col1 >= 0 && col2 >= 0) {
            int aux;
            for (int[] i : datos) {
                aux = i[col1];
                i[col1] = i[col2];
                i[col2] = aux;
            }
            return true;
        }

        return false;
    }

    /**
     * Hace una copia de un renglon determinado en otro borrando los valores del
     * destino
     *
     * @param origen Renglon que se va a copiar
     * @param destino Renglon donde se va a copiar
     * @return Confirmacion de la operacion realizada
     */
    public boolean copiarRenglon(int origen, int destino) {
        if (tam > origen && tam > destino && origen >= 0 && destino >= 0) {
            datos[destino] = datos[origen];
            return true;
        }

        return false;
    }

    /**
     * Hace una copia de una columna determinada en otra borrando los valores
     * del destino
     *
     * @param colOrigen Columna que se va a copiar
     * @param colDestino Columna a donde se va a copiar
     * @return Confirmacion de la operacion relizada
     */
    public boolean copiarColuma(int colOrigen, int colDestino) {
        if (tam > colOrigen && tam > colDestino && colOrigen >= 0 && colDestino >= 0) {
            for (int[] i : datos) {
                i[colDestino] = i[colOrigen];
            }
            return true;
        }

        return false;
    }

    /**
     * Realiza la operacion de matriz inversa regresando la inversa de la matriz
     * actual
     *
     * @return matriz inversa
     */
    public int[][] inversa() {
        int[][] inversa = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                inversa[i][j] = datos[j][i];
            }
        }

        return inversa;
    }
}
