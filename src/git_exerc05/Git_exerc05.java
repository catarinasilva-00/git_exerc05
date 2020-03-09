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
public class Git_exerc05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Porto p = new Porto(3);
        Petroleiro pe= new Petroleiro("MA");
        PortaContentores pc = new PortaContentores("MB");
        
        pe.setNome("Catarina");
    }
    
}
