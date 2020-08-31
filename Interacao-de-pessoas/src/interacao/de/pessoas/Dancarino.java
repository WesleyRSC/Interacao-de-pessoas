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
public class Dancarino extends Pessoa {
    public String profissao;
    
    public Dancarino(String nome, char sexo, String profissao) {
        super(nome, sexo,profissao);
    }

    
    @Override
    public void responderTrabalho(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Eu trabalho com dança né, é sempre aquela correria gostosa entre apresentações e ensaios e você faz o que?\n");
        resposta.add(1,"\n"+ this.getNome() + ": Troquei de área, agora sigo minha paixão e consigo me expressar pela dança, vivo disso. E tu?\n");
        resposta.add(2,"\n"+ this.getNome() + ": Trabalhar com dança é dificil, mesmo amando o que eu faço não consigo um trabalho que seja bem remunerado. E você?\n");
        resposta.add(3,"\n"+ this.getNome() + ": Ta tudo Péssimo, resolvi seguir meu sonho como dançarino e acabei descobrindo que era mais feliz dançando por hobbie mesmo. E vc?\n"); 
        
        nrRespostaTrabalho=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalho);
    }
    
    @Override
    public void responderTrabalhoFinal(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Eu trabalho com dança né, é sempre aquela correria gostosa entre apresentações e ensaios.\n");
        resposta.add(1,"\n"+ this.getNome() + ": Troquei de área, agora sigo minha paixão e consigo me expressar pela dança, vivo disso.\n");
        resposta.add(2,"\n"+ this.getNome() + ": Trabalhar com dança é dificil, mesmo amando o que eu faço não consigo um trabalho que seja bem remunerado.\n");
        resposta.add(3,"\n"+ this.getNome() + ": Ta tudo Péssimo, resolvi seguir meu sonho como dançarino e acabei descobrindo que era mais feliz dançando por hobbie mesmo.\n"); 
        
        nrRespostaTrabalhoFinal=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalhoFinal);
    }
}
