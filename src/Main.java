//Davi Calheiros Quintella Souto 2267845

public class Main
{
    public static void main(String[] args)
    {
        Leitura leitura = new Leitura();

        Saxofone sax = new Saxofone();
        Flauta flauta = new Flauta();
        Guitarra guitarra = new Guitarra();
        Violao violao = new Violao();
        Tambor tambor = new Tambor();
        Chimbal chimbal = new Chimbal();

        int opcaoMenu=0;

        do
        {
            //leitura.clearConsole();

            System.out.println
                    ("""
                    ==========Menu==========
                    1-Consultar estoque
                    2-Cadastrar Guitarra1
                    3-Sair
                    ========================
                """);

            opcaoMenu = Integer.parseInt(leitura.entDados("Insira a opcao desejada..:"));

            switch(opcaoMenu)
            {
                case 1:
                    System.out.println(sax.getModeloSaxsofone());
                    System.out.println(flauta.getModeloFlauta());
                    System.out.println(guitarra.getModeloGuitarra());
                    System.out.println(violao.getModeloViolao());
                    System.out.println(tambor.getModeloTambor());
                    System.out.println(chimbal.getModeloChimbal());

                case 2:
                    double preco = Double.parseDouble(leitura.entDados("\nInsira o preco do produto"));
                    int quantidade = Integer.parseInt(leitura.entDados("\nInsira a quantidade do produto"));
                    int codProduto = Integer.parseInt(leitura.entDados("\nInsira o codigo do produto"));
                    boolean promocao = false;
                    String marca = leitura.entDados("Insira a marca do produto");
                    String modeloGuitarra = leitura.entDados("Insira o modelo de guitarra");
                    Guitarra guitarraCustom = new Guitarra(preco,quantidade,codProduto,promocao,marca,modeloGuitarra);

                    System.out.println
                            ("""
                                Cod Produto    ..: %d
                                Marca          ..: %s
                                Modelo Guitarra..: %s
                                Preco          ..: R$ %.2f
                                Quantidade     ..: %d
                                
                            """.formatted(guitarraCustom.getCodProduto(),guitarraCustom.getMarca(),guitarraCustom.getModeloGuitarra(),guitarraCustom.getPreco(),guitarraCustom.getQuantidade()));
                default:

            }
        }
        while (opcaoMenu!=3);

    }
}
