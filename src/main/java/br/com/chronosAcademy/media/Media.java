package br.com.chronosAcademy.media;

public class Media {
    public String calculaMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media < 5.0 ? "Reprovado" : "Aprovado";
    }
}