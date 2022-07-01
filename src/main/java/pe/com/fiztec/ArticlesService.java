package pe.com.fiztec;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.com.fiztec.domain.Article;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ArticlesService {

    private ArticlesRepo repo;

    public ArticlesService(ArticlesRepo repo) {
        this.repo = repo;
    }

    public Iterable<Article> getAllArticle(){
        return repo.findAll();
    }
    public Iterable<Article> getMultipleArticles(int amount) {
        if (amount > 0) {
            return repo.findAll(PageRequest.of(0, amount)).getContent();
        } else {
            throw new ClientException("Article Not Found");
        }
    }

    public Article getArticle() {
        return null;
    }

    public Iterable<Article> createAll(Iterable<Article> articles){
        return repo.saveAll(articles);
    }
    public Article createArticle(Article article) {
        if (article.getTitle().isEmpty()) {
            throw new ClientException("Input not valid (no title)");
        }
        return repo.save(article);
    }

    public Article getArticle(int id) {
        Optional<Article> optionalArticle = repo.findById(id);
        if (optionalArticle.isPresent()) {
            throw new NotFoundException("Article Not Found");
        } else {
            return optionalArticle.get();
        }
    }

    public  void deletArticle(int id){
        repo.deleteById(id);
    }

}
