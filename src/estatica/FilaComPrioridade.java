package estatica;

public class FilaComPrioridade<T> extends FilaEstatica<T> {

    public FilaComPrioridade(int capacidade) {
        super(capacidade);
    }

    @Override
    public void enfileirar(T elemento) {
        if (estaCheia()) {
            throw new RuntimeException("A fila está cheia.");
        }

        elementos[tamanho] = elemento;
        sobeHeap(tamanho);
        tamanho++;
    }

    @Override
    public T desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia");
        }

        T raiz = elementos[0];
        elementos[0] = elementos[tamanho - 1];
        elementos[tamanho - 1] = null;
        tamanho--;

        if (tamanho > 0) {
            desceHeap(0);
        }

        return raiz;
    }

    private void sobeHeap(int indice) {
        int indicePai = (indice - 1) / 2;

        while (indice > 0 && comparar(elementos[indice], elementos[indicePai]) > 0) {
            trocar(indice, indicePai);
            indice = indicePai;
            indicePai = (indice - 1) / 2;
        }
    }

    private void desceHeap(int indice) {
        int maior = indice;
        int filhoEsq = 2 * indice + 1;
        int filhoDir = 2 * indice + 2;

        if (filhoEsq < tamanho && comparar(elementos[filhoEsq], elementos[maior]) > 0) {
            maior = filhoEsq;
        }

        if (filhoDir < tamanho && comparar(elementos[filhoDir], elementos[maior]) > 0) {
            maior = filhoDir;
        }

        if (maior != indice) {
            trocar(indice, maior);
            desceHeap(maior);
        }
    }

    private void trocar(int i, int j) {
        T temp = elementos[i];
        elementos[i] = elementos[j];
        elementos[j] = temp;
    }

    @SuppressWarnings("unchecked")
    private int comparar(T a, T b) {
        return ((Comparable<T>) a).compareTo(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
