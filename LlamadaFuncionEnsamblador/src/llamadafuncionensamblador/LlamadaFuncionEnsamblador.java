package llamadafuncionensamblador;

import javax.swing.JOptionPane;

public class LlamadaFuncionEnsamblador {

    static {
        System.loadLibrary("funcion");
}
    
    public static native int mi_funcion();
    
    public static void main(String[] args) {
        
        int resultado = 0;
        
        try {
            resultado = mi_funcion();            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la función de Assembler.");
        }
        
        System.out.println("El resultado es: "+resultado);
        
    }
    
}
