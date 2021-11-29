package com.capgemini.rebecca;

import com.capgemini.rebecca.repository.ContaCorrenteRepository;
import com.capgemini.rebecca.model.ContaCorrente;

public class AppContaCorrente {
    public static void main( String[] args ){
        ContaCorrenteRepository repository = new ContaCorrenteRepository();
        ContaCorrente cc = new ContaCorrente();
        cc.setNome("Agência 1233");
        cc.setDescricao("Conta 12345-6");
        repository.create(cc);

    }
}
