package org.example;

public class LigarInterruptorTarefa implements Tarefa{
    private Interruptor interruptor;

    public LigarInterruptorTarefa(Interruptor interruptor) {
        this.interruptor = interruptor;
    }

    public void executar() {
        this.interruptor.ligarInterruptor();
    }

    public void cancelar() {
        this.interruptor.desligarInterruptor();
    }
}
