package basic;

public class IncrementDecrement {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println("---------");

        int l = 5;
        System.out.println(l--);
        System.out.println(l);
        System.out.println("---------");

        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        System.out.println("---------");

        int k = 5;
        System.out.println(--k);
        System.out.println(k);
        System.out.println("---------");

        int z = 5;
        int w = z++;
        System.out.println(z);
        System.out.println(w);
        System.out.println("---------");

        int m = 5;
        int p = ++m;
        System.out.println(m);
        System.out.println(p);
        System.out.println("---------");

        int e = 5;
        int f = e--;
        System.out.println(e);
        System.out.println(f);
        System.out.println("---------");

        int j = 5;
        int r = --j;
        System.out.println(j);
        System.out.println(r);
        System.out.println("---------");

        int a = 5;
        a += 3;
        System.out.println(a);
        System.out.println("---------");

        int b = 5;
        b -= 3;
        System.out.println(b);
        System.out.println("---------");

        int c = 5;
        c *= 3;
        System.out.println(c);
        System.out.println("---------");

        int d = 5;
        d /= 3;
        System.out.println(d);
        System.out.println("---------");


    }
}
