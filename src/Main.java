
import pacote_debitos.Debitos;
import pacote_pessoa.Pessoa;
import pacote_veiculo.Moto;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Rafael", "111.111.111-22", "123456789", "Avenida Rua", "RS", "negrao@gmail.com", "51 0011-2233");
        Debitos d1 = new Debitos();
        Moto m1 = new Moto("ABC1234", "ABC123DEF456HIJ78", "12345678910", d1, p1, 2, 5000, 2002, "Vermelha", "Biz 1.0", "street");
        
        System.out.println(p1);
        System.out.println(m1);
    }
}
