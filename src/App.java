import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nQuer construir uma SUPER pirâmide?\nDigite Sim ou apenas pressione enter");

        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        boolean huge = false;

        if(readString.equalsIgnoreCase("sim")) huge = true;


        System.out.println("\n\nVamos criar uma pirâmide numérica\nEscolha o tamanho dela:");
        boolean error = false;
        
        try(Scanner input = new Scanner(System.in)) {

            final int size = input.nextInt();

            System.out.println("\n");

            if(!huge) {
                for(int i = 1; i <= size; i++) {

                    String line = Integer.toString(i).repeat(i);
    
                    System.out.println(line.substring(0, i));
                }
            } else {
                for(int i = 1; i <= size; i++) {

                    String line = " ".repeat(size - i) + Integer.toString(i).repeat(i) + Integer.toString(i).repeat(i);
    
                    System.out.println(line.substring(0, (size - i) + i*2 - 1));
                }
            }
            
        } catch (java.util.InputMismatchException e) {
            error = true;

            System.out.println("\n-------------");
            System.out.println("Houve um erro: \"" + e.getClass().getSimpleName() + "\".\nVocê pode tentar de novo!\nUse apenas números e não tente\nconstruir uma pirâmide real.\nVem tranquilo! =)");
            System.out.println("-------------\n");

        } finally {
            scanner.close();
            if(!error && !huge) {
                System.out.println("\nVocê já está pronto para o /\\ TelexFree /\\\n");
            } else if(!error) {
                System.out.println("\n   - - -  I L L U M I N A T I  - - -\n");
            }
        }
    }
}
