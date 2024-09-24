package com.aluguelcarrolds.aluguel_carro_lds.services;

import com.aluguelcarrolds.aluguel_carro_lds.entityes.Cliente;
import com.aluguelcarrolds.aluguel_carro_lds.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente obterCliente(Long id) {
        // Busca o cliente no banco de dados
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        if (clienteRepository.existsById(id)) {
            clienteAtualizado.setId(id);
            return clienteRepository.save(clienteAtualizado);
        }
        return null;
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}
