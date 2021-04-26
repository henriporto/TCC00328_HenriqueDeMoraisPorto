package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio16;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        //teste:
        int teste[][] = {{10, 8, 3, -4, 12}, {19, 8, 13, 10, 19}, {10, 8, 3, -5, 11}, {19, 8, 6, 13, 25}, {19, 8, 6, 13, 23}};
        System.out.println(lider(5, teste));
    }

    public static int[][] trocalinhaprox(int a, int[][] tabela) {
        int temp = tabela[a + 1][0];
        tabela[a + 1][0] = tabela[a][0];
        tabela[a][0] = temp;

        temp = tabela[a + 1][1];
        tabela[a + 1][1] = tabela[a][1];
        tabela[a][1] = temp;

        temp = tabela[a + 1][2];
        tabela[a + 1][2] = tabela[a][2];
        tabela[a][2] = temp;

        temp = tabela[a + 1][3];
        tabela[a + 1][3] = tabela[a][3];
        tabela[a][3] = temp;

        temp = tabela[a + 1][4];
        tabela[a + 1][4] = tabela[a][4];
        tabela[a][4] = temp;
        return tabela;
    }

    public static int lider(int times, int[][] tabela) {
        // marco os times nas linhas da tabela:
        for (int a = 0; a < times; a++)
            tabela[a][1] = a;
        // troca linha ordenando:
        for (int a = 0; a < (times - 1); a++)
            if (tabela[a][0] > tabela[a + 1][0])
                tabela = trocalinhaprox(a, tabela);
            else if (tabela[a][0] == tabela[a + 1][0])
                if (tabela[a][2] > tabela[a + 1][2])
                    tabela = trocalinhaprox(a, tabela);
                else if (tabela[a][2] == tabela[a + 1][2])
                    if (tabela[a][3] > tabela[a + 1][3])
                        tabela = trocalinhaprox(a, tabela);
                    else if (tabela[a][3] == tabela[a + 1][3])
                        if (tabela[a][4] > tabela[a + 1][4])
                            tabela = trocalinhaprox(a, tabela);
        return tabela[times - 1][1];
    }

}
