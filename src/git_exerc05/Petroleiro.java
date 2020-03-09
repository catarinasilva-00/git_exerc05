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
public class Petroleiro extends Navio{
    float cap;
    
    public Petroleiro(String matricula){
        super(matricula);
    }
    
     public void setCap(float cap){
        this.cap=cap;
    }
    
    public float getCap(){
    return cap;
    } 
    
}
