package pe.com.fiztec;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArticlesRepo extends PagingAndSortingRepository<Article, Integer> {


}