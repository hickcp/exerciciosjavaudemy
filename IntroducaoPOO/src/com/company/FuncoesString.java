package com.company;

import java.util.Locale;

//Aqui apenas uma classe para relembrar o formatar, recortar, substituir e buscar uma String
public class FuncoesString {

    public static void main(String[] args) {
        String original = "abcde FGHIJ KLM nop QRS   ab  ";
        System.out.println(original.toLowerCase()); //deixa toda a string minúscula
        System.out.println(original.toUpperCase());// tudo maiúsculo
        System.out.println(original.trim()); //elimina os espaços no canto da string
        System.out.println(original.substring(2));//pega a string da posição 3 em diante, eliminando as duas primeiras
        System.out.println(original.substring(2,4)); // pega a string da posiçaõ 3 até a 5, imprimendo a terceira e quarta letra.
        System.out.println(original.replace('a', 'x')); // troca toda a string/char/ de a por x
        System.out.println(original.replace("abc", "xy")); // troca toda a string/char/ de abc por xy
        System.out.println(original.indexOf("ab"));//mostra o primeiro index em que aparece a letra ab;
        System.out.println(original.lastIndexOf("ab"));//mostra o ultimo index em que aparece a letra ab
    }



}
