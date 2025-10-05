package Packege_task_maneger;
import java.util.ArrayList;
import java.util.Collections;

public class TasKMeneger {

    private ArrayList<String> tarefa;

    @Override
    public String toString() {
        return "TasKMeneger{" +
                "tarefa='" + tarefa + '\'' +
                '}';
    }
    public TasKMeneger() {
        this.tarefa = new ArrayList<>();
    }
    public void adcionarTarefa(String descricao) {
        this.tarefa.add(descricao);
        System.out.println("added --> " + descricao);
    }
    /// indices will add for scanner
    public void removeTask(int indice) {
        try {
            String tarefaremovida = this.tarefa.remove(indice - 1);
            System.out.println("Task: " + tarefa + " removed!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Erro: Indice not found. try again!");
        }
    }
    public String listtasks() {
            if (this.tarefa.isEmpty()) {
                System.out.println("Task list is empty");

            }
            System.out.println("_______Tasks_lists_________");
            for (int i = 0; i < this.tarefa.size(); i ++ ){
                System.out.println((i + 1 )+". "+this.tarefa.get(i));
            }
            System.out.println("____________________________");
            String n = ("\n");
            return n;
        }
    public void orderedList(){
        Collections.sort(this.tarefa);
     }
}






