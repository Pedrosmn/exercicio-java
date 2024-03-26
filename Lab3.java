import java.util.*;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;

public class Lab3 {
    public static ArrayList<String> cores = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
    public static void createArray(String[] primeirasCores) {

        for (String i : primeirasCores) {
            cores.add(i);
        }
    }
    public static void printArray() {
        System.out.println("CORES NA LISTA:");
        for (String i : cores) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void addToArray() {
        System.out.print("DIGITE A COR QUE DESEJA ADICIONAR: ");
        cores.add(scan.nextLine());
        System.out.println("Cor adicionada!");
    }

    public static void removeFromArray() {
        System.out.print("DIGITE A COR QUE DESEJA REMOVER: ");
        String cor = scan.nextLine();

        if (cores.contains(cor)) {
            cores.remove(cor);
            System.out.println("Cor removida!");
        } else {
            System.out.println(cor + " Não está presente na lista.");
        }
    }

    public static void hasString() {
        System.out.print("DIGITE A COR QUE DESEJA VERIFICAR: ");
        String cor = scan.nextLine();

        if (cores.contains(cor)) {
            System.out.println("A cor " + cor + " está na lista!");
        } else {
            System.out.println("A cor " + cor + " NÃO está na lista!");
        }
    }

    public static void stringInPos() {
        System.out.print("DIGITE A POSIÇÃO NA LISTA QUE DESEJA VERIFICAR: ");
        int pos = scan.nextInt();

        while (true) {
            if ((pos <= cores.size()) && (pos >= 0)) {
                System.out.println("A cor contida na posição " + pos + " é " + cores.get(pos));
                break;
            } else {
                System.out.print("DIGITE UMA POSIÇÃO VÁLIDA (0-" + (cores.size() - 1) + ") ");
                pos = scan.nextInt();
            }

        }
    }

    public static void sortArray() {
        sort(cores);
        System.out.println("Lista ordenada!");
        printArray();
    }

    public static void shuffleArray() {
        shuffle(cores);
        System.out.println("Lista embaralhada!");
        printArray();
    }

    public static void main(String[] args) {

        String primeirasCores[] = new String[3];
        for (int i = 1; i < 4; i++) {
            System.out.print("DIGITE A " + i + "ª COR: ");
            primeirasCores[i-1] = scan.nextLine();
        }
        createArray(primeirasCores);
        while (true) {
            System.out.print("---------------\n" +
                    "O que deseja fazer com sua lista:\n" +
                    "[1] Printar Array\n" +
                    "[2] Adicionar Cor\n" +
                    "[3] Remover Cor\n" +
                    "[4] Verificar Cor\n" +
                    "[5] Cor na Posição\n" +
                    "[6] Ordenar Array\n" +
                    "[7] Embaralhar Array\n" +
                    "[8] Sair\n" +
                    "Digite: ");
            int escolha = scan.nextInt();
            System.out.println("---------------");
            scan.nextLine();
            if (escolha == 1) {
                printArray();
            } else if (escolha == 2) {
                addToArray();
            } else if (escolha == 3) {
                removeFromArray();
            } else if (escolha == 4) {
                hasString();
            } else if (escolha == 5) {
                stringInPos();
            } else if (escolha == 6) {
                sortArray();
            } else if (escolha == 7) {
                shuffleArray();
            } else if (escolha == 8) {
                System.out.println("Saindo do programa!");
                break;
            } else {
                System.out.println("Digite uma valor válido.");
            }
        }
    }
}