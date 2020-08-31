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
public class Desempregado extends Pessoa{
    public String profissao;
    
    public Desempregado(String nome, char sexo, String profissao) {
        super(nome, sexo,profissao);
    }
    
    @Override
    public void responderTrabalho(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Não estou com nenhum trabalho, to vivendo como sempre quis sustentado pelos meus pais e você o que faz?\n");
        resposta.add(1,"\n"+ this.getNome() + ": Acabei largando o emprego e agora estou curtindo desempregado! Vou utilizar o tempo livre para me dedicar em alguns cursos e melhorar meu currículo. E tu?\n");
        resposta.add(2,"\n"+ this.getNome() + ": Estou desempregado! Sinto que deveria ter me atualizado enquanto havia tempo. E você?\n");
        resposta.add(3,"\n"+ this.getNome() + ": Fui demitido e estou quase precisando vender a casa. E vc?\n"); 
        
        nrRespostaTrabalho=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalho);
    }
    
    @Override
    public void responderTrabalhoFinal(){
        ArrayList<String> resposta = new ArrayList();
        resposta.add(0,"\n"+ this.getNome() + ": Não estou com nenhum trabalho, to vivendo como sempre quis sustentado pelos meus pais\n");
        resposta.add(1,"\n"+ this.getNome() + ": Acabei largando o emprego e agora estou curtindo desempregado! Vou utilizar o tempo livre para me dedicar em alguns cursos e melhorar meu currículo.\n");
        resposta.add(2,"\n"+ this.getNome() + ": Estou desempregado! Sinto que deveria ter me atualizado enquanto havia tempo.\n");
        resposta.add(3,"\n"+ this.getNome() + ": Fui demitido e estou quase precisando vender a casa.\n"); 
        
        nrRespostaTrabalhoFinal=rnd.nextInt(resposta.size());
        escrever(resposta,nrRespostaTrabalhoFinal);
    }
}
