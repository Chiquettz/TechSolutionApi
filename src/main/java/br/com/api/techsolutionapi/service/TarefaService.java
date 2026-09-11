package br.com.api.techsolutionapi.service;

import br.com.api.techsolutionapi.model.Tarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    private final List<Tarefa> tarefas = new ArrayList<>();

    public Tarefa cadastrarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public Tarefa buscarTarefa(int indice) {
        return tarefas.get(indice);
    }

    public Tarefa atualizarTarefa(int indice, Tarefa tarefa) {
        tarefas.set(indice, tarefa);
        return tarefa;
    }

    public Tarefa removerTarefa(int indice) {
        return tarefas.remove(indice);
    }


}