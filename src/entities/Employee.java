package entities;

import java.util.List;

public class Employee {

    private Integer id;
    private String nome;
    private Double salary;

    //Método usado para verificar se o id vai ser repetido e pedir um id diferente, paramentros de entrada são a lista e a váriável id
    public static boolean temId(List<Employee> list, int id){
        Employee result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); //Aqui é feito uma variável com base na classe Employee, é chamada de result e irá transformar os itens da lista em uma sequência de elementos de dados, depois vai filtrar esses dados com uma equação lambda depois vai chamar .findFirst().orElse(null)
        return result != null; //Nesse caso foi pedido um retorno por não se tratar de um método void
    }

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
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return  "  id=" + id +
                ", nome='" + nome + '\'' +
                ", salary=" + salary ;
    }
}

