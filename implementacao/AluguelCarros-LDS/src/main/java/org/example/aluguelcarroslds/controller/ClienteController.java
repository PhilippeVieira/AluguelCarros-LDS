package org.example.aluguelcarroslds.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.aluguelcarroslds.models.Cliente;
import org.example.aluguelcarroslds.services.ClienteService;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@RestController
@Api(value = "CRUD Cliente")
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @ApiOperation(value = "Criar Cliente")
    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.criarCliente(cliente));
    }

    @ApiOperation(value = "Obter Cliente")
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obterCliente(@PathVariable Long id) {
        Cliente cliente = clienteService.obterCliente(id);
        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Atualizar Cliente")
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente atualizado = clienteService.atualizarCliente(id, cliente);
        return atualizado != null ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Deletar Cliente")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }

    @ApiOperation(value = "Listar Clientes")
    @GetMapping
    public ResponseEntity<Map<Long, Cliente>> listarClientes() {
        return ResponseEntity.ok(clienteService.listarClientes());
    }
}
