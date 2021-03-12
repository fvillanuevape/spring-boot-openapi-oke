package pe.com.fiztec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pe.com.fiztec.domain.Article;

public interface ArticlesRepo extends JpaRepository<Article, Integer> {


}