import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

    
        class Practice {
        
            public static void main(String[] args) {
            
        } 
    {
        Practicei jan = new Practicei();
        jan.area();
        Practicei jan1 = new Practicei(120,2);
        jan1.area();
    }

}
public class Practicei
{
    int height, width;
    Practicei()
    {
        int height =10;
        int width = 15;

    }
    Practicei(int x ,int y)
    {
        int height = x;
        int width = y;

    }
    void area(int x, int y){
        int areaa = width * height;
        System.out.println(" The Area is "+areaa);
        }
    }
