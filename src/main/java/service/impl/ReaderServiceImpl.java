package service.impl;

import service.ReaderService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    @Override
    public List<String> readFromFile(String filePath) {
        File file = new File(filePath);
        List<String> fileStrings;
        try {
            fileStrings = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException("Can`t read from file " + filePath, e);
        }
        return fileStrings;
    }
}