package metodosnumericos.interfaces;

import javax.swing.JOptionPane;
import jme.Expresion;
import jme.excepciones.ExpresionException;



/**
 *
 * @author Adrian
 */
public class Funcion implements Ifuntion{
    
    private String definicion = "";
    Expresion expresion;

    public Funcion(String definicion) {
        this.definicion = definicion;        
    }                        
    
    public boolean contieneX(String cad) {
        for (int i = 0; i < cad.length(); i++) {
            if (cad.substring(i, i + 1).equals("x")) 
                return true;                
        }
        return false;
    }
    
    
    @Override
    public double eval(double x) {
        try {
            expresion = new Expresion(this.definicion);            
            expresion.setVariable("x", x);
            return Double.parseDouble(String.valueOf(expresion.evaluar()));
        } catch (ExpresionException ex) {
            JOptionPane.showMessageDialog(null, "Error en la función.", "Error", JOptionPane.ERROR_MESSAGE);
            return Double.NaN; 
        }
    }    
//
//    @Override
//    public double evalNewton(double ini, double iter) {       
//        try {
//            expresion = new Expresion("newton("+this.definicion+",x,"+ini+","+iter+")");
//            
//            System.out.println(expresion);
//            return Double.parseDouble(String.valueOf(expresion.evaluar()));
//        } catch (ExpresionException ex) {
//            JOptionPane.showMessageDialog(null, "No se puede continuar.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.out.println(ex.getMessage());
//            return Double.NaN; 
//        }
//    }
//
//    @Override
//    public double evalNewton2(String derivada, double ini, double iter) {
//        try {
//            expresion = new Expresion("sol_newton("+this.definicion+","+derivada+",x,"+ini+","+iter+")");
//            
//            System.out.println(expresion);
//            return Double.parseDouble(String.valueOf(expresion.evaluar()));
//        } catch (ExpresionException ex) {
//            JOptionPane.showMessageDialog(null, "No se puede continuar.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.out.println(ex.getMessage());
//            return Double.NaN; 
//        }
//    }
    
    //    public void newtonRaphson(String fff, double ini, double iter) {
//        double aini = ini;
//        String derivadaF = Derivar(fff);
//        //double evaluar = f.evalNewton(ini, iter);
//        double evaluar = f.evalNewton2(derivadaF, ini, iter);
//        System.out.println("EVALUAR: " + evaluar);
//        if (!Double.isNaN(evaluar)) {
//            lblF_xNewton.setText("f(x) = " + pantalla.getText());
//            lblIterNew.setText("Con un máximo de: " + iter + " iteraciones.");
//            lblIninewt.setText("Tomando una estimación inicial de: " + ini);
//            lblResultadoNewton.setText("Raiz = " + evaluar);
//            lbl_derivada.setText("Derivada: "+derivadaF);
//            GrupoPn.setSelectedIndex(1);
//            //graficar(fff, aini, iter, f, 1);
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Verifiqué la función o que el punto inicial sea correcto.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
    
}
