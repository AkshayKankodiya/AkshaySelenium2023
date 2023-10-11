package Star_Pattern.src.Star_Pattern;

public class star6 {
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int x=1;x<=5;x++){
            for (int y=1;y<=x;y++)
            {
                System.out.print(" ");
            }
            for (int l=5;l>=x;l--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
