/* Programador: Robson Santos
 * Data: 01/12/2022
 * Programa: Sistema de Cadastro e Busca de Veículos
 */
import javax.swing.JOptionPane;
import java.io.IOException;

public class CPrincipal {
    public static void main(String[]args) throws IOException{
        Veiculo[] veiculo = new Veiculo[5];
        CMetodos m = new CMetodos();
        double limite = 0;
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção: \n 1 - Cadastro de veiculo \n 2 - Busca por ano \n 3 - Busca por  limite de valor, maior e menor valor \n 9 - Finalizar"));
            switch (opc){
                case 1:
                m.FCadastra(veiculo);
                break;
                case 2:
                m.FBuscaMenor(veiculo);
                break;
                case 3:
                limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor limite "));
                m.FBuscaLimite(veiculo, limite);
                break;
                case 9:
                JOptionPane.showMessageDialog(null, "Finalizado");
                break;
                default: 
                JOptionPane.showMessageDialog(null, "Valor invalido");
            }

        }
    }
}
   