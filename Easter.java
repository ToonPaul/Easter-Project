//Paul Hudalla
//This program calulates the date of Easter given a year after 1583
public class Easter{
    public static void main(String[] args) {
        //code goes here
        int year;
        int a = year%19;
        System.println("a = "+a);
        int b = year/100;
        System.println("b = "+b);
        int c = year%100;
        System.println("c = "+c);
        int d = b/4;
        System.println("d = "+d);
        int e = b%4;
        System.println("e = "+e);
        int f = (b+8)/25;
        System.println("f = "+f);
        int g = (b-f+1)/3;
        System.println("g = "+g);
        int h = (19 * a + b – d – g + 15)%30;
        System.println("h = "+h);
        int i = c/4;
        System.println("i = "+i);
        int k = c%4;
        System.println("k = "+k);
        int r = (32 + 2 * e + 2 * i - h - k)%7;
        System.println("r = "+r);
        int m = (a + 11 * h + 22 * r)/451;
        System.println("m = "+m);
        int n = (h + r - 7 * m + 114)/31;
        System.println("n = "+n);
        int p = (h + r - 7 * m + 114)%31;
        System.println("p = "+p);
    }
}
