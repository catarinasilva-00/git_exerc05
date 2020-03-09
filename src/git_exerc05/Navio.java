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
public class Navio {
    String matricula, nome;
    float comp;
    
    public Navio(String matricula){
        this.matricula=matricula;
    }
    
    public String getMatricula()
    {
        return matricula;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public float getComp(){
        return comp;
    }
    
    public void setComp(float comp){
        this.comp=comp;
    }
}
