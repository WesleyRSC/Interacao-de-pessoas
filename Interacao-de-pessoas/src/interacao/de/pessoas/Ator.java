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
public class Ator extends Pessoa{
    
    public Ator(String nome, char sexo, String profissao) {
        super(nome, sexo,profissao);
    }
    
    @Override
    public void responderTrabalho(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Eu trabalho atuando né, é sempre aquela correria gostosa e você faz o que?\n");
        resposta.add(1,"\n"+ this.getNome() + ": Troquei de profissão, agora eu atuo em peças de teatro e as vezes em algum comercial, to seguindo minha paixão. E tu?\n");
        resposta.add(2,"\n"+ this.getNome() + ": No meu trabalho as coisas não vão muito bem, nessa época de pandemia não tem muito job pra atores. E você?\n");
        resposta.add(3,"\n"+ this.getNome() + ": Vai ruim, em um país como o nosso a arte não é valorizada, Brasil é foda ;-;. E vc?\n"); 
        
        nrRespostaTrabalho=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalho);
    }
    
    @Override
    public void responderTrabalhoFinal(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Eu trabalho atuando né, é sempre aquela correria gostosa.\n");
        resposta.add(1,"\n"+ this.getNome() + ": Troquei de profissão, agora eu atuo em peças de teatro e as vezes em algum comercial, to seguindo minha paixão.\n");
        resposta.add(2,"\n"+ this.getNome() + ": No meu trabalho as coisas não vão muito bem, nessa época de pandemia não tem muito job pra atores.\n");
        resposta.add(3,"\n"+ this.getNome() + ": Vai ruim, em um país como o nosso a arte não é valorizada, Brasil é foda ;-;\n"); 
        
        nrRespostaTrabalhoFinal=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalhoFinal);
    }
    

}
