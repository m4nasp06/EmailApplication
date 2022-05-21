//


import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);


        boolean run = true;
        while(run)
        {
            intro();
            String firstName = firstName();
            String lastName = lastName();
            String domain = domain();
            String extension = extension();

            Email newEmail = new Email(firstName, lastName, domain, extension);

            System.out.println(newEmail.generateEmail());

            System.out.println("Would you like to generate another email? (y/n)");
            char response = console.next().charAt(0);

            if(response == 'n')
            {
                run = false;
            }
        }

        System.out.println("Goodbye!");

    }

    public static void intro()
    {
        System.out.println("Welcome to the Application");
        System.out.println("Here you can make your own custom email!");
    }

    public static String firstName()
    {
        Scanner console = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = console.next();
        console.nextLine();

        return firstName;
    }

    public static String lastName()
    {
        Scanner console = new Scanner(System.in);

        System.out.println("What is your last name?");
        String lastName = console.next();
        console.nextLine();

        return lastName;
    }

    public static String domain()
    {
        Scanner console = new Scanner(System.in);

        System.out.println("What is your domain?");
        String domain = console.next();
        console.nextLine();

        return domain;
    }

    public static String extension()
    {
        Scanner console = new Scanner(System.in);

        System.out.println("What is your extension?");
        String extension = console.next();
        console.nextLine();

        return extension;
    }


}