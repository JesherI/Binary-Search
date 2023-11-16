/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.search;

import java.util.Scanner;

/**
 *
 * @author jeshe
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Imprimir información sobre la iteración actual
            System.out.println("Iteración: derecha = " + left + ", izquierda = " + right + ", mitad = " + mid);

            // Verificar si el elemento medio es el objetivo
            if (arr[mid] == target) {
                return mid;
            } // Si el objetivo es menor, buscar en la mitad izquierda
            else if (arr[mid] > target) {
                right = mid - 1;
            } // Si el objetivo es mayor, buscar en la mitad derecha
            else {
                left = mid + 1;
            }
        }

        // Si no se encuentra el objetivo, devolver -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array ordenado (puedes cambiar estos valores según tus necesidades)
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        // Solicitar al usuario que ingrese el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int target = scanner.nextInt();

        // Realizar la búsqueda binaria
        int result = binarySearch(array, target);

        // Imprimir el resultado
        if (result != -1) {
            System.out.println("Elemento encontrado en el índice " + result);
        } else {
            System.out.println("Elemento no encontrado en el array");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
