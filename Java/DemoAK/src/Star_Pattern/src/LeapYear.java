package Star_Pattern.src;

public class LeapYear {
    public static void main(String[]args)
    {
        int Year=2020;
            if((Year % 4 == 0) && (Year % 100 != 0))
            {
                System.out.println(" This is The Leap Year " +Year);
            }
            else {
                System.out.println("This is not a Leap year");
            }
        }
    }

