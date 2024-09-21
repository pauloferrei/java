
public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar conceitos", "2024-05-15", 1);
        TarefaUrgente tarefaUrg1 = new TarefaUrgente("Estudar para a prova", "Conceitos de POO", "2024-10-02", "Não entendi nada");
        TarefaComPrazoFlexivel tarefaFlex1 = new TarefaComPrazoFlexivel("Estudar estrutura de dados", "Conceitos de lista ligada", "2024-10-18", 2, 5);
        TarefaSemPrazo tarefaSemPrazo = new TarefaSemPrazo("Lavar a louça", "Lavar toda a louça acumulada");
        TarefaComAlerta tarefaAlerta = new TarefaComAlerta("Fazer exercício", "Caminhar 30 minutos", "2024-09-25", 3);

        Tarefa[] listaTarefas = { tarefa1, tarefaUrg1, tarefaFlex1, tarefaSemPrazo, tarefaAlerta };


        for (Tarefa tarefa : listaTarefas) {
            tarefa.exibirDetalhes();
            if (tarefa instanceof TarefaUrgente) {
                System.out.println("Tipo: Tarefa Urgente");
            } else if (tarefa instanceof TarefaComPrazoFlexivel) {
                System.out.println("Tipo: Tarefa com Prazo Flexível");
            } else if (tarefa instanceof TarefaSemPrazo) {
                System.out.println("Tipo: Tarefa Sem Prazo");
            }
            System.out.println("====================================================");
        }
    }
}