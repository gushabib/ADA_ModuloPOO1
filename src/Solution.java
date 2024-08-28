public class Solution {

    private static double media;

    public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) {
        media =  (nota1 + nota2 + nota_trabalho)/3;
        return media;
    }
    public static String verificarPromocaoAluno(String matricula, double nota1, double nota2, double nota_trabalho) {

        media =  (nota1 + nota2 + nota_trabalho)/3;

        if(media >= 7){
            return "Aluno aprovado com média " + media;
        }else {
            return "Aluno reprovado com média " + media;
        }
    }
}
