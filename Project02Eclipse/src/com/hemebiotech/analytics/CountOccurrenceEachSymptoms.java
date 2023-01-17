package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will count the occurrence of each symptom from a listing
 * <p>
 * The implementation sort the list alphabetically
 */

public interface CountOccurrenceEachSymptoms {

    /**
     * @return a map that list each disease and counts their occurrence
     */
    Map<String, Integer> getDiseasesCountFile();
}
