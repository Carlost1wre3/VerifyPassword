package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Sejá bem vindo ao VerifyPassword =====");

        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        Verifier verifier = new Verifier();
        verifier.tamanho(senha);
    }
}