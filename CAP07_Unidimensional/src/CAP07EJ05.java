public class CAP07EJ05 {
    public static void main(String[] args) {
        int[] num=new int[10];
        int maximo=Integer.MAX_VALUE;
        int minimo=Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            System.out.print("Por favor, introduzca un número: ");
            num[i]=Integer.parseInt(System.console().readLine());
            if (num[i]>maximo) {
                num[i]=maximo;
            } else if (num[i]<minimo) {
                num[i]=minimo;
            }
        }
        System.out.println();
        for(int i=0; i<10; i++){
            System.out.println(num[i]);
            if (num[i]==maximo) {
                System.out.print(" máximo");
            } else if (num[i]==minimo) {
                System.out.print(" mínimo");
            }
        }
        System.out.println();
    }
}
