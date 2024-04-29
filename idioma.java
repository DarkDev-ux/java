package livros;

import javax.swing.*;

public class idioma extends livros{

    public idioma(String titulo) {
        super(titulo);
    }

    public void salvar(){
        JOptionPane.showMessageDialog(null,"Idioma salvo com sucesso");
    }

    @Override
    public void pesquisar() {
        JOptionPane.showMessageDialog(null,"Idioma pesquisado com sucesso");
    }

    @Override
    public void alterar() {
        JOptionPane.showMessageDialog(null,"Idioma alterado com sucesso");
    }

    @Override
    public void excluir() {
        JOptionPane.showMessageDialog(null,"Idioma excluido com sucesso");
    }
}
