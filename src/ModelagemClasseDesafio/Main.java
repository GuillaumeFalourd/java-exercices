package ModelagemClasseDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais>continente = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        Pais pais1 = new Pais("Holanda", 234356, 20000);
        Pais pais2 = new Pais("França", 3455778,1200000);
        Pais pais3 = new Pais("Inglaterra", 23888899,4500000);
        Pais pais4 = new Pais("Brasil", 998877665,220000000);

        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        boolean operarMenu = true;
        int escolhaUsuario = 0;

        while(operarMenu){
            System.out.println("Para listar os países, digite: 1");
            System.out.println("Para sair do menu, digite: 2");
            escolhaUsuario = input.nextInt();
    }
}
