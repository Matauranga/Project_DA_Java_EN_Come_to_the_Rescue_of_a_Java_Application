package com.hemebiotech.analytics;

import java.util.*;

public class CountOccurrenceEachSymptomsImpl implements CountOccurrenceEachSymptoms {
    private final List<String> fileContent;

    /**
     * @param fileContent - ArrayList which contains all the symptoms from a data source
     */

    public CountOccurrenceEachSymptomsImpl(List<String> fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * Function .....
     *
     * @return Map containing each disease and its occurrence from a data source
     */

    //Fonction qui liste chaque maladie et compte leur occurrence (ranger dans l'ordre donné)
    @Override
    public Map<String, Integer> getDiseasesCountFile() {

        Map<String, Integer> diseasesCountFile = new TreeMap<>();

        for (String s : fileContent) {
            diseasesCountFile.putIfAbsent(s, 0); //Ajout du symptôme et init à 0 si non présent dans le fichier de comptage
            int occurrence = diseasesCountFile.get(s); //Récupération du nb d'occurrence du symptôme
            occurrence++;
            diseasesCountFile.put(s, occurrence); //MAJ du nb d'occurrence dans le fichier de comptage
        }

        return diseasesCountFile;
    }
}
