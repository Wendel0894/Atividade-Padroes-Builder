
package br.edu.ifpb.app;

import br.edu.ifpb.model.Funcionario;

/**
 *
 * @author wendel
 */
public class App {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario.FuncionarioBuilder()
                .nome("Wendel")
                .cpf("123.456.789-01")
                .matricula("1234")
                .salario(2000d)
                .criarFuncionario();

        
        System.out.println(funcionario);
        
    }
    
}
