package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

public class cronometro1 {
    private final Timer t;
    private int h, m, s, cs;
    JLabel label;
    
   public cronometro1(){
       t = new Timer(10, acciones);
   }
   
   public void setLabel( JLabel label){
       this.label = label;
   }
   
   public Timer getTimer(){
       return t;
   }
   
   public int getCs(){
       return cs;
   }
   
   public int getSeg(){
       return s;
   }
   
   public int getMin(){
       return m;
   }
   
   public int getHrs(){
       return h;
   }
    
    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs; 
            if(cs==100){
                cs = 0;
                ++s;
            }
            if(s==60) 
            {
                s = 0;
                ++m;
            }
            if(m==60)
            {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
        
    };
    private void actualizarLabel() {
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        label.setText(tiempo);
    }

}
