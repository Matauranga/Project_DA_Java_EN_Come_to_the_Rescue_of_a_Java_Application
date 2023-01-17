package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
    //Déclaration et initialisation des différents variables compteurs de maladies.

    private static int headacheCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;

    public static void main(String[] args) throws Exception {
        //Lecture et ecriture dans la console du fichier des symptômes.
        BufferedReader reader = new BufferedReader(new FileReader(".\\Project02Eclipse\\symptoms.txt"));
        String line = reader.readLine();
        while (line != null) {
            //System.out.println("symptom from file: " + line);//Supprimmable mais utile pour eventuelle debug
            if (line.equals("headache")) {  //Comptage du nombre d'occurrences de headache
                headacheCount++;
            } else if (line.equals("rash")) {  //Comptage du nombre d'occurrences de rash
                rashCount++;
            } else if (line.contains("pupils")) { //Comptage du nombre d'occurrences de pupils
                pupilCount++;
            }
            line = reader.readLine();  // Lire ligne suivante du fichier de données.
        }
        reader.close();//fermeture du fichier de données

        //Ecriture dans un fichier externe des résultat de comptage des différents symptomes.
        FileWriter writer = new FileWriter("result.out");//création du ficher de résultat
        writer.write("headache: " + headacheCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dialated pupils: " + pupilCount + "\n");
        writer.close();//Fermeture du fichier de résultat


    }
}
