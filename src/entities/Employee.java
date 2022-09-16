package entities;

public class Employee {

    private Integer id;
    private String nome;
    private Double salary;

    public Employee(){

    }

    public Employee(Integer id, String nome, Double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public Employee(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){

    }

    @Override
    public String toString() {
        return  "  id=" + id +
                ", nome='" + nome + '\'' +
                ", salary=" + salary ;
    }
}

