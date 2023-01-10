import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Vamos criar uma pirâmide numérica\nEscolha o tamanho dela:");
        boolean error = false;
        
        try(Scanner input = new Scanner(System.in)) {

            final int size = input.nextInt();

            System.out.println("\n");

            for(int i = 1; i <= size; i++) {
                String letter = Integer.toString(i);
                String line = letter.repeat(i);

                System.out.println(line.substring(0, i));

            }
            
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("\nFeito =D\n");
        }
    }
}
