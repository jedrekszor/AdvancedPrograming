import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static void Exercise1() {
        System.out.println("Guess my number between 0 and 100");
        int rand = (int) (Math.random() * 100);
        while(true) {
            System.out.println("Give me an integer");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if(x > 100 || x < 0) {
                    continue;
                }else if(x == rand) {
                    System.out.println("You won! " + x + " is the correct number");
                    break;
                }else if(x > rand) {
                    System.out.println("Your number is too big");
                }else if(x < rand) {
                    System.out.println("Your number is too small");
                }
            }

        }
    }

    static void Exercise2() {
        System.out.println("Guess the number between 0 and 100, Type \"1\" if it is too small, \"2\" if it is too big and \"3\" if i guessed it");
        int bot = 0;
        int top = 100;
        int result = 50;
        boolean guessed = false;
        while(true) {
            System.out.println("Is it " + result + "?");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int x = scanner.nextInt();
                switch(x) {
                    case 1: {
                        bot = result;
                        result += (int)(top - bot)/2;
                    } break;
                    case 2: {
                        top = result;
                        result -= (int)(top - bot)/2;
                    } break;
                    case 3: {
                        System.out.println("I guessed it, nois");
                        guessed = true;
                    } break;
                    default: {
                        System.out.println("That's not an option");
                    }
                }
                if(guessed)
                    break;
            }

        }
    }

    static void Exercise3() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me the size of the array(int): ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                int[] array = new int[x];
                int i = 0;
                while (i < array.length) {
                    scanner = new Scanner(System.in);
                    System.out.println("Give me the integer No" + i + ": ");
                    if (scanner.hasNextInt()) {
                        array[i] = scanner.nextInt();
                        i++;
                    } else {
                        continue;
                    }
                }
                int max = array[0];
                for (i = 0; i < array.length; i++) {
                    System.out.println("Element No" + i + ": " + array[i]);
                    if (array[i] > max)
                        max = array[i];
                }
                System.out.println("Max element: " + max);
                break;
            } else {
                continue;
            }
        }
    }

    static void Exercise6() {
        int[][] ar1 = new int[4][4];
        int[][] ar2 = new int[4][4];
        int[][] result = new int[4][4];

        for(int i = 0; i < ar1.length; i++) {
            for(int j = 0; j < ar1[i].length; j++) {
                int rand = (int)(Math.random() * 100);
                ar1[i][j] = rand;
                rand = (int)(Math.random() * 100);
                ar2[i][j] = rand;
            }
        }

        for(int i = 0; i < ar1.length; i++) {
            for(int j = 0; j < ar1[i].length; j++) {
                System.out.print(ar1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n\t  +\n");
        for(int i = 0; i < ar1.length; i++) {
            for(int j = 0; j < ar1[i].length; j++) {
                System.out.print(ar2[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n\t  =\n");
        for(int i = 0; i < ar1.length; i++) {
            for(int j = 0; j < ar1[i].length; j++) {
                result[i][j] = ar1[i][j] + ar2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    static void Exercise8() {
        int tier = 0;
        ArrayList<Integer> triangle = new ArrayList<Integer>();
        ArrayList<Integer> previous = new ArrayList<Integer>();
        triangle.add(1);
        triangle.add(1);
        previous.add(1);
        while(true) {
            System.out.println("Give me the tier of the Pascal's Triangle: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                tier = scanner.nextInt();
                for(int i = 0; i < tier; i++) {
//                    SolarSystem.out.println(i);
                    if(i == 0)
                        System.out.println(previous);
                    else if(i == 1)
                        System.out.println(triangle);
                    else {
                        previous = new ArrayList<Integer>(triangle);
                        triangle.clear();
                        for (int j = 0; j <= previous.size(); j++) {
                            if(j == 0)
                                triangle.add(previous.get(0));
                            else if(j == previous.size())
                                triangle.add(previous.get(previous.size() - 1));
                            else {
                                triangle.add(previous.get(j - 1) + previous.get(j));
                            }
                        }
                        System.out.println(triangle);
                    }
                }
                break;
            }
        }

    }
}
