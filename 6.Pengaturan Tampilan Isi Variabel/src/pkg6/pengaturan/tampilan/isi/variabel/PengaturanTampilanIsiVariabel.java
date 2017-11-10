package pkg6.pengaturan.tampilan.isi.variabel;

import java.util.Locale;

public class PengaturanTampilanIsiVariabel {
    public static void main(String[] args) {
        int  i = 3546764;
        int  iminus = -i;
        
        System.out.println("i       : "+i);
        System.out.println("%%d     : %d%n"+i);
        System.out.println("%%10d   : %10d%n"+i);
        System.out.println("%%+10d  : %+10d%n"+i);
        System.out.println("%%+10d  : %%10d%n"+iminus);
        System.out.println("%%,10d  : %,10d%n"+i);
        System.out.println("%%-10d  : %-10d%n"+i);
        
        double f = 5676482.982;
        System.out.println("f           : "+f);
        System.out.println("%%f         : %f%n"+f);
        System.out.println("%%.2f       : %.2f%n"+f);
        System.out.println("%%12.2f     : %12.2f%n"+f);
        System.out.println("%%,12.2f    : %,12.2f%n"+f);
        System.out.println(new Locale("in"+"id")+"%%,12.2f  : %,12.2f%n"+f);
        
        
    }
    
}
