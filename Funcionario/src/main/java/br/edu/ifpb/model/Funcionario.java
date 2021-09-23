package br.edu.ifpb.model;


/**
 *
 * @author wendel
 */
public class Funcionario {
    
    private String nome;
    private String CPF;
    private String matricula;
    private Double salario;

    //construtor que será utilizado pelo builder
    
    private Funcionario(String nome, String CPF, String matricula, Double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.matricula = matricula;
        this.salario = salario;
    }

    //Classe Interna
    
    public static class FuncionarioBuilder{
    
        private String nome;
        private String CPF;
        private String matricula;
        private Double salario;

        public FuncionarioBuilder(){
            
        }
        
        public FuncionarioBuilder nome (String nome) {
            this.nome = nome;
            return this;
        }
        
        public FuncionarioBuilder cpf (String cpf) {
            this.CPF = cpf;
            return this;
        }
        
        public FuncionarioBuilder matricula (String matricula) {
            this.matricula = matricula;
            return this;
        }
        
        public FuncionarioBuilder salario (Double salario) {
            this.salario = salario;
            return this;
        }
        
        public Funcionario criarFuncionario () {
            return new Funcionario(nome, CPF, matricula, salario);
        }
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", CPF=" + CPF + ", matricula=" + matricula + ", salario=" + salario + '}';
    }
    
    
    
}
