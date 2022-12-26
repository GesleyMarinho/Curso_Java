package Enumeracoes_Composicoes.Ex01.aplication;

import Enumeracoes_Composicoes.Ex01.Entites.Department;
import Enumeracoes_Composicoes.Ex01.Entites.HourContract;
import Enumeracoes_Composicoes.Ex01.Entites.Worker;
import Enumeracoes_Composicoes.Ex01.Entites.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Qual o seu departamento: ");
        String departmentName = ler.nextLine();
        System.out.println("Entre com os Dados: ");
        System.out.print("Nome:  ");
        String workerName = ler.nextLine();
        System.out.print("Level: ");
        String workerlevel = ler.nextLine();
        System.out.print("Digite o Salario Base: ");
        double baseSalary = ler.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerlevel), baseSalary, new Department(departmentName));

        System.out.printf("Quantos Contratos ele tem ? ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com o contrato #" + i + " data ");
            System.out.printf("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(ler.next());
            System.out.printf("Valor por hora ");
            double valuePerHour = ler.nextDouble();
            System.out.printf("Duração (horas) ");
            int hours = ler.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Entre com Mês e Ano para calcular sálario (MM/YYYY) : ");
        String monthAndYear = ler.next();
        int year = Integer.parseInt(monthAndYear.substring(3));
        int month = Integer.parseInt(monthAndYear.substring(0, 2));

        System.out.println("NOME: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Data e valores " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }
}
