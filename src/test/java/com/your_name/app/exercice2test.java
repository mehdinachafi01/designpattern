package com.your_name.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exercice2test {

    @Test
    public void testValidation() {
        Validation validation = new Validation();
        assertEquals("valider", validation.resultatexam(),
                "La méthode resultatexam de Validation devrait retourner 'valider'");
    }

    @Test
    public void testNonValidation() {
        Nonvalider nonValidation = new Nonvalider();
        assertEquals("non valider", nonValidation.resultatexam(),
                "La méthode resultatexam de Non_valider devrait retourner 'non valider'");
    }
}