package laboratorio;

import java.util.Scanner;

public class Laboratorio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int k = 1, i = 0, opc, opc2, opc1, tipo, j = 1, cod, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, l, n7 = 0, n8 = 0, n9 = 0, n10 = 0, r, c = 0, q = 0;
        String L[][] = new String[100][100], a1, a2, a3, N[][] = new String[100][100];

        while (j != 0) {
            System.out.println("menu:1.compra,2.donaciones,3.canje,4.prestamo,5.reportes y estadisticas");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("existe en la biblioteca 1.si;0.no");
                    opc1 = leer.nextInt();
                    switch (opc1) {
                        case 1:
                            i = i + 1;
                            q = q + 1;
                            System.out.println("tipo: 0.libro;1.revista,2.monografia");
                            tipo = leer.nextInt();
                            L[i][1] = Integer.toString(tipo);
                            while (tipo < 0 || tipo > 2) {
                                System.out.println("tipo: 0.libro;1.revista,2.monografia");
                                tipo = leer.nextInt();
                                L[i][1] = Integer.toString(tipo);
                            }
                            System.out.println("codigo editor 5 digitos");
                            cod = leer.nextInt();
                            c = c + 1;

                            while (cod < 0 || cod > 99999) {
                                System.out.println("codigo editor 5 digitos");
                                cod = leer.nextInt();
                            }

                            double m = (Math.random() * 10);
                            a1 = Integer.toString((int) m);
                            m = (Math.random() * 10);
                            a2 = Integer.toString((int) m);
                            m = (Math.random() * 10);
                            a3 = Integer.toString((int) m);
                            n2 = (cod / 10000) % 10;
                            n3 = (cod / 1000) % 10;
                            n4 = (cod / 100) % 10;
                            n5 = (cod / 10) % 10;
                            n6 = (cod % 10);
                            n7 = Integer.parseInt(a1);
                            n8 = Integer.parseInt(a2);
                            n9 = Integer.parseInt(a3);
                            r = (tipo * 10) + (n2 * 9) + (n3 * 8) + (n4 * 7) + (n5 * 6) + (n6 * 5) + (n7 * 4) + (n8 * 3) + (n9 * 2);
                            n10 = Math.abs(r % 11 - 11);
                            System.out.println("" + r);

                            if (n10 != 10) {
                                L[i][2] = Integer.toString(tipo) + Integer.toString(n2) + Integer.toString(n3)
                                        + Integer.toString(n4) + Integer.toString(n5) + Integer.toString(n6)
                                        + Integer.toString(n7) + Integer.toString(n8) + Integer.toString(n9) + Integer.toString(n10);
                                System.out.println("operacion exitosa el codigo asignado es:" + L[i][2]);
                                N[k][2] = L[i][2];
                            } else {
                                L[i][2] = Integer.toString(tipo) + Integer.toString(n2) + Integer.toString(n3) + Integer.toString(n4) + Integer.toString(n5) + Integer.toString(n6) + Integer.toString(n7) + Integer.toString(n8) + Integer.toString(n9) + "x";
                                System.out.println("operacion exitosa el codigo asignado es:" + L[i][2]);
                            }
                            L[i][3] = "bueno";
                            L[i][4] = "0";

                            System.out.println("digite cantidad a comprar");
                            int t = leer.nextInt();

                            N[k][2] = Integer.toString(Integer.parseInt(N[k][2] + t));

                            break;
                        case 0:
                            i = i + 1;
                            System.out.println("digite el codigo del libro");
                            String co = leer.nextLine();
                            k = 1;
                            while (co != L[k][2] & k <= i) {
                                k++;
                            }
                            if (k != i + 1) {
                                L[i][3] = "bueno";
                                L[i][4] = "0";
                                N[k][1] = co;
                                System.out.println("digite cantidad a comprar");
                                t = leer.nextInt();
                                String h=Integer.toString(t);
                                N[k][2] = Integer.toString(Integer.parseInt(N[k][2] + h));
                            } else {
                                System.out.println("codigo no encontrado");
                                i = i - 1;
                            }
                            break;

                    }
                    for (int m = 1; m <= i; m++) {
                        System.out.println("º"+L[m][1]+"º"+L[m][2]+"º"+L[m][3]+"º"+L[m][4]);
                    }
                    for (int m = 0; m < 10; m++) {
                        System.out.println(""+N[k][1]+"º"+N[k][2]);
                    }
                    break;
                case 2:
                    break;
            }
        }
    }

}
