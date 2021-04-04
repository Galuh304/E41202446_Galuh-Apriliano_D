import java.util.Scanner;

public class DoWhile
{
    Scanner input=new Scanner(System.in);
    public void counter()
    {
        int hitung=2;
        do
        {
            System.out.print("  "+hitung);
            hitung=(hitung*2);
        }
        while(hitung<=100);
    }
    public static void main(String[] args)
    {
        System.out.println("         Do__While         ");
        System.out.println("Bilangan kelipatan 2 (2-100)");
        System.out.println("============================");
        DoWhile mulai=new DoWhile();
        mulai.counter();
        System.out.println();
    }

}
