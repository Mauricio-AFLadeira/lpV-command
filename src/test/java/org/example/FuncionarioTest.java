package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;
    Interruptor interruptor;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario();
        interruptor = new Interruptor ();
    }

    @Test
    void deveLigarInterruptor() {
        Tarefa ligarInterruptor = new LigarInterruptorTarefa(interruptor);
        funcionario.executarTarefa(ligarInterruptor);

        assertEquals("Interruptor ligado", interruptor.getSituacao());
    }

    @Test
    void deveDesligarInterruptor() {
        Tarefa desligarInterruptor = new DesligarInterruptorTarefa(interruptor);
        funcionario.executarTarefa(desligarInterruptor);

        assertEquals("Interruptor desligado", interruptor.getSituacao());
    }

    @Test
    void deveCancelarDesligarInterruptor() {
        Tarefa ligarInterruptor = new LigarInterruptorTarefa(interruptor);
        Tarefa desligarInterruptor = new DesligarInterruptorTarefa(interruptor);

        funcionario.executarTarefa(ligarInterruptor);
        funcionario.executarTarefa(desligarInterruptor);

        funcionario.cancelarUltimaTarefa();

        assertEquals("Interruptor ligado", interruptor.getSituacao());
    }


}