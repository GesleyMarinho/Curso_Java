package Gabriel;



import java.lang.Math;
import javax.swing.JOptionPane;
import java.lang.Integer;

public class Main {
    public static void main(String [] args) {

        String Op;
        double resultado,numA,numB;

        Calculo calc = new Calculo();

        JOptionPane.showMessageDialog(null,"Digite o código da operação desejada: ");
        Op=JOptionPane.showInputDialog("1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Percentual \n6 - Potência \n7 - Raiz Quadrada \n8 - Resto da Divisão");

        switch(Integer.parseInt(Op)) {
            case 1 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Adição");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                resultado = calc.Adicao(numA, numB);
                mortraResultado("Adicao",resultado);
                break;
            case 2 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Subtração");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                resultado = calc.Subtracao(numA, numB);
                mortraResultado("Subtração",resultado);
                break;
            case 3 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Multiplicação");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                resultado = calc.Multiplicacao(numA, numB);
                mortraResultado("Multiplicação",resultado);
                break;
            case 4 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Divisão");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                if (numB == 0) {
                    JOptionPane.showMessageDialog(null,"IMPOSSIVEL DIVIDIR POR 0!!!");
                }
                else {
                    resultado = calc.Divisao(numA, numB);
                    mortraResultado("Divisao",resultado);
                }

                break;
            case 5 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Percentual");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                resultado = calc.Porcentagem(numA, numB);
                mortraResultado("Porcentagem",resultado);
                break;
            case 6 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Potência");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                resultado = calc.Potencia(numA, numB);
                mortraResultado("Potência",resultado);
                break;
            case 7 :
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Raiz Quadrada");
                numA=lerValor("Insira o primeiro número: ");
                if(numA < 0) {
                    JOptionPane.showMessageDialog(null,"valor inválido!!!");
                }
                else {
                    resultado = calc.RaizQuadrada(numA);
                    mortraResultado("Raiz Quadrada",resultado);
                }

                break;
            case 8:
                JOptionPane.showMessageDialog(null,"A opção escolhida foi: "+Op+" - Resto da Divisão");
                numA=lerValor("Insira o primeiro número: ");
                numB=lerValor("Insira o segundo número: ");
                if (numB == 0) {
                    JOptionPane.showMessageDialog(null,"IMPOSSIVEL DIVIDIR POR 0!!!");
                }
                else {
                    resultado = calc.RestoDiv(numA, numB);
                    mortraResultado("Resto da Divisão",resultado);
                }
                break;
            default :
                JOptionPane.showMessageDialog(null,"código inválido!!!");

        }
    }
    static void mortraResultado(String operacao, double resultado) {
        // TODO Auto-generated method stub
        //JOptionPane.showMessageDialog(null,"Resultado da operação: "+operacao);
        JOptionPane.showMessageDialog(null,
                String.format("Resultado da Operação de %s:\n"+
                                "resulta em %.2f",
                        operacao,resultado),
                "Resultado",JOptionPane.PLAIN_MESSAGE);
    }
    static double lerValor(String mensagem){
        double valor;
        String strValor;
        strValor = JOptionPane.showInputDialog(null,
                mensagem,"Entrada de Dados...",
                JOptionPane.QUESTION_MESSAGE);
        valor = Double.parseDouble(strValor);
        return valor;
    }

}
