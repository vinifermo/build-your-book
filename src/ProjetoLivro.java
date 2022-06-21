public abstract class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[1] = new Pessoa("Leo Arruda", 23, "Masculino");
        l[0] = new Livro("Como Programar POO", "Vinicius Fermo", 100, 0, false, p[1]);
        System.out.println(l[0].detalhes());

    }


}
