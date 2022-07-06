package br.com.loja.testes;

import br.com.loja.dao.CategoriaDao;
import br.com.loja.dao.ProdutoDao;
import br.com.loja.modelo.Categoria;
import br.com.loja.modelo.Produto;
import br.com.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProdutos {

    public static void main(String[] args) {

        // cadastrarProduto();

        pesquisarProduto();
    }

    private static void cadastrarProduto() {
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Samsung", "Top10", new BigDecimal("800"), celulares);

        em.getTransaction().begin();
        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }

    private static void pesquisarProduto() {
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDAO = new ProdutoDao(em);

        // Buscando Produto por ID
        System.out.println("=============================================");
        Produto p = produtoDAO.buscarPorId(1l);
        System.out.println("Produto-nome: " + p.getNome());

        // Buscando Todos
        System.out.println("=============================================");
        List<Produto> todos = produtoDAO.buscarTodos();
        todos.forEach(pr -> System.out.println("Produto: " + pr.getNome()));

        // Buscando com Filtro
        System.out.println("=============================================");
        List<Produto> especifico = produtoDAO.buscarPorNome("LG");
        especifico.forEach(pr2 -> System.out.println("Filtrando por nome: " + pr2.getNome()));

        // Buscando por Categoria
        System.out.println("=============================================");
        List<Produto> cat = produtoDAO.buscarPorNomeDaCategoria("CELULARES");
        cat.forEach(pr3 -> System.out.println("Filtrando por categoria: " + pr3.getNome()));

        // Bucando Preço de Produto
        System.out.println("=============================================");
        BigDecimal precoDoProduto = produtoDAO.buscarPrecoDoProdutoComNome("LG");
        System.out.println("Preço do Produto Selecionado: " + precoDoProduto);
    }
}
