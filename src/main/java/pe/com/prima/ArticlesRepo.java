package pe.com.prima;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArticlesRepo extends PagingAndSortingRepository<Article, Integer> {


}