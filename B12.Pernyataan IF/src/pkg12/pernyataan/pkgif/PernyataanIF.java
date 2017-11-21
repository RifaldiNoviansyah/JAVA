package pkg12.pernyataan.pkgif;
public class PernyataanIF {
    public static void main(String[] args) {
        int nilai;
        char index;
        nilai =90;
        if (nilai>=80)
                index = 'A';
        else if (nilai>=68)
                index='B';
        else if (nilai>=56)
                index='C';
        else if (nilai>=45)
                index ='D';
        else
                index='E';
        System.out.println("Nilai = "+nilai+" mempunyai index "+index);
    }
    
}
