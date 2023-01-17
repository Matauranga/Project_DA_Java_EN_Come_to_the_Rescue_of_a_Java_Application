package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceEachSymptomsImpl implements CountOccurrenceEachSymptoms {
    private final List<String> symptomList;

    /**
     * @param symptomList - ArrayList which contains all the symptoms from a data source
     */

    public CountOccurrenceEachSymptomsImpl(List<String> symptomList) {
        this.symptomList = symptomList;
    }

    /**
     * Function that lists each disease and counts their occurrence
     *
     * @return Map containing each disease and its occurrence
     */

    @Override
    public Map<String, Integer> getDiseasesCountFile() {

        Map<String, Integer> diseasesCountFile = new TreeMap<>();

        for (String s : symptomList) {
            diseasesCountFile.putIfAbsent(s, 0); //Added symptom and init to 0 if not present in count file
            int occurrence = diseasesCountFile.get(s); //Retrieval of the number of occurrence of the symptom
            occurrence++;
            diseasesCountFile.put(s, occurrence); //Update of the number of occurrences in the counting file
        }

        return diseasesCountFile;
    }
}
