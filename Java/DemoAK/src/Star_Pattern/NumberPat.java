package Star_Pattern;

public class NumberPat {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int k=1;k<=4;k++){
            for (int g=4;g>=k;g--)
            {
                System.out.print(k);

            }
            System.out.println();
        }
    }
}
