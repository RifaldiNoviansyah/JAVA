package pkg21.penggunaan.pkgbreak.pkg2.pkgfor;
public class PenggunaanBreak2For {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=50;j++){
                System.out.println("i   : "+i+"     j   : "+j);
                if (j==2)
                     break;
            }//tutup for 2
        }//tutup for 1
    }
    
}
