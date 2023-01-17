package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * A function that analyzes symptom data, sorts it,
 * counts its occurrences, and writes the results to an external file.
 */

public class SymptomsAnalytics {

    public static String symptomFilePath = "./Project02Eclipse/symptoms.txt";
    public static String resultFilePath = "./Project02Eclipse/result.out";


    public static void analytics() throws Exception {

        SymptomReader readData = new ReadSymptomDataFromFile(symptomFilePath);
        List<String> symptomList = readData.getSymptoms();

        CountOccurrenceEachSymptoms countOccurrence = new CountOccurrenceEachSymptomsImpl(symptomList);
        Map<String, Integer> symptomMap = countOccurrence.getDiseasesCountFile();

        SymptomWriter writer = new WriteSymptomsDataToFile(resultFilePath);
        writer.writeSymptoms(symptomMap);

    }

}