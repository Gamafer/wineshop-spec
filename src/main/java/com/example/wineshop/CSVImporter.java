package com.example.wineshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//@Configuration
public class CSVImporter {
    private static final Logger log = LoggerFactory.getLogger(CSVImporter.class);

    @Bean
    CommandLineRunner initDatabase(
            RegionRepository regionRepository,
            TypeRepository typeRepository,
            WineRepository wineRepository,
            WineryRepository wineryRepository
    ) {
        return args -> getInList();
    }

    private void getInList() {
        String fileName = "wines_SPA.csv";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(log::info);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
