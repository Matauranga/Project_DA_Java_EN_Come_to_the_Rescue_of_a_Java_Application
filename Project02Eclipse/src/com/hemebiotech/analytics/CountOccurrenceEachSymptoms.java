package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will count the occurrence of each symptom from a listing
 * <p>
 * The implementation sort the list alphabetically
 */

public interface CountOccurrenceEachSymptoms {

    /**
     * Function that lists each disease, counts their occurrence and sort them alphabetically
     *
     * @return Map containing each disease and its occurrence in alphabetical order
     */

    Map<String, Integer> getDiseasesCountFile();
}
