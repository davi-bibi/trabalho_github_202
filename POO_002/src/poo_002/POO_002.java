/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_002;


import javax.swing.JOptionPane;

public class POO_002 {
    
    public static void main(String[] args){
        Aluno Aluno1 = new Aluno("bibi",17,"desenvolvedor de sistema");
         Aluno Aluno2 = new Aluno("mariana",16,"Mecanica");
         Aluno1.exibirdados();
         Aluno2.exibirdados();
         
         String nome = JOptionPane.showInputDialog("Digite um nome:");
        int Idade  = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String curso = JOptionPane.showInputDialog("Digite o curso:" );
         Aluno Aluno3= new Aluno(nome,Idade,curso);
         Aluno3.exibirdados();}}
         
         

