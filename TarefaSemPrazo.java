public class TarefaSemPrazo extends Tarefa {

    public TarefaSemPrazo(String titulo, String descricao) {
        super(titulo, descricao, "Sem prazo definido", 0);
    }

    @Override
    public long calcularDiasRestantes() {
        return -1; 
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Status: Tarefa sem prazo.");
    }
}