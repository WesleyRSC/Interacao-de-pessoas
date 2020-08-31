/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao.de.pessoas;

import java.util.*;

/**
 *
 * @author fh139
 */
public class Pessoa {
    
    public Random rnd= new Random();
    public int nrSaudacao,nrRespostaPerguntarTrabalho,nrRespostaTrabalho;
    private String nome;
    private char sexo;
    private boolean feliz;
    
    
    public Pessoa (String nome, char sexo){
        this.nome = nome;
        this.sexo=sexo;
    }
    
     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the feliz
     */
    public boolean isFeliz() {
        return feliz;
    }
    /**
     * @param feliz the feliz to set
     */
    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }
  
    
    
    public void saudar(Pessoa outraPessoa){
        saudar(this, outraPessoa);
    }
    
    public void responderSaudacao(Pessoa outraPessoa){
        responderPerguntarTrabalho(this, outraPessoa);
    }  
    
    
    public void escrever(ArrayList<String> array, int sorteado){
        System.out.println(array.get(sorteado));
    }
    
    
    public int sortearEntre(int min, int max){
        return rnd.nextInt(max-min)+min;
    }
    
    public void saudar(Pessoa p1, Pessoa p2){
        ArrayList<String> saudacao = new ArrayList();
        saudacao.add(0,"\n"+ p1.getNome() + ": Olá, " + p2.getNome() + "!\n");
        saudacao.add(1,"\n"+ p1.getNome() + ": Eae, " + p2.getNome() + "!\n");
        saudacao.add(2,"\n"+ p1.getNome() + ": Opa, " + p2.getNome() + "!\n");
        saudacao.add(3,"\n"+ p1.getNome() + ": Fala ai, " + p2.getNome() + "!\n");
        saudacao.add(4,"\n"+ p1.getNome() + ": Ei, " + p2.getNome() + "!\n");
        saudacao.add(5,"\n"+ p1.getNome() + ": Oi, " + p2.getNome() + "!\n");
        saudacao.add(6,"\n"+ p1.getNome() + ": Eai Mano!\n");   
        
        nrSaudacao=rnd.nextInt(saudacao.size());
        escrever(saudacao,nrSaudacao);
    }
    
    public void responderPerguntarTrabalho(Pessoa p1, Pessoa p2){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ p1.getNome() + ": Olá, " + p2.getNome() + " em qual area voce está atuando?\n");
        resposta.add(1,"\n"+ p1.getNome() + ": Oi, " + p2.getNome() + " voce ta trabalhando com o que atualmente?\n");
        resposta.add(2,"\n"+ p1.getNome() + ": Opa, " + p2.getNome() + " como ta o trampo?\n");
        resposta.add(3,"\n"+ p1.getNome() + ": Fala ai, " + p2.getNome() + " como tá no trabalho?\n");
        resposta.add(4,"\n"+ p1.getNome() + ": Ei, " + p2.getNome() + " continua trabalhando no mesmo lugar?\n");
        resposta.add(5,"\n"+ p1.getNome() + ": Eae, " + p2.getNome() + " ta suave lá no serviço?\n");
        resposta.add(6,"\n"+ p1.getNome() + ": Eai meu consagrado, como tá os corre?\n");    
        
        nrRespostaPerguntarTrabalho=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaPerguntarTrabalho);
    }
    
    public void responderTrabalho(){
  
    }
}


