package br.com.api.techsolutionapi.controller;

import br.com.api.techsolutionapi.model.Tarefa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final List<Tarefa> tarefas = new ArrayList<>();

    @PostMapping
    public Tarefa cadastrarTarefa(@RequestBody Tarefa tarefa) {
        tarefas.add(tarefa);
        return tarefa;
    }

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    @GetMapping("/{indice}")
    public Tarefa buscarTarefa(@PathVariable int indice) {
        return tarefas.get(indice);
    }

    @PutMapping("/{indice}")
    public Tarefa atualizarTarefa(
            @PathVariable int indice,
            @RequestBody Tarefa tarefa) {

        tarefas.set(indice, tarefa);
        return tarefa;
    }

    @DeleteMapping("/{indice}")
    public Tarefa removerTarefa(@PathVariable int indice) {
        return tarefas.remove(indice);
    }
}
