package kryziukainuliukai;

import java.util.Scanner;

public class KryziukaiNuliukai {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite lentos dydį. Įveskite skaičių nuo 3 iki 9:");
        int dydis = sc.nextInt();

        while (dydis < 3 | dydis > 9) {
            System.out.println("Neteisingai įvesta reikšmė. Prašau įveskite skaičių nuo 3 iki 9:");
            dydis = sc.nextInt();
        }

        String[][] lenta = new String[dydis][dydis];

        for (int i = 0; i < lenta.length; i++) {
            for (int j = 0; j < lenta.length; j++) {
                if (j < lenta.length - 1 && i < lenta.length - 1) {
                    lenta[i][j] = "_|";
                } else {
                    lenta[i][j] = "_";
                }
                if (i == lenta.length - 1) {
                    lenta[i][j] = " |";
                }
                if (i == lenta.length - 1 && j == lenta.length - 1) {
                    lenta[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < lenta.length; i++) {
            for (int j = 0; j < lenta.length; j++) {
                System.out.print(lenta[i][j]);
            }
            System.out.println(" ");
        }
        boolean run = true;
        while (run) {
            System.out.println("Žaidėjo ėjimas. Pasirinkite eilutę: ");
            int eilute = sc.nextInt();
            if (eilute > dydis) {
                System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte eilutę, įveskite skaičių nuo " + "1 iki " + dydis);
                eilute = sc.nextInt();
            }
            System.out.println("Pasirinkite vietą eilutėje: ");
            int stulpelis = sc.nextInt();
            if (stulpelis > dydis) {
                System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte vietą eilutėje, įveskite skaičių nuo " + "1 iki " + dydis);
                stulpelis = sc.nextInt();
            }
            while (lenta[eilute - 1][stulpelis - 1] == "X|" || lenta[eilute - 1][stulpelis - 1] == "X"
                    || lenta[eilute - 1][stulpelis - 1] == "O|" || lenta[eilute - 1][stulpelis - 1] == "O") {
                System.out.println("Šis laukelis jau užimtas, bandykite įvesti kitą skaičių. Pasirinkite eilutę: ");
                eilute = sc.nextInt();
                if (eilute > dydis) {
                    System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte eilutę, įveskite skaičių nuo " + "1 iki " + dydis);
                    eilute = sc.nextInt();
                }
                System.out.println("Pasirinkite vietą eilutėje: ");
                stulpelis = sc.nextInt();
                if (stulpelis > dydis) {
                    System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte vietą eilutėje, įveskite skaičių nuo " + "1 iki " + dydis);
                    stulpelis = sc.nextInt();
                }
            }
            if (stulpelis == dydis) {
                lenta[eilute - 1][stulpelis - 1] = "X";
            } else {
                lenta[eilute - 1][stulpelis - 1] = "X|";
            }
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    System.out.print(lenta[i][j]);
                }
                System.out.println(" ");
            }

            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i][j + 1] == "X|" || lenta[i][j + 1] == "X")
                            && (lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i][j + 1] == "O|" || lenta[i][j + 1] == "O")
                            && (lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }

                }
            }
            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j] == "X|" || lenta[i + 1][j] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j] == "O|" || lenta[i + 1][j] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }

                }
            }
            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j + 2] == "X|" || lenta[i + 2][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j + 2] == "O|" || lenta[i + 2][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }
                }
            }
            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }

                }
            }
            if (!run) {
                break;
            }
            int laisvosVietos = 0;
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "_|") || (lenta[i][j] == "_") || (lenta[i][j] == " |") || (lenta[i][j] == " ")) {
                        laisvosVietos++;
                    }

                }
            }
            System.out.println(laisvosVietos);
            if (laisvosVietos == 0) {
                System.out.println("Lygiosios!!!");
                break;
            }

            System.out.println("Kompiuterio ėjimas: ");

            eilute = (int) (Math.random() * dydis) + 1;
            stulpelis = (int) (Math.random() * dydis) + 1;
            while (lenta[eilute - 1][stulpelis - 1] == "X|" || lenta[eilute - 1][stulpelis - 1] == "X"
                    || lenta[eilute - 1][stulpelis - 1] == "O|" || lenta[eilute - 1][stulpelis - 1] == "O") {
                eilute = (int) (Math.random() * dydis) + 1;
                stulpelis = (int) (Math.random() * dydis) + 1;
            }
            if (stulpelis == dydis) {
                lenta[eilute - 1][stulpelis - 1] = "O";
            } else {
                lenta[eilute - 1][stulpelis - 1] = "O|";
            }
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    System.out.print(lenta[i][j]);
                }
                System.out.println(" ");
            }

            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i][j + 1] == "X|" || lenta[i][j + 1] == "X")
                            && (lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i][j + 1] == "O|" || lenta[i][j + 1] == "O")
                            && (lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }

                }
            }
            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j] == "X|" || lenta[i + 1][j] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j] == "O|" || lenta[i + 1][j] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }

                }
            }
            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j + 2] == "X|" || lenta[i + 2][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j + 2] == "O|" || lenta[i + 2][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }
                }
            }
            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        run = false;
                    }
                    if ((lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        run = false;
                    }

                }
            }

        }

    }

}
