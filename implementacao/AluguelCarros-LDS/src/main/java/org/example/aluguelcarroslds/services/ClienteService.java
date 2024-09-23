package org.example.aluguelcarroslds.services;

import org.example.aluguelcarroslds.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ClienteService {

    private final Map<Long, Cliente> clienteCache = new ConcurrentHashMap<>();
    private long currentId = 1;

    public Cliente criarCliente(Cliente cliente) {
        cliente.setId(currentId++);
        clienteCache.put(cliente.getId(), cliente);
        return cliente;
    }

    public Cliente obterCliente(Long id) {
        return clienteCache.get(id);
    }

    public Cliente atualizarCliente(Long id, Cliente cliente) {
        if (clienteCache.containsKey(id)) {
            cliente.setId(id);
            clienteCache.put(id, cliente);
            return cliente;
        }
        return null;
    }

    public void deletarCliente(Long id) {
        clienteCache.remove(id);
    }

    public Map<Long, Cliente> listarClientes() {
        return clienteCache;
    }
}
