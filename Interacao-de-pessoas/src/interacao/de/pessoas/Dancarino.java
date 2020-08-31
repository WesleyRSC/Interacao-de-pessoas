/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao.de.pessoas;

/**
 *
 * @author fh139
 */
public class Dancarino extends Pessoa {
    private String profissao;
    
    public Dancarino(String nome, char sexo,String profissao) {
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
    
}
