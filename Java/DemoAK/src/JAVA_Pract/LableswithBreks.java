package JAVA_Pract;

public class LableswithBreks {
    public static void main(String[] args) {
        for (int y = 0; y < 3; y++) {
            one:
            {                              //break statement with Lables
                two:
                {
                    three:
                    {
                        System.out.println("This Is Y  =" + y);
                        if (y == 0)
                            break one;
                        if (y == 1)
                            break two;
                        if (y == 2)
                            break three;
                    }
                    System.out.println("This is 3rd lable ");
                }
                System.out.println("This is 2nd lable ");
            }
            System.out.println("This is 1st lable ");

        }
    }
}