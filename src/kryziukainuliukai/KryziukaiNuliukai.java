package kryziukainuliukai;

import java.util.Scanner;

public class KryziukaiNuliukai {

    public static int arYraLaimetojas(String[][] lenta, int pergale) {
        pergale = 0;
        for (int i = 0; i < lenta.length; i++) {
            for (int j = 0; j < lenta.length - 2; j++) {
                if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                        && (lenta[i][j + 1] == "X|" || lenta[i][j + 1] == "X")
                        && (lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")) {
                    System.out.println("Laimėjo žaidėjas!!!");
                    pergale++;
                }
                if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                        && (lenta[i][j + 1] == "O|" || lenta[i][j + 1] == "O")
                        && (lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")) {
                    System.out.println("Laimėjo kompiuteris!!!");
                    pergale++;
                }

            }
        }
        pergale = 0;
        for (int i = 0; i < lenta.length - 2; i++) {
            for (int j = 0; j < lenta.length; j++) {
                if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                        && (lenta[i + 1][j] == "X|" || lenta[i + 1][j] == "X")
                        && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                    System.out.println("Laimėjo žaidėjas!!!");
                    pergale++;
                }
                if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                        && (lenta[i + 1][j] == "O|" || lenta[i + 1][j] == "O")
                        && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                    System.out.println("Laimėjo kompiuteris!!!");
                    pergale++;
                }

            }
        }
        pergale = 0;
        for (int i = 0; i < lenta.length - 2; i++) {
            for (int j = 0; j < lenta.length - 2; j++) {
                if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                        && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                        && (lenta[i + 2][j + 2] == "X|" || lenta[i + 2][j + 2] == "X")) {
                    System.out.println("Laimėjo žaidėjas!!!");
                    pergale++;
                }
                if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                        && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                        && (lenta[i + 2][j + 2] == "O|" || lenta[i + 2][j + 2] == "O")) {
                    System.out.println("Laimėjo kompiuteris!!!");
                    pergale++;
                }
            }
        }
        pergale = 0;
        for (int i = 0; i < lenta.length - 2; i++) {
            for (int j = 0; j < lenta.length - 2; j++) {
                if ((lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")
                        && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                        && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                    System.out.println("Laimėjo žaidėjas!!!");
                    pergale++;
                }
                if ((lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")
                        && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                        && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                    System.out.println("Laimėjo kompiuteris!!!");
                    pergale++;
                }

            }
        }
        System.out.println("Suskaiciavau pergales: " + pergale);
        return pergale;
    }

    public static void main(String[] args) {

        int pergale = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasirinkite lentos dydį. Įveskite skaičių nuo 3 iki 9:");
        // Pasirenkam lentos dydį
        int dydis = sc.nextInt();
        // Apsauga nuo per didelės lentos
        while (dydis < 3 | dydis > 9) {
            System.out.println("Neteisingai įvesta reikšmė. Prašau įveskite skaičių nuo 3 iki 9:");
            dydis = sc.nextInt();
        }
        // Suformuoja lentą
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
        // išpiešia lentą
        for (int i = 0; i < lenta.length; i++) {
            for (int j = 0; j < lenta.length; j++) {
                System.out.print(lenta[i][j]);
            }
            System.out.println(" ");
        }
        // Prasideda žaidimas
        boolean run = true;
        while (run) {
            System.out.println("Žaidėjo ėjimas. Pasirinkite eilutę: ");
            System.out.println("-------------1--------------");
            int eilute = sc.nextInt();
            while (eilute > dydis || eilute < 1) {
                System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte eilutę, įveskite skaičių nuo " + "1 iki " + dydis);
                eilute = sc.nextInt();
            }
            System.out.println("Pasirinkite vietą eilutėje: ");
            int stulpelis = sc.nextInt();
            while (stulpelis > dydis || stulpelis < 1) {
                System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte vietą eilutėje, įveskite skaičių nuo " + "1 iki " + dydis);
                stulpelis = sc.nextInt();
            }
            // Tikrinam ar laukelis neužimtas
            while (lenta[eilute - 1][stulpelis - 1] == "X|" || lenta[eilute - 1][stulpelis - 1] == "X"
                    || lenta[eilute - 1][stulpelis - 1] == "O|" || lenta[eilute - 1][stulpelis - 1] == "O") {
                System.out.println("Šis laukelis jau užimtas, bandykite įvesti kitą skaičių. Pasirinkite eilutę: ");
                eilute = sc.nextInt();
                while (eilute > dydis || eilute < 1) {
                    System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte eilutę, įveskite skaičių nuo " + "1 iki " + dydis);
                    eilute = sc.nextInt();
                }
                System.out.println("Pasirinkite vietą eilutėje: ");
                stulpelis = sc.nextInt();
                while (stulpelis > dydis || stulpelis < 1) {
                    System.out.println("Neteisingai įvesta reikšmė. Tam, kad pasirinktumėte vietą eilutėje, įveskite skaičių nuo " + "1 iki " + dydis);
                    stulpelis = sc.nextInt();
                }
            }
            // Įrašom "X" į žaidėjo pasirinktą vietą
            if (stulpelis == dydis) {
                lenta[eilute - 1][stulpelis - 1] = "X";
            } else {
                lenta[eilute - 1][stulpelis - 1] = "X|";
            }
            // Perpiešiam lentą su žaidėjo pasirinkimu
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    System.out.print(lenta[i][j]);
                }
                System.out.println(" ");
            }
            // Patikrinam ar yra laimėtojas                       

            pergale = 0;
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i][j + 1] == "X|" || lenta[i][j + 1] == "X")
                            && (lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i][j + 1] == "O|" || lenta[i][j + 1] == "O")
                            && (lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }

                }
            }

            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j] == "X|" || lenta[i + 1][j] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j] == "O|" || lenta[i + 1][j] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }

                }
            }

            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j + 2] == "X|" || lenta[i + 2][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j + 2] == "O|" || lenta[i + 2][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }
                }
            }

            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }

                }
            }
            System.out.println("Suskaiciavau pergales: " + pergale);
            if (pergale > 0) {
                break;
            }
            System.out.println("---------2---------");
            // Patikrinam ar lygiosios
            int laisvosVietos = 0;
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "_|") || (lenta[i][j] == "_") || (lenta[i][j] == " |") || (lenta[i][j] == " ")) {
                        laisvosVietos++;
                    }

                }
            }
            System.out.println("Liko laisvų langelių: " + laisvosVietos);
            if (laisvosVietos == 0) {
                System.out.println("Lygiosios!!!");
                break;
            }
            // Kompiuterio ėjimas
            System.out.println("Kompiuterio ėjimas: ");
            eilute = (int) (Math.random() * dydis) + 1;
            stulpelis = (int) (Math.random() * dydis) + 1;
            // Tikrinam ar laukelis neužimtas
            while (lenta[eilute - 1][stulpelis - 1] == "X|" || lenta[eilute - 1][stulpelis - 1] == "X"
                    || lenta[eilute - 1][stulpelis - 1] == "O|" || lenta[eilute - 1][stulpelis - 1] == "O") {
                eilute = (int) (Math.random() * dydis) + 1;
                stulpelis = (int) (Math.random() * dydis) + 1;
            }
            // Įrašom "O" į kompo pasirinktą vietą
            if (stulpelis == dydis) {
                lenta[eilute - 1][stulpelis - 1] = "O";
            } else {
                lenta[eilute - 1][stulpelis - 1] = "O|";
            }
            // Perpiešiam lentą su kompo pasirinkimu
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    System.out.print(lenta[i][j]);
                }
                System.out.println(" ");
            }
            // Patikrinam ar yra laimėtojas          


            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i][j + 1] == "X|" || lenta[i][j + 1] == "X")
                            && (lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i][j + 1] == "O|" || lenta[i][j + 1] == "O")
                            && (lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }

                }
            }

            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j] == "X|" || lenta[i + 1][j] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j] == "O|" || lenta[i + 1][j] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }

                }
            }

            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j] == "X|" || lenta[i][j] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j + 2] == "X|" || lenta[i + 2][j + 2] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j] == "O|" || lenta[i][j] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j + 2] == "O|" || lenta[i + 2][j + 2] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }
                }
            }

            for (int i = 0; i < lenta.length - 2; i++) {
                for (int j = 0; j < lenta.length - 2; j++) {
                    if ((lenta[i][j + 2] == "X|" || lenta[i][j + 2] == "X")
                            && (lenta[i + 1][j + 1] == "X|" || lenta[i + 1][j + 1] == "X")
                            && (lenta[i + 2][j] == "X|" || lenta[i + 2][j] == "X")) {
                        System.out.println("Laimėjo žaidėjas!!!");
                        pergale++;
                    }
                    if ((lenta[i][j + 2] == "O|" || lenta[i][j + 2] == "O")
                            && (lenta[i + 1][j + 1] == "O|" || lenta[i + 1][j + 1] == "O")
                            && (lenta[i + 2][j] == "O|" || lenta[i + 2][j] == "O")) {
                        System.out.println("Laimėjo kompiuteris!!!");
                        pergale++;
                    }

                }
            }
            System.out.println("Suskaiciavau pergales: " + pergale);
            if (pergale > 0) {
                break;
            }
            // Patikrinam ar lygiosios
            laisvosVietos = 0;
            for (int i = 0; i < lenta.length; i++) {
                for (int j = 0; j < lenta.length; j++) {
                    if ((lenta[i][j] == "_|") || (lenta[i][j] == "_") || (lenta[i][j] == " |") || (lenta[i][j] == " ")) {
                        laisvosVietos++;
                    }

                }
            }
            System.out.println("Liko laisvų langelių: " + laisvosVietos);
            if (laisvosVietos == 0) {
                System.out.println("Lygiosios!!!");
                break;
            }
        }

    }

}
