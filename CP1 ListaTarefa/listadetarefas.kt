data class Task(val id: Int, var title: String, var description: String, var completed: Boolean = false)

class TaskManager {
    private val tasks = mutableListOf<Task>()
    private var taskIdCounter = 1

    fun addTask(title: String, description: String) {
        val task = Task(taskIdCounter, title, description)
        tasks.add(task)
        taskIdCounter++
        println("\nTarefa adicionada!")
    }

    fun listTasks() {
        if (tasks.isEmpty()) {
            println("\nNão há tarefas cadastradas")
        } else {
            println("Lista de Tarefas: ")
            for ((index, task) in tasks.withIndex()) {
                println("${index + 1}. [${if (task.completed) "x" else " "}] ${task.title}")
            }
            println()
        }
    }

    fun markTaskAsCompleted(taskIndex: Int) {
        if (taskIndex >= 1 && taskIndex <= tasks.size) {
            tasks[taskIndex - 1].completed = true
            println("\nTarefa marcada como concluída!")
        } else {
            println("\nÍndice de tarefa inválido.")
        }
    }

    fun removeTask(taskIndex: Int) {
        if (taskIndex >= 1 && taskIndex <= tasks.size) {
            val removedTask = tasks.removeAt(taskIndex - 1)
            println("Tarefa '${removedTask.title}' removida")
        } else {
            println("A tarefa é inválido.")
        }
    }
}

fun main() {
    val taskManager = TaskManager()

    println("Bem-vindo à Lista de Tarefas!")

    var option: Int
    do {
        println("\nMenu:")
        println("1. Adicionar Tarefa")
        println("2. Marcar Tarefa como Concluída")
        println("3. Listar Tarefas")
        println("4. Sair")

        println("Escolha uma opção: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> {
                println("\nDigite o título da nova tarefa:")
                val title = readLine() ?: ""
                println("Digite a descrição da tarefa:")
                val description = readLine() ?: ""
                taskManager.addTask(title, description)
            }
            2 -> {
                println("\nDigite o índice da tarefa a ser marcada como concluída:")
                val taskIndex = readLine()?.toIntOrNull() ?: 0
                taskManager.markTaskAsCompleted(taskIndex)
            }
            3 -> {
                taskManager.listTasks()
            }
        }
    } while (option != 4)

    println("Até logo!")
}