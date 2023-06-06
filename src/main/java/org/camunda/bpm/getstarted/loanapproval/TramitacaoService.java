package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class TramitacaoService implements JavaDelegate {


    @Override
    public void execute(DelegateExecution de) throws Exception {
        
        System.out.println("Enviando para autorizador");

        de.setVariable("localizacaoAtualSigla", "DDS");
        de.setVariable("localizacaoAtualNome", "Diretoria de Desenvolvimento de Sistemas");
        
    }
}
