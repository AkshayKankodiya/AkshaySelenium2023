package ArrayDemo;

public class A_Reverse {
    public static void main(String[] args) {

        char[] Name = {'R', 'E', 'T', 'S', 'E', 'T'};
        System.out.println("This is First String");
        for (int i = 0; i < Name.length; i++) {
            System.out.print(Name[i] + "  ");
        }
        System.out.println();
        System.out.println("This is Reverse String");
        for (int i = Name.length - 1; i >= 0; i--) {
            System.out.print(Name[i] + "  ");
        }
        System.out.println();
    }

}

