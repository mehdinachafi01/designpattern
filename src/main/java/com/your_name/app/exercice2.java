package com.your_name.app;

public interface exercice2 {
    String resultatexam();
}

class Validation implements exercice2 {
    @Override
    public String resultatexam() {
        // Logique spécifique à la stratégie A
        return "valider";
    }
}

class Nonvalider implements exercice2 {
    @Override
    public String resultatexam() {
        return "non valider";
    }
}