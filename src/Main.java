import entidades.Paciente;
import estatica.FilaComPrioridade;

public class Main {
    public static void main(String args[]) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>(10);

        System.out.println("--- Inserindo pacientes ---");

        System.out.println("Inserindo: Carlos");
        fila.enfileirar(new Paciente("Carlos", 2, 45, false));
        System.out.println("Estado do Heap: " + fila);

        System.out.println("Inserindo: Maria");
        fila.enfileirar(new Paciente("Maria", 5, 5, false));
        System.out.println("Estado do Heap: " + fila);

        System.out.println("Inserindo: João");
        fila.enfileirar(new Paciente("João", 3, 20, false));
        System.out.println("Estado do Heap: " + fila);

        System.out.println("Inserindo: Beatriz");
        fila.enfileirar(new Paciente("Beatriz", 3, 35, true));
        System.out.println("Estado do Heap: " + fila);

        System.out.println("Inserindo: Pedro");
        fila.enfileirar(new Paciente("Pedro", 5, 2, false));
        System.out.println("Estado do Heap: " + fila);

        System.out.println("Inserindo: Helena");
        fila.enfileirar(new Paciente("Helena", 2, 45, true));
        System.out.println("Estado do Heap: " + fila);

        System.out.println("\n--- Removendo pacientes ---");
        int ordem = 1;
        while (!fila.estaVazia()) {
            System.out.println(ordem + ". " + fila.desenfileirar());
            ordem++;
        }
    }
}