
package video100;

/**
 *
 * @author Carolina EM
 */
public class Video100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==j){
                    matriz[i][j]=1;
                }
                else {
                    matriz[i][j]=0;
                }
            }
        }
        
        //Imprimimos la matriz
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
