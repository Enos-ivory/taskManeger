package Packege_task_maneger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TasKMeneger tasKMeneger = new TasKMeneger();

        int init = 1;
        while (init != 0) {

            System.out.println("\n==================================");
            System.out.println("     Welcome to Task Manager      ");
            System.out.println("==================================");
            System.out.println("1. Show all tasks");
            System.out.println("2. Add task(s)");
            System.out.println("3. Remove a task");
            System.out.println("4. show ordered tasks ");
            System.out.println("0. Quit");
            System.out.println("==================================");
            System.out.print("Type your option: ");

            int validation = scanner.nextInt();
            if (validation == 2){

                System.out.println("type your task bellow.....\n");
                String task = scanner.next();
                System.out.println("type another task...");
                String task2 = scanner.next();
                tasKMeneger.adcionarTarefa(task);
                tasKMeneger.adcionarTarefa(task2);
                System.out.println("________Show_tasks__________\n");

            } else if (validation == 3) {
                System.out.println("type the task indice: ");
                int indice = scanner.nextInt();
                tasKMeneger.removeTask(indice);
                System.out.println("tarefa removida\n");
                System.out.println(tasKMeneger.listtasks());

            } else if (validation == 1) {
                System.out.println(tasKMeneger.listtasks());
            } else if (validation == 4){
               /// Collections.sort(tasKMeneger);
                tasKMeneger.orderedList();
                System.out.println("Ordered list \n");
                System.out.println(tasKMeneger.listtasks());
            } else if (validation == 0) {
                System.out.println("_______Quiting_________");
                break;
            }
        }
    }
}
