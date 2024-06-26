/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote_veiculo;

import pacote_veiculo.Enuns.CategoriaCarro;
import java.util.Objects;
import pacote_debitos.Debitos;
import pacote_pessoa.Pessoa;


public class Carro extends Veiculo{
    
    private CategoriaCarro categoria;
    private String cor;
    private String modelo;
    private int ano;
    
    public Carro(String placa, String chassi, String renavam, Debitos debitos, Pessoa dono, int eixos, double preco, String categoria, String cor, String modelo, int ano) {
        super(placa, chassi, renavam, debitos, dono, eixos, preco);
        this.setAno(ano);
        this.setCategoria(categoria);
        this.setCor(cor);
        this.setModelo(modelo);
    }

    public CategoriaCarro getCategoria(){
        return this.categoria;
    }
    
    public void setCategoria(String categoria){
        
        if(CategoriaCarro.CategoriaValida(categoria))
        {
             this.categoria = CategoriaCarro.valueOf(categoria.toLowerCase());
        }else{
            System.out.println("Categoria de veiculo invalida");
        }    

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if(cor.length() > 0){
            this.cor = cor;
        }else{
            System.out.println("Digite uma cor valida");
        }
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.length() > 0){
            this.modelo = modelo;
        }else{
            System.out.println("Digite um modelo valido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 1930){
            this.ano = ano;
        }else{
            System.out.println("Digite um ano valido");
        }
    }

    @Override
    public void setEixos(int eixos) {
        
        if (eixos != 2)
        {
            System.out.println("Quantidade de eixos invalido");
        }else{
            super.setEixos(eixos);
        }
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 23 * hash + Objects.hashCode(this.categoria);
        hash = 23 * hash + Objects.hashCode(this.cor);
        hash = 23 * hash + Objects.hashCode(this.modelo);
        hash = 23 * hash + this.ano;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "tipo=" + categoria.name() + ", cor=" + cor + ", modelo=" + modelo + ", ano=" + ano + '}';
    }
    
}
