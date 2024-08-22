public class estruturaArray {
    public static void main(String[] args) {
        String alunos [] = {"Alex","Jonas","Carlos","Julha"};

        for (int a = 0;a < alunos.length;a++){
            System.out.println(alunos[a]);
            System.out.println("Volta : "+a);
        }

        for(String aluno : alunos){
            System.out.println("*Nome do aluno é "+aluno);
        }
    }
}
