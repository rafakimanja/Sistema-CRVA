
package pacote_veiculo.Enuns;

import pacote_veiculo.Enuns.CategoriaCarro;


public enum CategoriaMoto {
    
    street, custom, trail, 
    naked, scooter, sport, touring;
    
    public static boolean CategoriaValida(String categoria) {
        try {
            CategoriaCarro.valueOf(categoria.toLowerCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
