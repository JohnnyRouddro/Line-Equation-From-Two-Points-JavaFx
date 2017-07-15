import static java.lang.Math.abs;

public class LineEquation {
    int a;
    String result;
    
    public String getEq(int x1, int y1, int x2, int y2){
        a = (y1-y2)/(x1-x2);
        result = String.format("y = %d%s %s %d", a, (a==0)?"":"x", ((y1-x1*a)<0)?"-":"+", abs(y1-x1*a));
        return result;
    }
    
}
