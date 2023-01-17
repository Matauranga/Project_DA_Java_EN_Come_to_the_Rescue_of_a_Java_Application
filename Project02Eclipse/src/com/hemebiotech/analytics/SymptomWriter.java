package com.hemebiotech.analytics;

import java.util.Map;

public interface SymptomWriter {
    void writeSymptoms(Map<String, Integer> symptomAndItsOccurrence);
}
