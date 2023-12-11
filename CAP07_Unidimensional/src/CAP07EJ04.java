public class CAP07EJ04 {
    public static int[] rellenaArray(int longitud){
        int[] valores = new int[longitud];
        for(int i=0; i<longitud; i++)
            valores[i]=(int)(Math.random()*100);
        return valores;
    }
    public static void main(String[] args) {
        int[] valores = rellenaArray(20);
        System.out.print("  n  |   n2   |   n3   \n");
        System.out.print("_______________________\n");
        for(int valor:valores){
            System.out.printf("%4d |%7d |%7d %n",valor, valor*valor, (int)Math.pow(valor,3));
        }
    }
}
