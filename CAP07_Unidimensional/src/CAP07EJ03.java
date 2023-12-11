public class CAP07EJ03 {
    public static void imprimirArray(int[] array){
        System.out.println("Los números introducidos, al revés, son los siguientes:");
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
        int[] valores = new int[10];
        for(int i = 0; i < 10; i++){
            int valor = Integer.parseInt(System.console().readLine());
            valores[valores.length-i-1]=valor;
        }
        imprimirArray(valores);
    }
}
