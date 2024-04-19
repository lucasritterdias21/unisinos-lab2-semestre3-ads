package etapa2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PrincipalCandidatos {
    public static void main(String[] args) {

        //gerar candidatos de forma randomica de 1 a 100
        //fazer com um ArrayList de Candidato
    ArrayList<Candidato> candidatosArray = new ArrayList<>();

    try(BufferedReader br = new BufferedReader (new FileReader("dados.json"))){
        String linha;
        while ((linha = br.readLine()) != null){
            String[] dados = linha.split(",");
            String nome;
            String partido;
            int intencoesVotos;

            Candidato candidato = new Candidato(nome, partido, intencoesVotos);
            candidatosArray.add(candidato);
        } catch (IOException e ) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    for (Candidato candidato : candidatosArray){
        System.out.println(candidato.getNome() + candidato.getPartido() + candidato.getIntencoesVotos());
    }


        

    //ordenaCandidatosPorNome
       



    //ordenaCandidatosPorNome





    //ordenaCandidatosPorNome





    //pesquisaBinariaCandidato


    }
}
