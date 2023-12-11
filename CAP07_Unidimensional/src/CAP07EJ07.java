public class CAP07EJ07 {
    public static int[] rellenaValores(int valores){
        int[] _valores = new int[valores];
        for(int i=0; i<valores;i++)
            _valores[i]=(int)(Math.random()*21);
        return _valores;
    }
    public static void imprimeValores(int[] valores){
        for(int valor:valores)
            System.out.print(""+valor+" ");
        
    }
    public static void imprimeCambiando(int[] valores, int valor, int otro){
        for(int i = 0; i<valores.length;i++){
            if(valores[i]==valor)
                System.out.print("\""+otro+"\" ");
            else
                System.out.print(valores[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] valores = rellenaValores(100);
        imprimeValores(valores);
        System.out.print("Introduzca un número de los que se han mostrado: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int otro = Integer.parseInt(System.console().readLine());
        imprimeCambiando(valores, valor, otro);
    }
}