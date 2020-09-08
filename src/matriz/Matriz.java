
package matriz;

public class Matriz {

    int[][] enteros;
    int[][] enteros2;   
    
  
    public Matriz(int i, int j ){
        enteros=new int[i][j];
        enteros2=new int[i][j];
        
    }
    
    
    
    public void llenaMatriz(){
       int l=1;
       for (int i = 0; i < enteros.length; i++) {
           
           for (int j = 0; j < enteros[i].length; j++) {
               
               enteros[i][j]=l;
                l++;
               
           }
       }
       
   
   }
   public void llenarMatriz2(){
       
   int l=10;
       for (int i = 0; i < enteros2.length; i++) {
           for (int j = 0; j < enteros2[i].length; j++) {
               enteros2[i][j]=l;
               l++;
           }
       }
       
       
   
   }
   public void imprimirMatriz(){
       System.out.println("La primera matriz es: ");
       for (int i = 0; i < enteros.length; i++) {
           
           for (int j = 0; j < enteros[i].length; j++) {
               System.out.print(enteros[i][j]+" "
                        );
               
           }System.out.println(" ");
           
            
       }
   }
   public void imprimirMatriz2(){
       
       System.out.println("La segunda matriz es ");
       for (int i = 0; i < enteros2.length; i++) {
           for (int j = 0; j < enteros2[i].length; j++) {
               System.out.print(enteros2[i][j]+" "
               );
           }System.out.println(" ");
       }
   
   
   }
   public int[][] sumarMatrices(int [][] enteros, int [][]enteros2 ){
   int [][] resultado=new int[3][3];
       System.out.println("El resultado de la suma es: ");
       for (int i = 0; i < enteros.length; i++) {
           for (int j = 0; j < enteros[i].length; j++) {
               resultado[i][j]=enteros[i][j]+enteros2[i][j];
               System.out.print(resultado[i][j]+" ");
           }
           System.out.println(" ");
       }
   
   
   return resultado;
   }
   
}

