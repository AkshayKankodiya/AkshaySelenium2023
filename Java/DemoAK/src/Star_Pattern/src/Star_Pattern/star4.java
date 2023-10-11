package Star_Pattern.src.Star_Pattern;

public class star4 {
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a=1;a<=5;a++){
            for (int b=4;b>=a;b--){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
