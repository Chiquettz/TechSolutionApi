package br.com.api.techsolutionapi.controller;

import br.com.api.techsolutionapi.model.Tarefa;
import br.com.api.techsolutionapi.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public Tarefa cadastrarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.cadastrarTarefa(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @GetMapping("/{indice}")
    public Tarefa buscarTarefa(@PathVariable int indice) {
        return tarefaService.buscarTarefa(indice);
    }

    @PutMapping("/{indice}")
    public Tarefa atualizarTarefa(
            @PathVariable int indice,
            @RequestBody Tarefa tarefa) {

        return tarefaService.atualizarTarefa(indice, tarefa);
    }

    @DeleteMapping("/{indice}")
    public Tarefa removerTarefa(@PathVariable int indice) {
        return tarefaService.removerTarefa(indice);
    }
}