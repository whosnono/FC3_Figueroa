//Figueroa Hernandez Sofia Belem
package Array;

public class ArrayNxN {

    public static void main(String[] args) {

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        int[][] res = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = (int) (Math.random() * (20 - - 20) + -20);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = (int) (Math.random() * (20 - - 20) + -20);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                res[i][j]= res[i][j] + arr1[i][k] * arr2[k][j];
                }   
            }
        }
        System.out.println("Este es el primer arreglo: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Este es el segundo arreglo: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Este es el resultado de su multiplicacion: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
