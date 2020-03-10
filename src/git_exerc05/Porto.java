/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_exerc05;


import java.util.ArrayList;

/**
 *
 * @author catar
 */
public class Porto {
    int cpPorto;
    int ctNavios;
    ArrayList <Navio> navios;
    
    public Porto(int capPorto){
        this.cpPorto=capPorto;
        navios = new ArrayList<Navio>();
    }
public void novoNavio(Navio n){
    if(ctNavios == cpPorto){
        System.out.println("Limite atingido!");
        return;
    }
    boolean enc =false;
    for(int i=0; i<ctNavios; i++){
        if(n.getMatricula().equals(navios.get(i).getMatricula())){
            enc= true;
            System.out.println("Matrícula existente!");
        }
        if(!enc){
            navios.add(n);
            ctNavios++;
        }
    }
}
}
