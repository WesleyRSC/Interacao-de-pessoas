/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interacao.de.pessoas;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fh139
 */
public class InteracaoDePessoas {

    public static Scanner input = new Scanner(System.in);
    public static Pessoa p1,p2;
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(
                "Bem vindo ao nosso simulador de conversa \n" +
                "\nAqui vamos simular a interação de duas pessoas e ao final traçaremos o perfil de cada uma delas\n"
        );
        coletarDados();
        interagir(p1,p2);
    }
    
    public static void interagir(Pessoa p1,Pessoa p2){
        p1.saudar(p2);
        p2.responderSaudacao(p1);
    }
    
    public static void coletarDados(){
        String nomeP1,nomeP2;
        char sexoP1,sexoP2;
        
        
        System.out.println(
            "Dê um nome para a primeira Cobaia:"
        );
        nomeP1 = input.next();
        System.out.println(
            "Escolha o sexo da primeira pessoa (M/F):"
        );
        sexoP1 = receberSexo(input.next());
        sortearProfissão(nomeP1,sexoP1,1);

        System.out.println(
                "\nPerfeito " + nomeP1 +
                ", agora qual o nome da segunda pessoa com quem deseja simular uma conversa?"
            );
        nomeP2 = input.next();
        System.out.println(
            "Escolha o sexo da segunda pessoa (M/F):"
        );
        sexoP2 = receberSexo(input.next());
        sortearProfissão(nomeP2,sexoP2,2);

        System.out.print("\n\n");
        

    }
    
    public static char receberSexo(String resposta){
        do{
            char sexo = resposta.trim().toUpperCase().toCharArray()[0];
            if(sexo=='M'||sexo=='F'){
                return sexo;
            }
            else{
                System.out.println("Digite um valor válido M->Masculino ou F->Feminino");
                resposta = input.next();
            }
        }while(true);
    }
    
    public static void sortearProfissão(String nome, char sexo, int pessoa){
        Random r = new Random();
        int opcao = r.nextInt(4);
        switch(opcao){
            case 0:
                if(pessoa==1){
                    p1 = new Ator(nome,sexo, "Ator");
                }
                else{
                    p2 = new Ator(nome,sexo, "Ator");
                }
                break;
            case 1:
                if(pessoa==1){
                    p1 = new Dancarino(nome,sexo, "Dancarino");
                }
                else{
                    p2 = new Dancarino(nome,sexo, "Dancarino");
                }
                break;
            case 2:
                if(pessoa==1){
                    p1 = new Programador(nome,sexo, "Programador");
                }
                else{
                    p2 = new Programador(nome,sexo, "AProgramadortor");
                }
                break;
            case 3:
                if(pessoa==1){
                    p1 = new Desempregado(nome,sexo, "Desempregado");
                }
                else{
                    p2 = new Desempregado(nome,sexo, "Desempregado");
                }
                break;     
        }
                
    }
  
}
   

