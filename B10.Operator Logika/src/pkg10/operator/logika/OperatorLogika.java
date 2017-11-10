package pkg10.operator.logika;
public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("a && (and) b = "+(a&&b));
        System.out.println("a || (or)  b = "+(a||b));
        System.out.println("!a   (not)   = "+ !a);
        System.out.println("!(a && b) = "+ !(a && b));
    }
    
}
