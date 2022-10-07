import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       regle();
    }
    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c); //Le discriminant est le carré du deuxième coefficient moins le produit de 4 par le premier coefficient par le troisième coefficient.
        if (delta < 0) {
            float x1 = (float)(Math.sqrt(-1*delta)-1*b)/(2*a);
            float x2 = (float)(-1*Math.sqrt(-1*delta)-1*b)/(2*a);
            System.out.println("Votre x1 avec de i est égal avec de i  " + x1);
            System.out.println("Votre x2 avec de i est égal  " + x2);
        }
        else if (delta == 0) {

            float x0 = (float)(-1*b)/(2*a);
            System.out.println("Votre x est égal  " + x0);
        }
        else {
            float x1 = (float)(Math.sqrt(delta)-1*b)/(2*a);
            float x2 = (float)(-1*Math.sqrt(delta)-1*b)/(2*a);
            System.out.println("Votre x1 est égal  " + x1);
            System.out.println("Votre x2 est égal  " + x2);
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
            System.out.println("Vos lignes sont pas égal");
    }
    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            n = scanner.nextInt();
        } while (n < 0);
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
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        int entier;
        do {
            System.out.println("Veuillez saisir un entier positif et not nul");
            entier = scanner.nextInt();
        } while (entier < 0);
        String regle = "|";
        int reste = entier % 10;
        int douzaines = entier / 10;
        for (int i = 0; i < douzaines; i++)
            regle += "---------|";
        for (int i = 0; i < reste; i++)
            regle +="-";
        System.out.println("Votre nombre avec des douzaines est \n" + regle);
    }
    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            nombre = scanner.nextInt();
        } while (nombre <= 0);
        int k = 2; //déterminer le nombre minimal de diviseurs. Si nous en trouvons d'autres, nous augmentons ce nombre
        for(int i = 2; i< nombre/2; i++) //Tous les diviseurs possibles d'un nombre sont dans la moitié d'un nombre, donc on passe en revue tous les diviseurs comme des entiers après 2
            if (nombre % i == 0)
                k++;
        if (k > 2)
            System.out.println("nombre n'est pas premier");
        else
            System.out.println("nombre est premier");
    }
}