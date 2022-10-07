import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       division();
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
        else
            System.out.println("Vos lignes sont égal");
    }
    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println("Votre factorielle est égal  " + factorielle);
    }
    public static void countdown(){
        int i = 10;
        for(;i>=0;i--){
            System.out.println(i);
            if(i == 0)
                System.out.println("BOOM!");
        }
    }
    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de x ?");
        int x = scanner.nextInt();
        System.out.println("Vos valeurs sont égals");
        System.out.println(x +"\t "+x*x);
    }
    public static void TableMultiplication(){
        for (int i = 1; i < 11; i++){
            for (int j = 1; j < 11; j++)
                System.out.print(i*j+"\t");
            System.out.print("\n");
        }
    }
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        int entier;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            entier = scanner.nextInt();
        } while (entier < 0);
        int denominateur;
        do {
            System.out.println("Veuillez saisir un dénominateur positif et non nul");
            denominateur = scanner.nextInt();
        } while (denominateur <= 0);
        float division = (float) entier/denominateur;
        System.out.println("Division de deux nombres est égal " + division);
    }
}