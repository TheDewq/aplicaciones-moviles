import javax.swing.*;

public class sumas_eternas extends Thread{

    private int resultado = 0;

    
    protected int sumar(int x, int y){
        return x + y;
    }

    public int getResultado(){
        return this.resultado;
    }

    public void setResultado(int r){
        this.resultado = r;
    
    }
    

    @Override
    public void run(){
        for(int i = 0; i<1; i--){
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "la cantidad actual es "+this.getResultado()));
            this.setResultado(this.sumar(this.getResultado(), valor));
            JOptionPane.showMessageDialog(null,"vamos en "+this.getResultado(),"segundo pop-up", 1);
        }
    }
}
