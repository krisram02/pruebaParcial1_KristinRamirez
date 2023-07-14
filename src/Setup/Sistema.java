/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setup;




import javax.swing.JOptionPane;

/**
 *
 * @author krrmi
 */
public class Sistema {
    
    public static double saldoActual;
    
    public Sistema(){
        saldoActual = 0;
        
        
    }
    public void depositar(double deposito){
        saldoActual += deposito;
        
    }
    public void retirar(double retiro){
        if(saldoActual >= retiro){
            saldoActual -= retiro;
        }
        else{
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
        }
    }
    public double obtenerSaldo(){
        return saldoActual;
    }
    
    
}
