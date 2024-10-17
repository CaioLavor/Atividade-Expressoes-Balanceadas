public class Pilha
{
    Elemento top;
    int tamanho;

    public Pilha()
    {
        this.top = null;
        this.tamanho = 0;
    }

    public void push(char valor)
    {
        Elemento elem = new Elemento(valor);
        elem.proxi = this.top;
        this.top = elem;
        this.tamanho++;
    }

    public char pop()
    {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return '\0';
        }

        Elemento elem = top;
        char m = elem.valor;
        top = top.proxi;
        tamanho--;
        return m;
    }

    public int size()
    {
        return tamanho;
    }

    public boolean isEmpty()
    {
        return tamanho == 0;
    }

    public void print()
    {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            Elemento aux = this.top;
            while (aux != null) {
                System.out.println(aux.valor);
                aux = aux.proxi;
            }
        }
    }
}