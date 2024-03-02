public class Funcionario {
    String nome;
    String cpf;
    String matricula;
    String departamento;
    double salario;

    public Funcionario (String nome, String cpf, String matricula,String departamento, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.departamento = departamento;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    public String getDepartamento(){
        return this.departamento;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}