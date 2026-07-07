import java.util.Scanner;

public class IPL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= IPL Teams =========");
        System.out.println("1. Chennai Super Kings");
        System.out.println("2. Mumbai Indians");
        System.out.println("3. Royal Challengers Bengaluru");
        System.out.println("4. Sunrisers Hyderabad");
        System.out.println("5. Kolkata Knight Riders");
        System.out.println("6. Rajasthan Royals");
        System.out.println("7. Delhi Capitals");
        System.out.println("8. Gujarat Titans");
        System.out.println("9. Lucknow Super Giants");
        System.out.println("10. Punjab Kings");

        System.out.print("\nEnter Team Number: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("\nTeam : Chennai Super Kings");
                System.out.println("Captain : MS Dhoni");
                System.out.println("Home Ground : M. A. Chidambaram Stadium");
                System.out.println("Titles : 5");
                break;

            case 2:
                System.out.println("\nTeam : Mumbai Indians");
                System.out.println("Captain : Hardik Pandya");
                System.out.println("Home Ground : Wankhede Stadium");
                System.out.println("Titles : 5");
                break;

            case 3:
                System.out.println("\nTeam : Royal Challengers Bengaluru");
                System.out.println("Captain : Rajat Patidar");
                System.out.println("Home Ground : M. Chinnaswamy Stadium");
                System.out.println("Titles : 1");
                break;

            case 4:
                System.out.println("\nTeam : Sunrisers Hyderabad");
                System.out.println("Captain : Pat Cummins");
                System.out.println("Home Ground : Rajiv Gandhi International Stadium");
                System.out.println("Titles : 1");
                break;

            case 5:
                System.out.println("\nTeam : Kolkata Knight Riders");
                System.out.println("Captain : Ajinkya Rahane");
                System.out.println("Home Ground : Eden Gardens");
                System.out.println("Titles : 3");
                break;

            case 6:
                System.out.println("\nTeam : Rajasthan Royals");
                System.out.println("Captain : Sanju Samson");
                System.out.println("Home Ground : Sawai Mansingh Stadium");
                System.out.println("Titles : 1");
                break;

            case 7:
                System.out.println("\nTeam : Delhi Capitals");
                System.out.println("Captain : Axar Patel");
                System.out.println("Home Ground : Arun Jaitley Stadium");
                System.out.println("Titles : 0");
                break;

            case 8:
                System.out.println("\nTeam : Gujarat Titans");
                System.out.println("Captain : Shubman Gill");
                System.out.println("Home Ground : Narendra Modi Stadium");
                System.out.println("Titles : 1");
                break;

            case 9:
                System.out.println("\nTeam : Lucknow Super Giants");
                System.out.println("Captain : Rishabh Pant");
                System.out.println("Home Ground : Ekana Cricket Stadium");
                System.out.println("Titles : 0");
                break;

            case 10:
                System.out.println("\nTeam : Punjab Kings");
                System.out.println("Captain : Shreyas Iyer");
                System.out.println("Home Ground : PCA Stadium");
                System.out.println("Titles : 0");
                break;

            default:
                System.out.println("Invalid Team Number!");
        }

        sc.close();
    }
}
