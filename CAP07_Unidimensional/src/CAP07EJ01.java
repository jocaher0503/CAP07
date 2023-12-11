public class CAP07EJ01 {
    public static void imprimirArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }
    public static void main(String[] args) {
        int[] array = new int[12];
        array[0] = 39;
        array[1] = -2;
        array[4] = 0;
        array[6] = 14;
        array[8] = 5;
        array[9] = 120;
        imprimirArray(array);

        
    }
}
