/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author preet
 */
public class Create1_1 {
    public static void main (String[] args){
        create1 cr=new create1();
        cr.setVisible(true);
        create3 ct = new create3();
        try {
        for(int i=0;i<=100;i++){
            Thread.sleep(50);
            cr.jLabel2.setText(Integer.toString(i)+"%");
            cr.jProgressBar1.setValue(i);
        if(i==100){
            cr.setVisible(false);
            ct.setVisible(true);
        }    
            
        }    
        } catch (Exception e) {
        }
    }
    
}
