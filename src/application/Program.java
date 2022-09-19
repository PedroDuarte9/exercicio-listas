package application;

import entities.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import static entities.Employee.temId;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        //Importante que as listas podem armazenar uma classe e trazer vários tipos de dados, como nesse caso.
        List<Employee> list = new ArrayList<>();

        //Lendo os Dados:

        System.out.println("Quantos colaboradores serão registrados ?");
        Integer n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Colaborador #" + (i+1) );
            System.out.println("Id: ");
            int id = sc.nextInt();
                while(temId(list, id)){
                    System.out.println("Este Id, já foi cadastrado, digite outro");
                    id = sc.nextInt();
                }
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Salário: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, nome, salary));


        }

        System.out.println("List Of  Employees: ");
        System.out.println();
        for (Employee e : list){
            System.out.println(e);

        }

        //Chamando o id do colaborador que terá o aumento e vinculando a este colaborador
        System.out.println();
        System.out.println("Digite o id do Colaborador que terá um aumento de salário");
        int id = sc.nextInt();
        Employee epp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
                if(epp == null){
                    System.out.println("Este id não existe");
                }else{
                    System.out.println("Digite a porcentagem do aumento do " + epp.getNome());
                    double percentage = sc.nextDouble();
                    epp.increaseSalary(percentage);
                }

        //Mostrando os dados e valores Atualizados
        System.out.println("Update List Of  Employees: ");
        System.out.println();
        for (Employee e : list){
            System.out.println(e);
        }

            sc.close();
    }

}
/*
 * Listas
 *
 * - Lista é uma estrutura de dados:
 *   - Homogênea(dados do mesmo tipo)
 *   - Ordenada(elementos acessados por meio de posições)
 *   - Inicia vazia, e seus elemntos são alocados sob demana
 *   - Cada elemento ocupa um nó (ou nodo) da lista
 *
 * Tipo (Interface): List
 * - Classes que implementam: ArrayList, LinkedList, etc.
 *
 * Vantagens:
 *   - Tamanho variável
 *   - Facilidade para se realizar inserções e deleções
 *
 * Desvantagens:
 *   - Acesso sequencial aos elementos* (Este * ao final significa que pode haver exceções em alguns casos que não precise percorrer toda lista )
 *
 * DEMO(AULA PRÁTICA)
 *
 *   - Tamanho da lista: size()
 *
 *   - Inserir elemento na lista: add(obj), add(int, obj)
 *
 *   - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate) Predicate aqui em java fazemos com uma função lambda, que nos retorna verdadeiro ou falso
 *
 *   - Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
 *
 *   - Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4). collect(Collectors.toList());
 *
 *   - Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 *  */
