import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String[] args) {
        Random a = new Random();
        Scanner b = new Scanner(System.in);
        int a_int = a.nextInt(100);
        //int b_int;
        do{
            int b_int = b.nextInt();
            if(b_int > 100 || b_int < 0){
                System.out.println("������1��100����");
                continue;
            }
            if(b_int > a_int){
                System.out.println("�´���");
            }
            else if(b_int < a_int){
                System.out.println("��С��");
            }
            else{
                System.out.println("����������");

                break;
            }
        }while(b_int != a_int);
    }
}
