import java.io.*;
import java.util.*;
import static java.lang.System.*;
import java.util.Scanner;
class Main {
    public static void main (String str[]){
      Scanner scan = new Scanner(System.in);
        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        
        System.out.println(b);

        Book b2 = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        
        System.out.println("\n" + b2);

        Book g = new Book("The Hate U Give", "Angie Thomas", 2017, 444, false);
        System.out.println("\n" + g);

        System.out.println("number of pages in The Hate U Give: " + g.getNumPages());

        System.out.println("Is I am Malala harcover: " + b.getHardCover());

        System.out.println("\nEnter new number of pages for I am Malala: ");
        int np = scan.nextInt();
        b.setNumPages(np);
        System.out.println(b);
Scanner scan2 = new Scanner(System.in);
        System.out.println("\nEnter new author for The Hate U Give: ");
        String au = scan2.nextLine();
        g.setAuthor(au);
        System.out.println(g);


    
    System.out.println("are the books equal? " + b.equals(b));
        System.out.println("are the books equal? " + b.equals(g));
        System.out.println("are the books equal? " + b.equals(b2));
    }
}
