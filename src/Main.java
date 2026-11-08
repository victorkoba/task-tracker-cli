import com.tasktracker.model.Status;
import com.tasktracker.model.Task;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(1, "Eu preciso fazer acontecer!!");

        System.out.println("Status inicial: " + task.getStatus());
        System.out.println("Criada em:      " + task.getCreatedAt());
        System.out.println("Atualizada em:  " + task.getUpdatedAt());

        Thread.sleep(1000); // espera 1 segundo para a diferença de horário ficar visível

        task.setStatus(Status.IN_PROGRESS);

        System.out.println("Status novo:    " + task.getStatus());
        System.out.println("Criada em:      " + task.getCreatedAt());
        System.out.println("Atualizada em:  " + task.getUpdatedAt());
    }
}