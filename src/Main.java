import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        max();
    }
    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            float x1 = (float)(Math.sqrt(-1*delta)-1*b)/(2*a);
            float x2 = (float)(-1*Math.sqrt(-1*delta)-1*b)/(2*a);
            System.out.println("votre x1 est égal  " + x1);
            System.out.println("votre x2 est égal  " + x2);
        }
        else if (delta == 0) {

            float x0 = (float)(-1*b)/(2*a);
            System.out.println("votre x est égal  " + x0);
        }
        else {
            float x1 = (float)(Math.sqrt(delta)-1*b)/(2*a);
            float x2 = (float)(-1*Math.sqrt(delta)-1*b)/(2*a);
            System.out.println("votre x1 est égal  " + x1);
            System.out.println("votre x2 est égal  " + x2);
        }
    }
    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        if(a % 2 == 0)
            System.out.println("Votre nombre est pair et égal  " +  a);
        else
            System.out.println("Votre nombre est impair et égal  " + a);
    }
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        if(a >= b )
            System.out.println("Votre maximum est égal  " +  a);
        else
            System.out.println("Votre maximum est égal  " + b);
    }
    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        if(a >= b )
            System.out.println("Votre minimum est égal  " +  b);
        else
            System.out.println("Votre minimum est égal  " + a);
    }
    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre première ligne");
        String premiereChaine = scanner.nextLine();
        System.out.println("Entrez votre deuxière ligne");
        String deuxiemeChaine = scanner.nextLine();
        if (premiereChaine.equals(deuxiemeChaine))
            System.out.println("Vos lignes sont égal");


    }
}