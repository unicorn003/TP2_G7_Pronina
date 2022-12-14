import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Quel exercice ? Saisissez :\n" +
                "1. Discriminant\n" +
                "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum\n" +
                "4. Égalité entre chaînes de caractères\n" +
                "5. Factorielle\n" +
                "6. Compte à rebous\n" +
                "7. Valeurs de carrés\n" +
                "8. Table de multiplication\n" +
                "9. Division d’entiers\n" +
                "10. Règle graduée\n" +
                "11. Nombres premiers\n" +
                "12. Manipulations sur un tableau\n");
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
    public static void tableMultiplication(){
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
    public static void initialisationTableau() {
        int[] tableau = new int[10];
        int somme = 0;
        int min = tableau[0];
        int max = tableau[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] > max)
                max = tableau[i];
            if (tableau[i] < min)
                min = tableau[i];
        }
        System.out.println("Votre maximus est " + max);
        System.out.println("Votre minimum est " + min);
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        System.out.println("la somme de tableau est égal " + somme);
        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] % 2 == 0)
                System.out.print(tableau[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] % 2 != 0)
                System.out.print(tableau[i] + " ");
        }
    }
    public static void inverseTableau(int[] tableau){
        int n = tableau.length;
        int[] inverseTableau = new int[n];
        n--;
        int i = 0;
        for( ; n >= 0; n--){
            inverseTableau[i] = tableau[n];
            i++;
        }
        for (int j = 0; j < tableau.length; j++)
            System.out.print(tableau[j]+" ");
        System.out.print("\n");
        for(int k = 0; k < inverseTableau.length; k++)
            System.out.print(inverseTableau[k]+" ");
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int nombre;
        do {
            System.out.println("Veuillez saisir un entier positif entre de 1 et 12");
            nombre = scanner.nextInt();
        } while (nombre <= 0);
        switch (nombre){
            case 1 :
                discriminant();
                break;
            case 2 :
                parite();
                break;
            case 3:
                max();
                min();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                break;
            default:
                int[] test  = new int[]{34,5,77,1,8,9,34,80,3,9};
                inverseTableau(test);
        }
    }
}