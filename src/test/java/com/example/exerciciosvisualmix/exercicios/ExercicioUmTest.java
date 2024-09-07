package com.example.exerciciosvisualmix.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// TODO: Executar testes e ver se todos passam.
class ExercicioUmTest {

    @Test
    void palindromoPalavra() {
        assertTrue(ExercicioUm.checkPalindromo("arara"));
    }

    @Test
    void palindromoPalavraComMaiscula() {
        assertTrue(ExercicioUm.checkPalindromo("Arara"));
    }

    @Test
    void palindromoPalavraComAcento() {
        assertTrue(ExercicioUm.checkPalindromo("anã"));
    }

    @Test
    void naoPalindromoPalavra() {
        assertFalse(ExercicioUm.checkPalindromo("cachorro"));
    }

    @Test
    void palindromoFrase() {
        assertTrue(ExercicioUm.checkPalindromo("anotaram a data da maratona"));
    }

    @Test
    void palindromoFraseComMaiscula() {
        assertTrue(ExercicioUm.checkPalindromo("Anotaram a data da maratona"));
    }

    @Test
    void palindromoFraseComAcento() {
        assertTrue(ExercicioUm.checkPalindromo("Aí, Lima falou: “Olá, família!"));
    }

    @Test
    void naoPalindromoFrase() {
        assertFalse(ExercicioUm.checkPalindromo("arara é um animal"));
    }
}