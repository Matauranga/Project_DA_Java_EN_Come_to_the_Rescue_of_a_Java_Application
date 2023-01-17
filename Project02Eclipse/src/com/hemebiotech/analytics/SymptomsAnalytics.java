package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/* 1 Lire le fichier FAIT
   2 Mettre en forme le fichier ordre alphabétique FAIT
*  3 Compter le nb d'occurrence et le ranger dans un "LinkedHashMap"    FAIT
*  4 Écrire fonction pour écrire les résultats dans le fichier "result.out" plutôt que dans le main FAIT
* */


/**
 * Descriptif de la class
 */
public class SymptomsAnalytics {

    //chemin vers le fichier
    public static String symptomFilePath = "./Project02Eclipse/symptoms.txt";
    public static String resultFilePath = "./Project02Eclipse/result.out";


    /**
     * @throws Exception
     */
    public static void analytics() throws Exception {

        SymptomReader readData = new ReadSymptomDataFromFile(symptomFilePath);
        List<String> symptomList = readData.getSymptoms();

        CountOccurrenceEachSymptoms countOccurrence = new CountOccurrenceEachSymptomsImpl(symptomList);
        Map<String, Integer> symptomMap = countOccurrence.getDiseasesCountFile();


        SymptomWriter writer = new WriteSymptomsDataToFile(resultFilePath);
        writer.writeSymptoms(symptomMap);

    }

}
