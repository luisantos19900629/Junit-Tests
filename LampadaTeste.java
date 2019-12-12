
package lampada;

/**
 *
 * @author Luis Santos
 */
public class LampadaTeste {

    public LampadaTeste() {

    }

    public boolean utilizarLampada(int ligada) {

        boolean estado = false;

        if (ligada == 1) {

            estado = true;
        } else {

            estado = false;
        }
        return estado;
    }

    public double precoLampada(int Qtd, double preco) {

        if (preco < 0) {

            System.out.println("erro no preco");

        } else {

            preco = Qtd * preco;
        }
        return preco;
    }

}
