package pkg2.tipe.bilangan.bulat;
public class TipeBilanganBulat {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        //pendeklarasian isi variabel
          b = 120;
          s = 32767;
          i = 1_000_000_000;
          l = 90000000000L;
        //tampilkan isi variabel
          System.out.println("byte  : "+b);
          System.out.println("short : "+s);
          System.out.println("int   : "+i);
          System.out.println("long  : "+l);
          System.out.println("byte  : 0b"+Integer.toBinaryString(b));
          System.out.println("short : 0" +Integer.toOctalString(s));
          System.out.println("int   : 0x"+Integer.toHexString(i));
    }
    
}
