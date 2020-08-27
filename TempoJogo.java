import java.io.IOException;
import java.util.*;

public class TempoJogo{

    public static int aux(Integer a, Integer b){
        int tempoTotal;

            if((a>23) || (b>23)){
                System.out.print("Valor inválido.");
                return 0;
            }else if(b<a){
                tempoTotal = (24 - a) + b; 
            }else if(a==b){
                tempoTotal=24;
            }else{
                tempoTotal = b - a;
            }
            System.out.print(tempoTotal);
            return tempoTotal;
    }


    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o tempo de início e o tempo de término da atividade separados por espaço: ");
        String in = s.nextLine();
        String[] inputs = in.split(" ");

        
        s.close();
        aux(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));



    }
}