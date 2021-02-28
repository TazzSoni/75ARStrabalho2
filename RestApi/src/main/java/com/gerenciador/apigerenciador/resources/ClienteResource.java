/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.apigerenciador.resources;

import Validador.ValidarCPF;
import com.gerenciador.apigerenciador.models.Cliente;
import com.gerenciador.apigerenciador.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rodrigo
 */
@RestController
@RequestMapping(value = "/api")
public class ClienteResource {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public List<Cliente> listaClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteId(@PathVariable(value = "id") long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping("/cliente")
    public String createCliente(@RequestBody Cliente cliente) {
        if (ValidarCPF.verificaCPF(cliente.getCpf())) {
            String result = "";
            try { // Call Web Service Operation
                servicos.WebServiceA_Service service = new servicos.WebServiceA_Service();
                servicos.WebServiceA port = service.getWebServiceAPort();
                // TODO initialize WS operation arguments here
                double valor = cliente.getEmprestimo().getValorParcelas();
                double renda = cliente.getSalario();
                // TODO process result here
                result = port.verApto(valor, renda);

            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
            if (result.equals("APROVADO")) {
                clienteRepository.save(cliente);
                return "Emprestimo Aprovado, cliente cadastrado";
            } else {
                return "Emprestimo reprovado!!";
            }
        } else {
            return "CPF invalido!!";
        }

    }

    @PutMapping("/cliente/{nome}")
    public Cliente editCliente(@PathVariable(value = "nome") String nome, @RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public Cliente deleteCliente(@PathVariable(value = "id") long id) {
        Cliente c = clienteRepository.findById(id);
        clienteRepository.delete(c);
        return c;
    }
}
