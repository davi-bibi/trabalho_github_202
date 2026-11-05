/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_002;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private String curso;
    public Aluno(String nome, int idade,String curso) {
        super(nome, idade);
        this.curso = curso;
    }
    @Override
    public void exibirdados() {
     JOptionPane.showMessageDialog(null,
             "DADOS DO ALUNO" +
              "\nNOME "+ getNome ()+
              "\nIDADE: "+ getIdade()+
              "\nCurso: "+ curso       );}
    public String getCurso() {
        return curso;}
    public void setCurso(String curso) {
        this.curso = curso;}}