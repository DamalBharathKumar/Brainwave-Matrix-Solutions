package main;

import mobel.*;

import service.*;



import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	try(scanner){
        
        PatientService patientService = new PatientService();
        StaffService staffService = new StaffService();
        AppointmentService appointmentService = new AppointmentService();
        InventoryService i=new InventoryService();
        BillingService b= new BillingService();

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Staff");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. InventoryItem");
            System.out.println("5. Bill ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                	 System.out.print("Enter Id: ");
                     int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String pname = scanner.next();
                    
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    patientService.addPatient(new Patient(id,pname, age, gender));
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String sname = scanner.nextLine();
                    System.out.print("Enter Role: ");
                    String role = scanner.nextLine();
                    staffService.addStaff(new Staff(sname, role));
                    break;
                case 3:
                    System.out.print("Enter Patient ID: ");
                    int pid = scanner.nextInt();
                    System.out.print("Enter Staff ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter DateTime (yyyy-MM-ddTHH:mm): ");
                    String dt = scanner.nextLine();
                    appointmentService.scheduleAppointment(new Appointment(pid, sid, LocalDateTime.parse(dt)));
                    break;
                case 4:
                	System.out.println("Enter Inventory Name: ");
                	String name=scanner.next();
                	System.out.println("Enter Quantity: ");
                	int q=scanner.nextInt();
                	System.out.println("Enter Cost: ");
                	double c=scanner.nextDouble();
                	i.addItem(new InventoryItem(name, q, c));          	
                	break;
                case 5:
                	System.out.println("Enter patient: ");
                	String patientName=scanner.next();
                	System.out.println("Enter amount: ");
                	double amo=scanner.nextDouble();
                	b.addBill(new Bill(sid, amo));
                	break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }  
      
    }  
}