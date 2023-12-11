public class CAP07EJ05 {
    public static void main(String[] args) {
        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        int minimoPos = -1;
        int minimo = Integer.MAX_VALUE;
        int maximoPos = -1;
        int maximo = Integer.MIN_VALUE;
        int[] valores = new int[10];
        for(int i = 0; i<10;i++){
            valores[i] = Integer.parseInt(System.console().readLine());
            if(valores[i]>maximo){
                maximoPos = i;
                maximo = valores[i];
            }
            if(valores[i]<minimo){
                minimoPos = i;
                minimo = valores[i];
            }
        }
        for(int i = 0; i<10;i++){
            System.out.print(valores[i]);
            if(i==minimoPos)
                System.out.print(" mínimo");
            else if(i==maximoPos)
                System.out.print(" máximo");
            System.out.println();
        }
    }
}
