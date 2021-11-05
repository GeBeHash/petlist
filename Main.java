import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Animal[] object;
        //ArrayList<Animal> object = new ArrayList<Animal>();
        ArrayList<Caine> caine_arr = new ArrayList<Caine>();
        ArrayList<Pisica> pisica_arr = new ArrayList<Pisica>();
        ArrayList<Papagal> papagal_arr = new ArrayList<Papagal>();

        char opt = '0';
        int opt2 = 0;
        char opt3 = '0';
        int i_caine = 0, i_pisica = 0, i_papagal = 0;
        int j = 0;
        int opt4 = 0;

        while (opt != 'q') {
            System.out.println(" \n 1 - Add new pet\n 2 - Remove pet\n 3 - List pets\n\n q - Quit\n");
            opt = scanner.next().charAt(0);
            //scanner.nextLine();

            switch (opt) {
                case '1':

                    System.out.println("\n 1 - Caine\n 2 - Pisica\n 3 - Papagal\n");
                    opt2 = scanner.nextInt();
                    scanner.nextLine();
                    String x, y;
                    opt3 = '0';
                    switch (opt2) {
                        case 1:

                            System.out.print(" \nNume: ");
                            x = scanner.nextLine();

                            System.out.print(" \nVarsta: ");
                            y = scanner.nextLine();

                            System.out.print("\nProprietate: \n 1 - Talie Mica\n 2 - Talie Mare\n 3 - Vedere Buna\n 4 - Vedere Slaba\n\n q - Quit\n\n");
                            
                            //scanner.nextLine();
                            caine_arr.add(new Caine(x, y));
                            while (opt3 != 'q')
                            {
                                opt3 = scanner.next().charAt(0);
                                switch (opt3) {
                                    case '1':

                                        caine_arr.get(i_caine).addprop("Talie Mica");
                                        break;
                                    case '2':

                                        caine_arr.get(i_caine).addprop("Talie Mare");
                                        break;
                                    case '3':
                                    
                                        caine_arr.get(i_caine).addprop("Vedere Buna");
                                        break;
                                    case '4':

                                        caine_arr.get(i_caine).addprop("Vedere Slaba");
                                        break;
                                }
                                    
                            }
                            System.out.println("\n");
                            i_caine++;
                            break;


                        case 2:

                            System.out.print(" \nNume: ");
                            x = scanner.nextLine();

                            System.out.print(" \nVarsta: ");
                            y = scanner.nextLine();

                            System.out.print("\nProprietate: \n 1 - Agitata\n 2 - Cuminte\n 3 - Vedere Buna\n 4 - Vedere Slaba\n\n q - Quit\n\n");
                            
                            //scanner.nextLine();
                            pisica_arr.add(new Pisica(x, y));
                            while (opt3 != 'q')
                            {
                                opt3 = scanner.next().charAt(0);
                                switch (opt3) {
                                    case '1':

                                        pisica_arr.get(i_pisica).addprop("Agitata");
                                        break;
                                    case '2':

                                        pisica_arr.get(i_pisica).addprop("Cuminte");
                                        break;
                                    case '3':
                                    
                                        pisica_arr.get(i_pisica).addprop("Vedere Buna");
                                        break;
                                    case '4':

                                        pisica_arr.get(i_pisica).addprop("Vedere Slaba");
                                        break;
                                }
                                    
                            }
                            System.out.println("\n");
                            i_pisica++;
                            break;


                        case 3:

                            System.out.print(" \nNume: ");
                            x = scanner.nextLine();

                            System.out.print(" \nVarsta: ");
                            y = scanner.nextLine();

                            System.out.print("\nProprietate: \n 1 - Mic\n 2 - Mare\n 3 - Vedere Buna\n 4 - Vedere Slaba\n\n q - Quit\n\n");
                            
                            //scanner.nextLine();
                            papagal_arr.add(new Papagal(x, y));
                            while (opt3 != 'q')
                            {
                                opt3 = scanner.next().charAt(0);
                                switch (opt3) {
                                    case '1':

                                        papagal_arr.get(i_papagal).addprop("Agitata");
                                        break;
                                    case '2':

                                        papagal_arr.get(i_papagal).addprop("Cuminte");
                                        break;
                                    case '3':
                                    
                                        papagal_arr.get(i_papagal).addprop("Vedere Buna");
                                        break;
                                    case '4':

                                        papagal_arr.get(i_papagal).addprop("Vedere Slaba");
                                        break;
                                }
                                    
                            }
                            System.out.println("\n");
                            i_papagal++;
                            break;
                    }
                    break;


                case '3':

                    System.out.println("\nList of pets:");
                    for (j = 0; j < caine_arr.size(); j++) {
                        System.out.print( j+1 + " - ");
                        caine_arr.get(j).display_caine();
                    }
                    System.out.println();
                    for (j = 0; j < pisica_arr.size(); j++) {
                        System.out.print( j+1 + " - ");
                        pisica_arr.get(j).display_pisica();
                    }
                    System.out.println();
                    for (j = 0; j < papagal_arr.size(); j++) {
                        System.out.print( j+1 + " - ");
                        papagal_arr.get(j).display_papagal();
                    }
                    System.out.println();
                    break;

                /*case '2':

                    for (j = 0; j < i; j++) {
                        System.out.print( j+1 + " - ");
                        object.get(j).display();
                    }
                    System.out.println();
                    opt2 = scanner.nextInt();
                    scanner.nextLine();
                    object.remove(opt2-1);
                    i--;
                    break;*/

                case '2':
                    
                    System.out.println("What to remove?\n\n 1 - Caine\n 2 - Pisica\n 3 - Papagal");
                    opt2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (opt2) {
                        case 1:
                        for (j = 0; j < caine_arr.size(); j++) {
                            System.out.print( j + 1 + " - ");
                            caine_arr.get(j).display_caine();
                        }
                        System.out.println('\n');
                        
                        opt4 = scanner.nextInt();
                        scanner.nextLine();
                        caine_arr.remove(opt4 - 1);
                        i_caine--;
                        
                        break;

                        case 2:
                        for (j = 0; j < pisica_arr.size(); j++) {
                            System.out.print( j + 1 + " - ");
                            pisica_arr.get(j).display_pisica();
                        }
                        System.out.println('\n');
                        
                        opt4 = scanner.nextInt();
                        scanner.nextLine();
                        pisica_arr.remove(opt4 - 1);
                        i_pisica--;  

                        break;

                        case 3:
                        for (j = 0; j < papagal_arr.size(); j++) {
                            System.out.print( j + 1 + " - ");
                            papagal_arr.get(j).display_papagal();
                        }
                        System.out.println('\n');

                        opt4 = scanner.nextInt();
                        scanner.nextLine();
                        papagal_arr.remove(opt4 - 1);
                        i_papagal--;
                        
                        break;
                    }

            }



        }
        scanner.close();
    }
}
