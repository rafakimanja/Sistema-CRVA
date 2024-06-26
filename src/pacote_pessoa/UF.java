/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pacote_pessoa;

/**
 *
 * @author raffa
 */
public enum UF {
    
    AC, AL, AP, AM, BA, CE, DF,
    ES, GO, MA, MT, MS, MG, PA,
    PB, PR, PE, PI, RJ, RN, RS,
    RO, RR, SC, SP, SE, TO;
    
    public String getDescricao(){
        
        switch(this){
            
            case AC: return "Acre";
            case AL: return "Alagoas";
            case AP: return "Amapá";
            case AM: return "Amazonas";
            case BA: return "Bahia";
            case CE: return "Ceará";
            case DF: return "Destrito Federal";
            case ES: return "Espírito Santo";
            case GO: return "Goiás";
            case MA: return "Maranhão";
            case MT: return "Mato Grosso";
            case MS: return "Mato Grosso do Sul";
            case MG: return "Minas Gerais";
            case PA: return "Pará";
            case PB: return "Paraíba";
            case PR: return "Paraná";
            case PE: return "Pernambuco";
            case PI: return "Piauí";
            case RJ: return "Rio de Janeiro";
            case RN: return "Rio Grande do Norte";
            case RS: return "Rio Grande do Sul";
            case RO: return "Rondônia";
            case RR: return "Roraima";
            case SC: return "Santa Catarina";
            case SP: return "São Paulo";
            case SE: return "Sergipe";
            case TO: return "Tocantins";
            default: return "";
        }
    }
}
