package Packege_task_maneger;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TasKMeneger tasKMeneger = new TasKMeneger();

        int init = 1;
        while (init != 0) {

            System.out.println("____Welcome_a_task_manager_____");
            System.out.println("for add task type 2");
            System.out.println("to remove one task type 3");
            System.out.println("type 4 for list tasks");
            System.out.println("type 5 to see the ordered list");
            System.out.println("to quit type 0");
            System.out.println("_______________________________");

            int validation = scanner.nextInt();
            if (validation == 2){

                System.out.println("type your task bellow.....\n");
                String task = scanner.next();
                System.out.println("type another task...");
                String task2 = scanner.next();
                tasKMeneger.adcionarTarefa(task);
                tasKMeneger.adcionarTarefa(task2);
                System.out.println("________Show_tasks__________\n");
                System.out.println(tasKMeneger.listtasks());

            } else if (validation == 3) {
                System.out.println("type the task indice: ");
                int indice = scanner.nextInt();
                tasKMeneger.removeTask(indice);
                System.out.println("tarefa removida\n");
                System.out.println(tasKMeneger.listtasks());

            } else if (validation == 4) {
                System.out.println(tasKMeneger.listtasks());
            } else if (validation == 5){
               /// Collections.sort(tasKMeneger);
                tasKMeneger.orderedList();
                System.out.println("listas ordenadas \n");
                System.out.println(tasKMeneger.listtasks());
            } else if (validation == 0) {
                System.out.println("_______Quiting_________");
                break;
            }
        }
    }
}
