package Assement2;

import java.util.Scanner;

public class PassengerDetails {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("welcome to Railway Reservation:");
            System.out.print("Enter from:");
            String from = sc.nextLine();
            System.out.print("Enter to: ");
            String to = sc.nextLine();

            System.out.println("Enter passengers details: ");
            System.out.print("Enter passenger name: ");
            String name = sc.nextLine();
            System.out.print("Enter gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter mobile number: ");
            long mobilenumber = sc.nextLong();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter mailid: ");
            String mailid = sc.next();

            String location;
            System.out.print("enter location:");
            location = sc.next();
            switch(location){
                    case "warangal":
                            System.out.println("general :"+100);
                            System.out.println("sleeper:"+150);
                            System.out.println("ac:"+200);
                            break;
                    case "mumbai":
                            System.out.println("general:"+120);
                            System.out.println("sleeper:"+180);
                            System.out.println("ac:"+280);
                            break;
                    case "tirupati":
                            System.out.println("general:"+200);
                            System.out.println("sleeper:"+390);
                            System.out.println("ac:"+450);
                            break;
                    case "nizambad":
                            System.out.println("general:"+100);
                            System.out.println("sleeper:"+160);
                            System.out.println("ac:"+250);
                            break;
                    case "khammam":
                            System.out.println("general:"+120);
                            System.out.println("sleeper:"+250);
                            System.out.println("ac:"+390);
                            break;
            }
        System.out.print("enter amount:");
            int accountbalance = sc.nextInt();
            if (accountbalance >= 100) {
                System.out.println("ticket is conformed");
            }
            else{
                System.out.println("ticket is not conformed");

            }




        }
    }

