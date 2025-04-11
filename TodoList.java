public class TodoList {
    
    private final int MAX_TASKS = 100; // Tamanho máximo da array
    private Task[] tasks;
    private int count; // Número atual da tarefa
    private int nextId;

    public TodoList() { // Adiciona uma tarefa ao array

        this.tasks = new Task[MAX_TASKS];
        this.count = 0;
        this.nextId = 1;

    }

    public void addTask(String description) {
        if (count >= MAX_TASKS){
            System.out.println(" Limite de tarefas atingido!");
            return;
        }
        Task newTask = new Task(nextId, description);
        tasks[this.count] = newTask;
        this.count++; // ou this.count + 1
        nextId++;
        System.out.println(" Tarefa adicionada: " + newTask);
    }

    // Remove a terefa com o ID especificado ( Recolocando os elementos da array)
    public void removeTask(int id) { // Parametro = id

        boolean found = false;

        for (int i = 0; i < count; i++){
            if(this.tasks[i].getId() == id) {
                found = true; 
                // Desloca os elementos para a esquerda
                for (int j = i; j < count - 1; j++){
                    tasks[j] = tasks[j + 1];
                }
                tasks[count - 1] = null;
                count--;
                System.out.println(" Tarefa removida com id: " + id);
                break;
            }            
        }

        if (!found) {
            System.out.println(" Tarefa não encontrada com id: " + id);
        }

    }

    public void listTask() {
        for (Task jtask: this.tasks){
            if (jtask = null){
                break;
            }
            System.out.println(jtask.toString());
        }
    }
}
