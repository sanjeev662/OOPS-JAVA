import java.lang.*; 
public class ComplexMagnitudeArgument {
    public static void main(String[] args) {
    int x=4; //real part
    int y=3;  //imaginary part
    int s=2;
    double c=(Math.pow(x,s)+Math.pow(y,s));
    double magnitude=Math.sqrt(c);
    double argument=Math.atan(y/x);
    System.out.println("Magnitude= "+magnitude+ "argument= "+argument);
    }
}
