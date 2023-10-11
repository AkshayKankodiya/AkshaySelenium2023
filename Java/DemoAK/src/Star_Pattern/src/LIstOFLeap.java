package Star_Pattern.src;

public class LIstOFLeap {
    public static void main(String[] args) {
        int Year;
        for (Year = 1900; Year <= 2000; Year++)

            if ((Year %4==0) && (Year%100!=0))
            {
                System.out.println(" This is the Leap Year " + Year);
            }
    }
}