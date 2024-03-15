/*
4. Generar una matriz de 3×3 con números aleatorios sin repetirse
 */

public class ArrayNumRandomSinRepetir {
    public static void main(String[] args) {
        
        int max = 10, min = 0; 

        double[][] matriz = new double[3][3];
        double random;
        boolean repetido;

        //Bucle for anidado para repetir el proceso por cada elemento que haya en la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                //Do while: repetir lo siguiente mientras el número aleatorio se repita con algún valor (repetido = true)
                do {                    
                    repetido = false;  //Establecemos "repetido" en false, que seguirá siendo false a no ser que se repita un número
                    random = Math.floor(Math.random() * 10 * (max - min) + min) /10; //Genera números aleatorios del 0-10 con un decimal

                    //Volvemos a revisar todos los elementos de la matriz
                    for (int k = 0; k < matriz.length; k++) {
                        for (int l = 0; l < matriz[k].length; l++) {
                            
                            //Si el número aleatorio es igual a alguno de los elementos, "repetido" cambia a true y se ejecuta el bucle do while de nuevo
                            if (random == matriz[k][l]) {
                                repetido = true;
                            }
                        }
                    }
                } while (repetido); //Si el número no se ha repetido con ningún elemento de la matriz, deja de ejecutarse el bucle

                //Después de la comprobación, registramos el número aleatorio en la posición de la matriz que corresponda
                matriz[i][j] = random;
            }
        }

        //Imprimimos el array de números aleatorios
        System.out.println("Valores de la matriz de números aleatorios: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{  ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("}");
        }
        System.out.println("");

    }
}
