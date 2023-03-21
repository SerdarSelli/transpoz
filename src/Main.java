import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[][] matris = {{1,2,3},{4,5,6},{3,6,5},{5,7,2}};
        int[][] tmatris = new int[matris[0].length][matris.length] ;
        // yukarıda matrisin transpozunun satır ve sütün sayılarını belirledik


        for (int i = 0 ; i < matris.length;i++){
            for (int j = 0 ; j < matris[i].length; j++){
                    tmatris[j][i]=matris[i][j]; //transpoz alınırken kordinatlar yer değişiyor, (x,y) => (y,x) bu şekilde ayarladım
            }
        }

        // aşağıya matrisin transpozunu yazdırdık

        for (int[] i : tmatris){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }

        // toString metodu çok boyutluda çalışmıyor oyüzden bunu buldum

        System.out.println(Arrays.deepToString(tmatris));
    }
}