package uff.ic.lleme.tcc00328.exemplo.thread.threadSimplesRunnable;

public class ThreadSimplesRunnable implements Runnable {

    private Tarefa tarefa = null;

    public ThreadSimplesRunnable(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public void run() {
        tarefa.resultado = 0.0;
        for (Double numero : tarefa.numeros)
            tarefa.resultado += numero;
        tarefa.resultado /= tarefa.numeros.length;
    }
}
