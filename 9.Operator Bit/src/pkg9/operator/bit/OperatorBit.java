package pkg9.operator.bit;
public class OperatorBit {
    public static void main(String[] args) {
        int a = 60; // 60 dalam bit = 0011 1100
        int b = 13; // 13 dalam bit = 0000 1101
        int c = 0;
            c = a & b;
        System.out.println("a & b = "+c); //hasil 12 = 0000 1100
            c = a | b;
        System.out.println("a | b = "+c); //hasil 61 = 0011 1101 
            c = a ^ b;
        System.out.println("a ^ b = "+c); //hasil 49 = 0011 0001
            c = ~a;
        System.out.println("~a    = "+c); //hasil -61 = 1100 0011
            c = a << 2;
        System.out.println("a << 2 = "+c); //hasil 240 = 1111 0000
            c = a >> 2;
        System.out.println("a >> 2 = "+c); //hasil 15 = 0000 1111
        
    }
    
}
