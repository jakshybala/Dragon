import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UniversalImp {
    static Hero hero = new Hero(1000, 100, 120, 250, 150);
    static Dragon dragon = new Dragon(2000, 120, 150, 0);
    public static void menu() {

        int roundCounter = 1;
        Random random = new Random();
        Scanner enterData = new Scanner(System.in);
        System.out.println("\tWelocme to Game!!");
        while (true) {
            gameStatus();
            if (hero.getHealthy() > 0 ) {
            System.out.printf("\n<-------Round - %s-------->\nEnter command: " +
                "\n1 - Attack " +
                "\n2 - Deffend " +
                "\n3 - Do nothing" +
                "\n4 - Exit" +
                "\n<------------------------>\n", roundCounter++);
            int command = Integer.parseInt(enterData.nextLine());
                switch (command) {
                    case 1:
                        attackProcent();
                        break;
                    case 2:
                        sheildMethod();
                        break;
                    case 3:
                        System.out.println("Do nothing! lose step");

                    case 4:
                        System.exit(0);

                }
            }
            else {
                System.out.println("\nGame Over -> Dragon Win");
                break;
            }
            int d = random.nextInt(0,2);
            if (dragon.getHealthy() > 0) {
                switch (d) {
                    case 0:
                        hero.setHealthy((hero.getHealthy() + hero.getDeffend()) - (dragon.power + dragon.getPower()));
                        System.out.print("Dragon: atacking -> Hero helathy: " + hero.getHealthy());
                        break;

                    case 1:
                        System.out.print("Dragon: sleeping -> Hero helathy: " + hero.getHealthy());
                        break;
                }
            }
            else {
                System.out.println("Game Over -> Hero Win");
                break;
            }

        }

    }
    public static void attackProcent() {
        Random random = new Random();
        int num = random.nextInt(100);
            if (num <= 75) {
                dragon.setHealthy(dragon.getHealthy() - (hero.getPower() + hero.getWeapon())) ;
                System.out.println("Hero: atacking -> Dragon Healthy: " + dragon.healthy);
            }else{
                System.out.println("Hero: lose -> Dragon Healthy: " + dragon.healthy);
            }
    }
     public static void sheildMethod() {
         if (hero.getDeffend() != hero.getDeffend()) {
            hero.setDeffend(hero.getSheild() + hero.getDeffend()) ;
            System.out.println("Hero: Shield -> Hero helathy: " + hero.getHealthy());
         }
         else {
             hero.setDeffend(hero.getDeffend()) ;
             System.out.println("Hero: Shield -> Hero helathy: " + hero.getHealthy());

         }

     }
     public static void gameStatus() {
         System.out.println();
         System.out.println("\n************************************");
         System.out.printf("Hero Information: Healthy: %d, Defend: %d, Power: %d, Weapon: %d, Sheild: %d",
                 hero.getHealthy(), hero.getDeffend(), hero.getPower(), hero.getWeapon(), hero.getSheild());
         System.out.println();
         System.out.println("-------------VS--------------");
         System.out.printf("Dragon Information: Healthy: %d, Defend: %d, Power: %d, Weapon: %d",
                 dragon.getHealthy(), dragon.getDefend(), dragon.getPower(), dragon.getWeapon());
         System.out.println("\n************************************");
     }


}
