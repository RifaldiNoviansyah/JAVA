package pkg15.penggunaan.operator;
public class PenggunaanOperator {
    public static void main(String[] args) {
        char menikah='Y';
        double gajipokok,tunjangan;
        gajipokok=1000000;
         tunjangan=(menikah =='Y')?0.2*gajipokok:0;
         System.out.println("gaji pokok  = "+gajipokok);
         System.out.println("tunjangan   = "+tunjangan);
    }
    
}
