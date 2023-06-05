package org.camunda.bpm.getstarted.loanapproval;

import org.springframework.stereotype.Component;

@Component
public class TramitacaoService {
    
    public void enviarParaAutorizador(){
        System.out.println("Enviando para autorizador");
    }
}
