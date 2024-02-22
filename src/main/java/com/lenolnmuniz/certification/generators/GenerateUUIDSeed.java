package com.lenolnmuniz.certification.generators;

import java.util.UUID;

public class GenerateUUIDSeed {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            UUID uuid = UUID.randomUUID();
        System.out.println("UUID "+ i +" gerado: " + uuid.toString());
        }

        System.out.println("-------------------------------------------------- ");
        for (int i = 1; i < 15; i++) {
            UUID uuid = UUID.randomUUID();
        System.out.println("UUID "+ i +" gerado: " + uuid.toString());
        }
    }
}