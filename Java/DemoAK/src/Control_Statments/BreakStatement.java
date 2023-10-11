package Control_Statments;

public class BreakStatement
{
    public static void main(String[] args)
    {
        int j = 10;
        for (int i = 1; i <= j; i++)
        {
            if (i != 6)
            {
                break;
            }
            System.out.println(i);
        }
    }

}
