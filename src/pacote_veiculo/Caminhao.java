
package pacote_veiculo;

import java.util.Objects;
import pacote_debitos.Debitos;
import pacote_pessoa.Pessoa;
import pacote_veiculo.Enuns.CategoriaCaminhao;


public class Caminhao extends Veiculo{
    
    private CategoriaCaminhao categoria;
    private String cor;
    private String modelo;
    private int ano;

    public Caminhao(String placa, String chassi, String renavam, Debitos debitos, Pessoa dono, int eixos, double preco, String categoria, String cor, String modelo, int ano) {
        super(placa, chassi, renavam, debitos, dono, eixos, preco);
        this.setAno(ano);
        this.setCategoria(categoria);
        this.setCor(cor);
        this.setModelo(modelo);
    }

    public CategoriaCaminhao getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(CategoriaCaminhao.CategoriaValida(categoria))
        {
             this.categoria = CategoriaCaminhao.valueOf(categoria.toLowerCase());
        }else{
            System.out.println("Categoria de caminhao invalido");
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
    public int hashCode() {
        
        int hash = super.hashCode();
        hash = 43 * hash + Objects.hashCode(this.categoria);
        hash = 43 * hash + Objects.hashCode(this.cor);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + this.ano;
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
        final Caminhao other = (Caminhao) obj;
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return this.categoria == other.categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Caminhao{" + "categoria=" + categoria + ", cor=" + cor + ", modelo=" + modelo + ", ano=" + ano + '}';
    }
    
}
