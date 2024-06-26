
package pacote_veiculo;

import java.util.Objects;
import pacote_debitos.Debitos;
import pacote_pessoa.Pessoa;

public abstract class Veiculo {
    
    private String placa;
    private String chassi;
    private String renavam;    
    private Debitos debitos;
    private Pessoa dono;
    private int eixos;
    private double preco;
    private static int qtd_veiculos = 0;

    public Veiculo(String placa, String chassi, String renavam, Debitos debitos, Pessoa dono, int eixos, double preco) {
        this.setPlaca(placa);
        this.setChassi(chassi);
        this.setRenavam(renavam);
        this.setDebitos(debitos);
        this.setEixos(eixos);
        this.setPreco(preco);
        this.setDono(dono);
        Veiculo.setQtdVeiculos();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        
        if(placa.length() == 7)
        {
            this.placa = placa;
        }else{
            System.out.println("Erro! Digite uma placa valida!");
        }
        
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        
        if(chassi.length() == 17)
        {
            this.chassi = chassi;
        }else{
            System.out.println("Identificacao de chassi invalida!");
        }
        
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        
        if(renavam.length() == 11)
        {
            this.renavam = renavam;
        }else{
            System.out.println("Numero de renavam invalido!");
        }
        
    }

    public Debitos getDebitos() {
        return debitos;
    }

    public void setDebitos(Debitos debitos) {
        
        if(debitos instanceof Debitos)
        {
            this.debitos = debitos;
        }else{
            System.out.println("Objeto "+debitos+" nao e valido como um debido valido!");
        }
        
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        
        if(dono instanceof Pessoa)
        {
            this.dono = dono;
        }else{
            System.out.println("Objeto "+dono+" nao e valido como um dono de um veiculo");
        }
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Digite um preco valido!");
        }        
    }
    
    public static int getQtdVeiculos(){
        return Veiculo.qtd_veiculos;
    }
    
    public static void setQtdVeiculos(){
        Veiculo.qtd_veiculos++;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.placa);
        hash = 97 * hash + Objects.hashCode(this.chassi);
        hash = 97 * hash + Objects.hashCode(this.renavam);
        hash = 97 * hash + Objects.hashCode(this.debitos);
        hash = 97 * hash + Objects.hashCode(this.dono);
        hash = 97 * hash + this.eixos;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
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
        final Veiculo other = (Veiculo) obj;
        if (this.eixos != other.eixos) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.chassi, other.chassi)) {
            return false;
        }
        if (!Objects.equals(this.renavam, other.renavam)) {
            return false;
        }
        if (!Objects.equals(this.debitos, other.debitos)) {
            return false;
        }
        return Objects.equals(this.dono, other.dono);
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", chassi=" + chassi + ", renavam=" + renavam + ", debitos=" + debitos + ", dono=" + dono + ", eixos=" + eixos + ", preco=" + preco + '}';
    }
    
    
}
