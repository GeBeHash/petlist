import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Animal[] object;
        ArrayList<Animal> object = new ArrayList<Animal>();

        int opt = 0;
        int opt2 = 0;
        int opt3 = 0;
        int i = 0;
        int j = 0;

        while (opt != 3) {
            System.out.println(" 1 - Add new pet\n 2 - List pets\n 3 - Quit\n 4 - Remove pet");
            opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:

                    System.out.println(" 1 - Caine\n 2 - Pisica\n 3 - Papagal");
                    opt2 = scanner.nextInt();
                    scanner.nextLine();
                    String x, y;

                    switch (opt2) {
                        case 1:

                            System.out.print(" Nume: ");
                            x = scanner.nextLine();

                            System.out.print(" Varsta: ");
                            y = scanner.nextLine();

                            System.out.print(" Proprietate: \n 1 - Talie Mica\n 2 - Talie Mare\n");
                            opt3 = scanner.nextInt();
                            //scanner.nextLine();

                            switch (opt3) {
                                case 1:

                                    object.add(new Animal("Caine", x, y, "Talie Mare"));
                                    break;
                                case 2:

                                    object.add(new Animal("Caine", x, y, "Talie Mica"));
                                    break;
                            }
                            i++;
                            break;


                        case 2:

                            System.out.print(" Nume: ");
                            x = scanner.nextLine();

                            System.out.print(" Varsta: ");
                            y = scanner.nextLine();

                            System.out.print(" Proprietate: \n 1 - Linistita\n 2 - Agitata\n");
                            opt3 = scanner.nextInt();
                            //scanner.nextLine();

                            switch (opt3) {
                                case 1:

                                    object.add(new Animal("Pisica", x, y, "Linistita"));
                                    break;
                                case 2:

                                    object.add(new Animal("Pisica", x, y, "Agitata"));
                                    break;
                            }
                            i++;
                            break;


                        case 3:

                            System.out.print(" Nume: ");
                            x = scanner.nextLine();

                            System.out.print(" Varsta: ");
                            y = scanner.nextLine();

                            System.out.print(" Proprietate: \n 1 - Mic\n 2 - Mare\n");
                            opt3 = scanner.nextInt();
                            //scanner.nextLine();

                            switch (opt3) {
                                case 1:

                                    object.add(new Animal("Papagal", x, y, "Mic"));
                                    break;
                                case 2:

                                    object.add(new Animal("Papagal", x, y, "Mare"));
                                    break;
                            }
                            i++;
                            break;
                    }
                    break;


                case 2:

                    for (j = 0; j < i; j++) {
                        System.out.print( j+1 + " - ");
                        object.get(j).display();
                    }
                    System.out.println();
                    break;

                case 4:

                    for (j = 0; j < i; j++) {
                        System.out.print( j+1 + " - ");
                        object.get(j).display();
                    }
                    System.out.println();
                    opt2 = scanner.nextInt();
                    scanner.nextLine();
                    object.remove(opt2-1);
                    i--;
                    break;
            }



        }
        scanner.close();
    }
}
