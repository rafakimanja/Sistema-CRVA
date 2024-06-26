package pacote_pessoa;

import java.util.Objects;


public class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private UF uf;
    private String email;
    private String telefone;
    
    public Pessoa(String nome, String cpf, String rg, String endereco, String uf, String email, String telefone){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setEndereco(endereco);
        this.setUf(uf);
        this.setEmail(email);
        this.setTelefone(telefone);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        if(nome.length() != 0){
            this.nome = nome;
        }else{
            System.out.println("Campo vazio!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        
        int cont = 0;
        
        for (int i = 0; i < cpf.length(); i++) 
        {    
            char posicao_cpf = cpf.charAt(i);
            
            if(Character.isDigit(posicao_cpf))
            {
                cont++;
            }
        }
        
        if(cont==11 && cpf.length()==15)
        {
            this.cpf = cpf;
        }
        else
        {
            System.out.println("CPF inválido!");
        }
        
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if(rg.length() != 0){
            this.rg = rg;
        }else{
            System.out.println("Campo vazio!");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.length() != 0)
        {
            this.endereco = endereco;
        }else{
            System.out.println("Campo vazio!");;
        }
    }
    
    public UF getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        
        boolean flag = false;
      
        for(UF value: UF.values()){
            if(value.name().equals(uf)){
                this.uf = value;
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("UF inválida!");
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        
        if(email.indexOf('@') != -1){
            this.email = email;
        }else{
            System.out.println("Email inválido!");
        } 
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        
        if(telefone.indexOf('0') == 0)
        {
            if(telefone.indexOf('9') == 4)
            {
                this.telefone = telefone;
            }
            else
            {
                System.out.println("Telefone inválido!");
            }
        }
        else if(telefone.indexOf('9') != -1)
        {
            if(telefone.indexOf('9') == 3)
            {
                this.telefone = telefone;
            }
            else
            {
                System.out.println("Telefone inválido!");
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.cpf);
        hash = 89 * hash + Objects.hashCode(this.rg);
        hash = 89 * hash + Objects.hashCode(this.endereco);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.telefone);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.telefone, other.telefone);
    }
    
    @Override
    public String toString(){
        return "Cliente {" + "\n"
                + "Nome="+this.getNome() + "\n"
                + "CPF="+this.getCpf() + "\n"
                + "RG="+this.getRg() + "\n"
                + "Endereço="+this.getEndereco() + "\n"
                + "UF="+this.getUf() + "\n"
                + "Email="+this.getEmail() + "\n"
                + "Telefone="+this.getTelefone() + "\n"
                + "}";
    }
}
