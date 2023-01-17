package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write the results to an external file
 */

public interface SymptomWriter {

    /**
     * @param symptomAndItsOccurrence Map containing each disease and its occurrence
     */
    void writeSymptoms(Map<String, Integer> symptomAndItsOccurrence);
}
