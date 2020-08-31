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
    public int nrSaudacao,nrRespostaPerguntarTrabalho,nrRespostaTrabalho=0,nrRespostaTrabalhoFinal=0,nrDespedida,nrDespedidaFinal;
    private String nome;
    private char sexo;
    public boolean feliz;
    private String profissao;
    
    
    public Pessoa (String nome, char sexo , String profissao){
        this.nome = nome;
        this.sexo=sexo;
        this.profissao=profissao;
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
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
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
    
    public void responderTrabalhoFinal(){}
    public void despedida(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Bom já vou indo nessa, até outro dia\n");
        resposta.add(1,"\n"+ this.getNome() + ": Vou precisar ir agora, até depois\n");
        resposta.add(2,"\n"+ this.getNome() + ": De qualquer forma foi bom falar com você, tenho que ir, até breve.\n");
        
        nrDespedida=rnd.nextInt(resposta.size());
        escrever(resposta,nrDespedida);
    }
    
    public void responderDespedida(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Tchau Tchau :D\n");
        resposta.add(1,"\n"+ this.getNome() + ": Até logo, tenha uma ótima semana\n");
        resposta.add(2,"\n"+ this.getNome() + ": Até mais, depois conversamos de novo.\n");
        nrDespedidaFinal=rnd.nextInt(resposta.size());
        escrever(resposta,nrDespedidaFinal);
    }
    
    public boolean verFelicidade(Pessoa pessoa){
        pessoa.feliz=(pessoa.nrRespostaTrabalho<=1 || pessoa.nrRespostaTrabalhoFinal<=1); 
        return pessoa.feliz;
    }


}


