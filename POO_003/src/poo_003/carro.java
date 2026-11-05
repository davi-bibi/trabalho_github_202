/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_003;

/**
 *
 * @author Aluno
 */
public class carro {
    public class carro extends veiculo {
    private String modelo;
    private String quantidade;
    public veiculo(String marca, int ano,String modelo) {
        super(marca, ano);
        this.modelo = modelo;
        this.quantidade = quantidade;
    }
    @Override
    public void exibirdados() {
     JOptionPane.showMessageDialog(null,
             "DADOS DO carro" +
              "\nmarca "+ getmarca ()+
              "\nano: "+ getano()+
              "\nmodelo: "+ modelo+
              "\n quantidade:"+quantidade       );}
    public String getCurso() {
        return modelo;
        return quantidade;}
    public void setCurso(int quantidade,String modelo) {
        this.modelo = modelo;
        this.quantidade = quantidade}}
        public String getmodelo(){
            return modelo;
        }
         public void setmodelo(String modelo){
            this.modelo = modelo;
        }  public int getquantidade(){
            return quantidade;
        }
         public void setquantidade(int quantidade){
            this.quantidade = quantidade;
        }
        
}
