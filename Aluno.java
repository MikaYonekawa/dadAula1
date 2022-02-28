/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1mikagrazi;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String nome;
    private int ra;
    private int sala;
    private boolean reprova;
    
    void passar()
    {
        if(reprova)
            System.out.println("Não passou de ano");
        else
            System.out.println("Passou");
            
    }
}
