/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventuregame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class TextAdventureGame {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String [] enemies = new String[] {"ragnar " , " batman " , "spiderman " , " superman " , "hulk " , "thor " };
        int maxeniemesHealth = 75 ;
        int EnemyMaxAttackDamage=50 ;
        int health = 100 ;
        int attackDamage = 50;
        int numberHealthPortions = 3 ;
        int healthPortionAmount = 30 ;
        int healthPortionChance = 50 ;
        
        boolean running = true ;
        System.out.println("-----------------------------");

        System.out.println("wlecome to textAdventureGame ");
        
        Game:
        while (running ){
            String enemy = enemies[rand.nextInt(enemies.length)];
            int enemyAttack = rand.nextInt(EnemyMaxAttackDamage);
            int enemyHealth = rand.nextInt(maxeniemesHealth);
            System.out.println("\n\n" + enemy  + " appeard  ");
                    
            while(enemyHealth > 0 ){
                System.out.println("\n what would you like to do");
             System.out.println(
            "\n 1)attack"
            +"\n 2)drink portion health"
            +"\n 3)run");
             String choice = input.nextLine();
             if (choice.equals("1")){
                 int damageDealt = rand.nextInt(attackDamage);
                 int damageTaken = rand.nextInt(EnemyMaxAttackDamage);
                 health -= damageTaken;
                 enemyHealth -= damageDealt; 
                 if (damageDealt>enemyHealth)
                 enemyHealth = 0;
                 
                 System.out.println("damage Dealt is " + damageDealt + "   enemy health now is " + enemyHealth );
                 System.out.println("damage recieved is " +damageTaken + "   your health is: "+health );
                 
                 
             }
             else if (choice.equals("2")){
                 if (numberHealthPortions > 0){
                     health +=  healthPortionAmount ; 
                     numberHealthPortions -= 1;
                     System.out.println("you have taken a portion , your health now is  " + health + " ,you have  "+numberHealthPortions + "remaning");
                 }
                 else
                     System.out.println("you have no partions remaning");
             }
             else if (choice.equals("3"))
                 break Game ;
                
            
            else 
            System.out.println("invalid input try again !");
             break ;
            }
             if (health <0){
                 System.out.println("you died !!");
                 break Game ;
                 
             }
             
             System.out.println("you killed "+ enemy );
             if (healthPortionChance > rand.nextInt(100)){
                 
             }
            numberHealthPortions += 1 ;
            }
        }
        
        
        
    }
    

