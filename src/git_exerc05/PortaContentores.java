/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_exerc05;

/**
 *
 * @author catar
 */
public class PortaContentores extends Navio{
    
    int numMax;
    
    public PortaContentores(String matricula){
        super(matricula);
    }
    
    public void setNumMax(int numMax){
        this.numMax=numMax;
    }
    
    public int getNumMax(){
    return numMax;
    }
   
    
}
