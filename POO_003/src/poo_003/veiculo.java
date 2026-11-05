/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_003;

/**
 *
 * @author Aluno
 */
public abstract class veiculo {
    private String marca;
    private int ano;
    public veiculo (String marca,int ano){
    this.marca = marca;
        this.ano = ano;}

    public String getMarca() {
        return marca;
    }
    public void setMarca() {
        this.marca = marca;
    }
     public int getAno() {
        return ano;
        
    }public void setano() {
       this.ano = ano;
    }

    public abstract void exibirdados();}
