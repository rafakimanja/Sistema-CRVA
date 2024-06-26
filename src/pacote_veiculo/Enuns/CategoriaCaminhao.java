/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pacote_veiculo.Enuns;

/**
 *
 * @author raffa
 */
public enum CategoriaCaminhao {
    
    vuc, toco, truck, carreta, bitrem, treminhao;
    
    public static boolean CategoriaValida(String categoria) {
        try {
            CategoriaCarro.valueOf(categoria.toLowerCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
    
}
