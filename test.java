/*                                                      Conversion celsius Fahrenheit:
 *
 *  Rappel:
 *  --------
 *  formule de conversion pour passer des degrés Celsius en degrés Fahrenheit : F=9/5×C+32
 *  
 *  Pour l'opération inverse, c'est comme ceci : C=((F−32)×5)/9
 *
 *  Pricinpe:
 *  ---------
 *  	creation d'un programme qui le passage d'une temperature du celsius au Fahrenheit et vis versa.
 *
 * 
 * auteur:   REICH VIRI
 *
 *
 * */



import java.util.Scanner;


public class test{
	 public static void main(String[] args)
		 {

			 Scanner sc = new Scanner(System.in);
			 char replay = ' ', choix = ' ';
do
 { //bouble principale

    System.out.println("\n conversion Celsius - Fahrenheit");

    System.out.println(" 1.Celsius vers Fahrenheit");
    System.out.println(" 2. Fahrenheit vers celsius");

/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                                                                                   *
 * on teste le choix, s'il est different de 1 ou de 2 on redemande de faire le choix *
 *                                                                                   *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/
    do
     {	
       	System.out.print("    -Entrer votre choix: ");
        choix = sc.nextLine().charAt(0);
	
      	if(choix !='1' && choix != '2'){System.out.println("\nla valeur saisir n'est pas consideree, recommencer");}
     }while(choix != '1' && choix != '2');

/*------------------------------------------------------------------------------------
 *                                                                                   * 
 *                                                                                   *
 *         A la sortie, le choix vaut soit 1 soit 2                                  *
 *                                                                                   *
 *                                                                                   *
 *---------------------------------------------------------------------------------- */


   if(choix == '1'){celsius_Fahrenheit();} //si le choix est 1 on appelle la fonction celsius_Fahrenheit()

   if(choix == '2'){Fahrenheit_celsius();} //si le choix est 2 on appelle la fonction Fahrenheit_celsius()


/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                                                                                   *
 *                on demande si l'utilisateur veur recommencer                       *
 *                 on redemande tant que sa reponse n'est ni 'o' ni 'n'              *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/
   do
    { 
      System.out.println("voulez vous recommencer o/n?: ");

      replay = sc.nextLine().charAt(0);

      	if(replay !='o' && replay != 'n'){System.out.println("\nla valeur saisir n'est pas consideree, recommencer");}


    }while(replay != 'o' && replay != 'n');

/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                                                                                   *
 *                   A la sortie on a  'o':oui ou 'n':non                            *
 *                                                                                   *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/

  }while(replay == 'o' || replay == 'O'); //on reprend tout le programme quand replay = 'o'
	

	System.out.println("--Au revoir--");//on arrive ici si et seulement si replay = 'n' 


/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                                                                                   *
 * 		        fin du proramme                                              *
 *                                                                                   *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/
	

   }   public static double arrondi(double A, int B) {
	
/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                fonction permettant d'arrondir la reponse obtenue                  *
 *                                                                                   *
 *                                                                                   *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/
 	        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);




	    }  public static void celsius_Fahrenheit(){

/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                On entre dans cette fonction quand le choix de                     *
 *                            l'utilisateur est 1                                    *
 *                                                                                   *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/
	double valeurDonnee, valeurRendue;

        	Scanner sc = new Scanner(System.in);

	        System.out.println(" ------ Conversion Celsius en Fahrenheit ------");

	        System.out.println(" valeur a convertir: ");
						
		valeurDonnee = sc.nextDouble();

		  valeurRendue = (9.0/5.0 * valeurDonnee) + 32.0;

	       
	       System.out.println(arrondi(valeurRendue, 2) +" °F");

/*
 * PS: arrondi(valeurRendue, 2) signifie:
 *		-> On envoie à la fonction arrondie deux valeurs; le resultat de 
 *	du calcul et le nombre de chiffre après la virgule.
 *
 *		-> le resultat rendu par la fonction "arrondi" est une valeur decimale
 *	donc on peut l'afficher directement.
 *
 */


			} public static void Fahrenheit_celsius(){
			 
/*-----------------------------------------------------------------------------------
 *                                                                                   *
 *                On entre dans cette fonction quand le choix de                     *
 *                            l'utilisateur est 2                                    *
 *                                                                                   *
 *                                                                                   *
 *-----------------------------------------------------------------------------------*/
			double valeurDonnee, valeurRendue;

			       Scanner sc = new Scanner(System.in);

				System.out.println(" ------ Conversion Fahrenheit en celsius ------");

				System.out.println(" valeur a convertir: ");
						
			        valeurDonnee = sc.nextDouble();

				valeurRendue = ((valeurDonnee - 32)*5)/9;

							
		       	        System.out.println(arrondi(valeurRendue, 2) +" °C");

		      }


	 }
