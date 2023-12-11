public class CAP07EJ02 {
    public static void imprimirArray(char[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }
    public static void main(String[] args) {
        char[] simbolos = new char[10];
        simbolos[0] = 'a';
        simbolos[1] = 'x';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';
        imprimirArray(simbolos);
    }
    
}
