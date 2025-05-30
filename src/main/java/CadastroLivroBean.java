import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class CadastroLivroBean {
	private LivroModel livro = new LivroModel();
	private List<LivroModel> listaLivros = new ArrayList<LivroModel>();
	private int id = 0;
	
    public void salvar() {
    	livro.setIdLivro(++id);
        listaLivros.add(livro);
        livro = new LivroModel();
        listar();
    }
    
    public void listar() {
    	for (LivroModel livroModel : listaLivros) {
        	System.out.println("Título: " + livroModel.getTitulo() + " Autor: " + livroModel.getAutor() + " Gênero: " + livroModel.getGenero() + " Ano: " + livroModel.getAno() + " Descrição: " + livroModel.getDescricao());
		}
    }

    // Getters e Setters
	public LivroModel getLivro() {
		return livro;
	}

	public void setLivro(LivroModel livro) {
		this.livro = livro;
	}

	public List<LivroModel> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<LivroModel> listaLivros) {
		this.listaLivros = listaLivros;
	}
}
