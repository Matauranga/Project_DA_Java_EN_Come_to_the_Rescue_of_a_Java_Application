package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements SymptomReader {

    private final String filepath;

    /**
     * @param symptomFilePath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String symptomFilePath) {
        if (symptomFilePath == null || symptomFilePath.trim().equals("")) {
            throw new IllegalArgumentException("Filepath cannot be null or empty");
        }

        this.filepath = symptomFilePath;
    }

    /**
     * @return ArrayList of all Symptoms obtained from a data source
     */
    @Override
    public List<String> getSymptoms() {
        List<String> result = new ArrayList<>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                String line = reader.readLine();

                while (line != null) {
                    result.add(line.trim());
                    line = reader.readLine();

                }
                reader.close();
            } catch (IOException e) {
                System.err.println("File not found\n");
            }
        }

        return result;
    }
}
