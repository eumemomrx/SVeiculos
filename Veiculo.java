/* Programador: Robson Santos
 * Data: 01/12/2022
 * Programa: Sistema de Cadastro e Busca de Veículos
 */
public class Veiculo {
    String Modelo;
    int Ano;
    String Cor;
    double Valor;

    Veiculo(){
        this("", 0, "", 0.0);
    }
    Veiculo( String ModeloV, int AnoV, String CorV, double ValorV){
        Modelo = ModeloV;
        Ano = AnoV;
        Cor = CorV;
        Valor = ValorV;
    }
}
