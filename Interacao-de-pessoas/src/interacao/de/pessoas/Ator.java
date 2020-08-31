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
    private String profissao;
    
    public Ator(String nome, char sexo, String profissao) {
        super(nome, sexo);
        this.profissao=profissao;
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
    
    @Override
    public void responderTrabalho(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\nEu trabalho atuando né, é sempre aquela correria gostosa e você faz o que?\n");
        resposta.add(1,"\nTroquei de profissão, agora eu atuo em peças de teatro e as vezes em algum comercial, to seguindo minha paixão. E você?\n");
        resposta.add(2,"\n\n");
        resposta.add(3,"\n\n"); 
        
        nrRespostaTrabalho=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalho);
  
    }
}
