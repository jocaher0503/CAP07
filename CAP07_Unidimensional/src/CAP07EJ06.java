public class CAP07EJ06 {
    public static int[] obtenerValores(int valores){
        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        int[] _valores = new int[valores];
        for(int i = 0; i<valores;i++){
            _valores[i]=Integer.parseInt(System.console().readLine());
        }
        return _valores;
    }

    public static int maximo(int[] valores){
        int maximo = Integer.MIN_VALUE;
        for(int valor:valores){
            if(valor>maximo)
                maximo = valor;
        }
        return maximo;
    }

    public static void rotar(int[] valores){
        int ultimo = valores[valores.length-1];
        for(int i = valores.length-1; i>0;i--)
            valores[i]=valores[i-1];
        valores[0]=ultimo;
    }

    public static void imprimirArray(int[] valores){
        int digitos = (""+maximo(valores)).length()+1;
        for(int i=0; i<valores.length; i++)
            System.out.printf("|%"+digitos+"d ",i);
        System.out.println();
        for(int i=0; i<valores.length; i++)
            for(int j=0; j<digitos+2;j++)
                System.out.print("-");
        System.out.println();
        for(int valor:valores)
            System.out.printf("|%"+digitos+"d ", valor);
        System.out.println();
    }
    public static void main(String[] args) {
        int[] valores = obtenerValores(15);
        System.out.println("Array original");
        imprimirArray(valores);
        rotar(valores);
        System.out.println("Array rotado a la derecha una posición:");
        imprimirArray(valores);
    }
}
