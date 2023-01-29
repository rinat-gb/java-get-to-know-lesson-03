package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    private String description;
    private Scanner scanner;

    public Exercise(String description, Scanner scanner) {
        this.description = description;
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void run() {
        System.out.println(description);
        System.out.println("===============");
    }

    @Override
    public String toString() {
        return description;
    }
}
