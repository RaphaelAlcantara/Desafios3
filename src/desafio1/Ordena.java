package desafio1;

import java.util.*;

public class Ordena {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos números vai inserir: ");
        int count = sc.nextInt();
        while(count > 0 ){
            int num = sc.nextInt();
            if(num % 2 == 0){
                pares.add(num);
            }else{
                impares.add(num);
            }
            count--;
        }
        Collections.sort(pares);
        impares.sort(Collections.reverseOrder());

        for (int np: pares) {
            System.out.println(np);
        }
        for (int ni: impares) {
            System.out.println(ni);

        }

    }
}
