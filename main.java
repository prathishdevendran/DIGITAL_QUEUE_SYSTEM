import java.util.Scanner;
// main program to execute
class main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        circularQueue queue = new circularQueue(5);

        int idCounter = 1;

        System.out.println("Welcome to\nHospital Digital Queue Management");
        while(true){
            System.out.println("\n1. Add Patient(Enqueue)");
            System.out.println("2. Serve Patient(Dequeue)");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");

            System.out.print("\nChoose option: ");
            int choice = sc.nextInt();


            switch(choice){
                case 1:
                    if(!queue.isFull()){
                        sc.nextLine();
                        System.out.println("Enter Patient name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter phone_number: ");
                        long ph = sc.nextLong();
                        
                        patient p = new patient(idCounter++,name,age,ph);
                        queue.enqueue(p);
                    }else{
                        System.out.println("\nQueue is full cannat add more patients!\n");
                    }
                    
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting Management System..!!!");
                    return;
                default: 
                    System.out.println("Invalid choice!!! Try again.");
            }
        }

    }
}