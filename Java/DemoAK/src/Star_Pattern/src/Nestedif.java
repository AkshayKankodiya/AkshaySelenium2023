package Star_Pattern.src;

public class Nestedif {
    public static void main(String[] args) {
        int salary = 22000;
        if (salary >= 20000) {
            if (salary >= 25000) {
                System.out.println("You are promoted and get bonus too");
            } else {
                System.out.println("Congratulation you are promoted");
            }
        } else {
            System.out.println(" you need to work hard");
        }
    }
    }

