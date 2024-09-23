package org.example.aluguelcarroslds.models;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class Usuario implements Serializable {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String rg;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    public boolean login(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void logout() {
        System.out.println("Usuário deslogado.");
    }
}
