/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra09curp;

/**
 *
 * @author HP
 */
public class Progra09Curp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DATOS DATOS = new DATOS();
        DATOS curp1 = new DATOS ("Jonathan", "Salgado", "Sotero", "Hombre", "2002", "11", "30", "Mexico");
        
        curp1.getResultado();
        System.out.println(curp1.getResultado());
        
    }
    
}

    

