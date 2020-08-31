/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao.de.pessoas;

import java.util.ArrayList;

/**
 *
 * @author fh139
 */
public class Programador extends Pessoa{
    public String profissao;
    
    public Programador(String nome, char sexo, String profissao) {
        super(nome, sexo,profissao);
    }
    
    @Override
    public void responderTrabalho(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Eu trabalho desenvolvendo softwares. Nunca achei que fosse conseguir, mas estou me desenvolvendo bem, e você faz o que? \n");
        resposta.add(1,"\n"+ this.getNome() + ": Troquei de profissão, estou me aprimorando cada vez mais na área da programação. Parece que nasci para ser Full Stack . E tu?\n");
        resposta.add(2,"\n"+ this.getNome() + ": Decidi mudar de área vim para programação e e estou começando a me arrepender, é tudo muito difícil! E você?\n");
        resposta.add(3,"\n"+ this.getNome() + ": Mesmo trabalhando na minha área de programação, não consigo um emprego que pague bem, estou financeiramente falido! E vc?\n"); 
        
        nrRespostaTrabalho=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalho);
    }
    
    @Override
    public void responderTrabalhoFinal(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Eu trabalho desenvolvendo softwares. Nunca achei que fosse conseguir, mas estou me desenvolvendo bem.\n");
        resposta.add(1,"\n"+ this.getNome() + ": Troquei de profissão, estou me aprimorando cada vez mais na área da programação. Parece que nasci para ser Full Stack.\n");
        resposta.add(2,"\n"+ this.getNome() + ": Decidi mudar de área vim para programação e e estou começando a me arrepender, é tudo muito difícil!?\n");
        resposta.add(3,"\n"+ this.getNome() + ": Mesmo trabalhando na minha área de programação, não consigo um emprego que pague bem, estou financeiramente falido!\n"); 
        
        nrRespostaTrabalhoFinal=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalhoFinal);
    }
}
