package basic;

public class CharDataTypes {
   public static void main(String[] args) {

        char alok = 'a';
        System.out.println(alok);
        char ankit = '-';
        System.out.println(ankit);
        char ayan = '+';
        System.out.println(ayan);

        //ASCII VALUES(USING TYPECASTING)
        //CHARACTER TO INTEGER

        char ch = 'a';
        int x = ch; //implicit typecasting
        System.out.println(x);

        char CH = 'a';
        int y = (int)CH; //explicit typecasting
        System.out.println(x);

        char z = '3';
        System.out.println((int)z);

        char a = 'a';
        System.out.println(a+0);

        char b = 'a';
        System.out.println(b+b);

        //INTEGER TO CHARACTER
        int w = 39;
        char ALOK = (char)x;
        System.out.println(ALOK);

        int M = 32;
        char ANKIT = (char)M;
        System.out.println(ANKIT);

        int m = 51;
        char AYAN = (char)m;
        System.out.println(AYAN);

    }
}
