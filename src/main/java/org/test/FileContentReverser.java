package org.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileContentReverser {

    public String readFile(String inputPath) {

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                if (reader.ready()) { // Add a newline only if there's another line
                    content.append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }

    public void writeFile(String outputPath, String content) {
        try {
            Files.writeString(Path.of(outputPath), content);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public String reverseContent(String content) {
        return new StringBuilder(content).reverse().toString();
    }

    public void processFile(String inputPath, String outputPath) {
        String content = readFile(inputPath);
        String reversedContent = reverseContent(content);
        writeFile(outputPath, reversedContent);
    }
}

