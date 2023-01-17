package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        if(filepath == null || filepath.trim().equals("")){
            throw new  IllegalArgumentException("Filepath cannot be null or empty");
        }

        this.filepath = filepath;
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
                System.out.println("File not found\n");
                e.printStackTrace();
            }
        }

        return result;
    }
}
