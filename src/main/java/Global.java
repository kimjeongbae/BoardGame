package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
public class Global {
    private static Scanner scanner;

    public static Scanner getScanner() {
        return scanner;
    }


}