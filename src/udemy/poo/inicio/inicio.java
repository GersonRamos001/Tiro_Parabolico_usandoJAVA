
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.Componentes;
import udemy.poo.codigo.TiroParabolico;


public class inicio {
    public static void main(String[] args) {
        String datoUno = JOptionPane.showInputDialog(null,"Dame la velocidad inicial");
        float numUno = Float.parseFloat(datoUno);
        
         String datoDos = JOptionPane.showInputDialog(null,"Dame el grado");
         int numDos = Integer.parseInt(datoDos);
         
         TiroParabolico objetoUno = new TiroParabolico(numUno, numDos);
         
         JOptionPane.showMessageDialog(null, "LA altura maxima es: " + objetoUno.alturaMaxima() + "\n" + "El alcance es: " + objetoUno.alcance(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
         
         //calculo de componentes 
         String datoTres = JOptionPane.showInputDialog(null,"Dame el tiempo");
         int numTres = Integer.parseInt(datoTres);
         String y = null;
         
        Componentes [] datos = objetoUno.calculoComponentes(numTres);
        
        //for each
        for (Componentes objeto : datos) {
            y += objeto.getTiempo() + " ; "+ objeto.getX() +" + " + objeto.getY()+"\n";
            
        }
        JOptionPane.showMessageDialog(null, y, "Componentes", JOptionPane.INFORMATION_MESSAGE);
        
    }

    
 
}
