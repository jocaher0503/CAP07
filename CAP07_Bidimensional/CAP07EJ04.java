package CAP07_Bidimensional;

public class CAP07EJ04 {
    public static int[][] rellenaMatriz(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(int)(Math.random()*100);
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] valores) throws InterruptedException{
        for(int i=0;i<valores.length;i++){
            int suma = 0;
            for(int j=0;j<valores[i].length;j++){
                suma+=valores[i][j];
                Thread.sleep(100);
                System.out.printf("%7d   ", valores[i][j]);
            }
            Thread.sleep(500);
            System.out.printf("|    %d%n", suma);
        }
        for(int i=0;i<valores[0].length*10+8;i++)
            System.out.print("-");
        System.out.println();
        int total = 0;
        for(int i=0;i<valores[0].length;i++){
            int suma = 0;
            for(int j=0;j<valores.length;j++)
                suma+=valores[j][i];
            Thread.sleep(500);
            System.out.printf("%7d   ", suma);
            
            total+=suma;
        }
        Thread.sleep(500);
        System.out.printf("|    %d%n", total);
    }
    public static void main(String[] args) {
        int[][] valores = rellenaMatriz(4, 5);

        try {
            imprimirMatriz(valores);
        } catch (InterruptedException e) {
            
        }
    }
 }