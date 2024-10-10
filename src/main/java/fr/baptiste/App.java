package fr.baptiste;
import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        
        Scanner clavier = new Scanner(System.in);
        Random randomNumbers = new Random();
        int chiffreAleatoire = randomNumbers.nextInt(100);

        System.out.println("Entrez un nombre entre 0 et 100 : ");
        int chiffreDonne = 0;
        int nbTentatives = 0;

        while (chiffreDonne != chiffreAleatoire) {

            chiffreDonne = clavier.nextInt();
            nbTentatives = nbTentatives + 1;

        if (chiffreDonne > chiffreAleatoire) {  
            System.out.println("Trop grand");
        } else if (chiffreDonne < chiffreAleatoire) {
            System.out.println("Trop petit");
        } else {
            System.out.println("Gagné");
        }
        
    }  
        System.out.println("Vous avez fais " + nbTentatives + " tentatives !");
    }
}
