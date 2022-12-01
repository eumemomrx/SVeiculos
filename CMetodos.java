/* Programador: Robson Santos
 * Data: 01/12/2022
 * Programa: Sistema de Cadastro e Busca de Veículos
 */
import javax.swing.JOptionPane;
import java.io.*;

public class CMetodos{
    public Veiculo[] FCadastra(Veiculo[] veiculo) throws IOException{
        int i;
        String arquivo = "veiculos.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
        for (i = 0; i<5; i++){
            veiculo[i]= new Veiculo();
        }
        for (i=0;i<5;i++){
            veiculo[i].Modelo =JOptionPane.showInputDialog("Digite o modelo do carro");
            veiculo[i].Ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
            veiculo[i].Cor = JOptionPane.showInputDialog("Digite a cor do carro");
            veiculo[i].Valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro"));
            grava.write(veiculo[i].Modelo);
            grava.newLine();
            grava.write(Integer.toString(veiculo[i].Ano));
            grava.newLine();
            grava.write(veiculo[i].Cor);
            grava.newLine();
            grava.write(Double.toString(veiculo[i].Valor));
            grava.newLine();
        }
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        grava.close();
        return veiculo;
    }

    public Veiculo[] FBuscaMenor(Veiculo[] veiculo) throws IOException{
        int i;
        String db = "veiculos.txt";
        int menor = 0;
        int x = 0;
        BufferedReader ler = new BufferedReader(new FileReader(db));
        for (i=0; i<5; i++){
            veiculo[i] = new Veiculo();
        }
        for (i=0; i<5; i++){
            veiculo[i].Modelo = ler.readLine();
            veiculo[i].Ano = Integer.parseInt(ler.readLine());
            veiculo[i].Cor = ler.readLine();
            veiculo[i].Valor = Double.parseDouble(ler.readLine());
        }
        for (i=0; i<5; i++){
            if(veiculo[i].Ano <menor){
                menor = veiculo[i].Ano;
            }
        }
        while (x<3){
            for(i=0; i<5; i++){
             if (veiculo[i].Ano == menor){
                JOptionPane.showMessageDialog(null, "Carro " + veiculo[i].Modelo + "\n Ano " + veiculo[i].Ano + "\n Cor " + veiculo[i].Cor + "\n Valor " + veiculo[i].Valor);
                x++;
                }
            }
            menor++;
        }
        ler.close();
        return veiculo;
    }
    public Veiculo[] FBuscaLimite(Veiculo[] veiculo, double limite) throws IOException{
        int i;
        String db = "veiculos.txt";
        BufferedReader ler = new BufferedReader(new FileReader(db));
        for(i=0; i<5; i++){
            veiculo[i]= new Veiculo();
        }
        for (i = 0; i<5 ; i++){
            veiculo[i].Modelo = ler.readLine();
            veiculo[i].Ano = Integer.parseInt(ler.readLine());
            veiculo[i].Cor = ler.readLine() ;
            veiculo[i].Valor = Double.parseDouble(ler.readLine());
        }
        double maior = veiculo[0].Valor;
        double menor = veiculo[0].Valor;
        for (i=0; i<5; i++){
            if (veiculo[i].Valor <= limite){
                JOptionPane.showMessageDialog(null,"Valor limite: " + limite + "\n Carro " + veiculo[i].Modelo + "\n Ano " + veiculo[i].Ano + "\n Cor " + veiculo[i].Cor + "\n Valor " + veiculo[i].Valor);
            }
            if(veiculo[i].Valor> maior){
                maior = veiculo[i].Valor;
            }
            if(veiculo[i].Valor< menor){
                menor = veiculo[i].Valor;
            }
        }
        for(i=0; i<5;i++){
            if(veiculo[i].Valor == menor){
                JOptionPane.showMessageDialog(null,"Menor valor encontrado \n Carro "+veiculo[i].Modelo+"\n Ano "+veiculo[i].Ano+"\n Cor "+veiculo[i].Cor+"\n Valor "+veiculo[i].Valor);
            }
            if(veiculo[i].Valor == maior){
                JOptionPane.showMessageDialog(null,"Maior valor encontrado \n Carro "+veiculo[i].Modelo+"\n Ano "+veiculo[i].Ano+"\n Cor "+veiculo[i].Cor+"\n Valor "+veiculo[i].Valor);
            }
        }
        ler.close();
        return veiculo;
        
    }

}