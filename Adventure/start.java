import java.util.*;
public class start{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        user mainCharacter = new user(characterCreation(), 20, 3, 0.5, 10);
        enemy ogre = new enemy();
        System.out.print(mainCharacter.getName()+" is going on a walk in the forest and finds a fork in the road, do you go left or right? ");
        while(true){
            try {
            String choice=input.nextLine();
            switch (choice) {
                case "left" -> {
                    System.out.print("Oh no!! A monster emerges from the trees and attacks you! What do you do?\n1. RUN\n2. Fight\n3. Reason with the monster\n");
                    while(true){
                            try {
                                int secondChoice=input.nextInt();
                                switch (secondChoice) {
                                    case 1:
                                        System.out.println("While running you trip and fall, letting the monsters attack you leading to your death.");
                                        return;
                                    case 2:
                                        int damageDelt = mainCharacter.punch();
                                        ogre.setHealth(ogre.getHealth()-damageDelt);
                                        int monsterHealth=ogre.getHealth();
                                        if(monsterHealth==0){
                                            System.out.println("You have killed the monster! You continue your walk in the forest unharmed and live happiler ever after.");
                                        }
                                        System.out.println("You punch the monster dealing "+damageDelt+" damage leaving the monster at "+monsterHealth);
                                        int damageRecieved = ogre.punch();
                                        mainCharacter.setHealth(mainCharacter.getHealth()-damageRecieved);
                                        int characterHealth=mainCharacter.getHealth();
                                        if(characterHealth==0){
                                            System.out.println("You have been killed by the monster, rest in peace.");
                                            return;
                                        }
                                        System.out.println("The monster punches you back dealing "+damageRecieved+" damage leaving you at "+characterHealth);
                                        break;
                                    case 3:
                                        System.out.println("After talking to the monster for a while you decide to move into a treehouse in the forest together living happily ever after.");
                                        return;
                                    default:
                                        System.out.println("Not an option! Try again");
                                        continue;
                                }
                            System.out.print("1. RUN\n2. Fight\n3. Reason with the monster\n");    
                            } 
                            catch (InputMismatchException e) {
                                System.out.println("Invalid input");
                            }
                            catch (NoSuchElementException e){
                                if(input.next().isEmpty()){
                                    break;
                                }
                            }
                    }
                }
                case "right" -> {
                    System.out.println("After taking the right turn you stumble uppon an shiny sword sitting in a bush and pick it up, soon after a monster attacks you. What do you do?\n1. RUN\n2. Fight\n3. Reason with the monster");
                    while(true){
                        sword ironSword=new sword(mainCharacter);
                        mainCharacter.setWeapon(ironSword);
                        try {
                            switch (input.nextInt()) {
                                case 1:
                                    System.out.println("While running you trip and fall, letting the monsters attack you leading to your death.");
                                    return;
                                case 2:
                                    int damageDelt = mainCharacter.getWeapon().stab(mainCharacter);
                                    ogre.setHealth(ogre.getHealth()-damageDelt);
                                    int monsterHealth=ogre.getHealth();
                                    if(monsterHealth==0){
                                        System.out.println("You have killed the monster! You continue your walk in the forest unharmed and live happiler ever after.");
                                    }
                                    System.out.println("You stab the monster dealing "+damageDelt+" damage leaving the monster at "+monsterHealth);
                                    int damageRecieved = ogre.punch();
                                    mainCharacter.setHealth(mainCharacter.getHealth()-damageRecieved);
                                    int characterHealth=mainCharacter.getHealth();
                                    if(characterHealth==0){
                                        System.out.println("You have been killed by the monster, rest in peace.");
                                        return;
                                    }
                                    System.out.println("The monster punches you back dealing "+damageRecieved+" damage leaving you at "+characterHealth);
                                    break;
                                case 3:
                                    System.out.println("After talking to the monster for a while you decide to move into a treehouse in the forest together living happily ever after.");
                                    return;
                                default:
                                    System.out.println("Not an option! Try again");
                            }
                        System.out.print("1. RUN\n2. Fight\n3. Reason with the monster\n");    
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input");
                        }
                    }
                }
                default -> {
                    System.out.println("Invalid option");
                    continue;
                }
            }
                break;
            }
            catch (NoSuchElementException e){
                break;
            }
        }
        input.close();
    }

    public static String characterCreation(){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to my adventure game!\nName your character: ");
        name = input.nextLine();
        System.out.print("Welcome "+name+" your adventure starts here.");
        return name;
    }

}
