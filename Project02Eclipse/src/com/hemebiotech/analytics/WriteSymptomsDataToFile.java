package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomsDataToFile implements SymptomWriter {

    private final String filePath;

    /**
     * @param resultFilePath Map containing each disease and its occurrence
     */
    public WriteSymptomsDataToFile(String resultFilePath) {
        if (resultFilePath == null || resultFilePath.trim().equals("")) {
            throw new IllegalArgumentException("Filepath cannot be null or empty");
        }
        this.filePath = resultFilePath;
    }

    /**
     * function that writes to an external file the count results of the different symptoms
     *
     * @param symptomMap Map containing each disease and its occurrence
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptomMap) {
        try {
            FileWriter writer = new FileWriter(this.filePath);
            for (Map.Entry<String, Integer> m : symptomMap.entrySet()) {
                writer.write(m.getKey() + " : " + m.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

