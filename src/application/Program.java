package application;

import entities.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        List<Integer> listId = new ArrayList<>();
        List<String> listNome = new ArrayList<>();
        List<Double> listSala = new ArrayList<>();

        System.out.println("How many employees will be registered ?");
        Integer n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) );
            System.out.println("Id: ");
            int id = sc.nextInt();
            emp.setId(id);
            listId.add(emp.getId());

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            emp.setNome(nome);
            listNome.add(emp.getNome());

            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            emp.setSalary(salary);
            listSala.add(emp.getSalary());

        }
        List<Employee> result = listId.stream().filter(x -> x <  ).findAny().orElse(null);

        System.out.println("List Of  Employees: ");
        System.out.println();

        for (int i = 0; i < n; i++ ){

            System.out.println(emp.getId());
            System.out.println(emp.getNome());
            System.out.println(emp.getSalary());
        }

            sc.close();
    }
}
