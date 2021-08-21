package utp.misiontic2022.c2.p53.reto4.vista;

import javax.swing.JFrame;

public class GUI extends JFrame{
    

    public GUI(int width,int height,String title){
        

        this.setTitle(title); //Seleccionando el titulo del frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        
    }

    

    public GUI(int width, int height){
        this(width,height,"Reto 5");
    }

    public GUI(int size, String title){
        this(size,size,title);
    }

    public GUI(int size){
        this(size,"Reto 5");
    }

    public void startVisibility(){
        this.setVisible(true);
    }
    public void endVisibility(){
        this.setVisible(false);
    }

    public void requerimiento1(){
        
    }
}
