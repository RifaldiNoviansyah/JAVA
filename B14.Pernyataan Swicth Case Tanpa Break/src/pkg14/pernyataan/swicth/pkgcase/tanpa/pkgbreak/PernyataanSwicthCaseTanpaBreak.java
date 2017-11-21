package pkg14.pernyataan.swicth.pkgcase.tanpa.pkgbreak;
public class PernyataanSwicthCaseTanpaBreak {
    public static void main(String[] args) {
  
     char index;
        index = 'C';
     switch (index){
         case 'A' : System.out.println("sangat baik");
         case 'B' : System.out.println("baik");
         case 'C' : System.out.println("cukup");
         case 'D' : System.out.println("kurang");
         case 'E' : System.out.println("sangat kurang");
         default : System.out.println("ngak tau ah"); //default berfungsi ketika pilihan tidak ada di case
        }//tutup index
    }
}
