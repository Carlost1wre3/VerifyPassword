package org.example;

public class Verifier {
    int pontos = 0;

    public void tamanho(String senha){
        System.out.println("Tamanho da senha: " + senha.length());

        if (senha.length() <= 8){
            setPontos(getPontos() + -1);
        } else {
            setPontos(getPontos() + 1);
        }
        numero(senha);
    }

    public void numero(String senha){
        for(int i = 0; i < senha.length(); i++){
            if (Character.isDigit(senha.charAt(i))){
                System.out.println("Sua senha tem numero!");
                // Não colocar setPontos aqui pois se repete a cada numero da senha
            }
        }
        System.out.println("Sua senha não tem numero!");
    }

    // GETTERS
    public int getPontos() {
        return pontos;
    }

    //SETTERS
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
