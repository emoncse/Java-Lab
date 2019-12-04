/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap_hr;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class UAP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Create New Employee");
        System.out.println("2. Get Salary Information");
        System.out.println("3. Salary of an Employee");
        System.out.println("4. Display the details of a specific Employee");
        
        String name;
        String id;
        String designation;

        while (true) {
            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("1. Salaried Employee ( Name, ID, Designation, Salary )");
                    System.out.println("2. Hourly Employee ( Name, ID, Designation, HourlyRate, HourWorked)");
                    System.out.println("3. Commission Employee ( Name, ID, Designation, Hourly Rate, Work Hour)");
                    int op = scanner.nextInt();
                    switch (op) {
                        case 1: {
                            name = scanner.next();
                            id = scanner.next();
                            designation = scanner.next();
                            double salary = scanner.nextDouble();
                            SalariedEmployee employee = new SalariedEmployee(name, id, designation, salary);
                        }
                        break;
                        case 2: {
                            name = scanner.next();
                            id = scanner.next();
                            designation = scanner.next();
                            double hourRate = scanner.nextDouble();
                            int hour = scanner.nextInt();
                            HourlyEmployee employee = new HourlyEmployee(name, id, designation, hourRate, hour);
                        }
                        break;
                        case 3: {
                            name = scanner.next();
                            id = scanner.next();
                            designation = scanner.next();
                            double commission = scanner.nextDouble();
                            double sale = scanner.nextInt();
                            CommissionEmployee employee = new CommissionEmployee(name, id, designation, commission, sale);
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    id = scanner.next();
                    UapCse myUap = new UapCse();
                    System.out.println("ID : " + id + "Salary : " + myUap.getSalary(id));
                }
                break;
                case 3: {
                    id = scanner.next();
                    double increaseSalary = scanner.nextDouble();
                    UapCse myUap = new UapCse();
                    myUap.increaseSalary(id, increaseSalary);
                }
                break;
                case 4: {
                    UapCse myUap = new UapCse();
                    myUap.display();
                }
                break;
                default:
                    System.out.println("Option invalid");
                    break;
            }
        }
    }
}