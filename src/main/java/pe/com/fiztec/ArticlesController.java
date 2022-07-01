package pe.com.fiztec;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.fiztec.domain.Article;

@RestController
@RequestMapping("/api/v1")
public class ArticlesController {

    private ArticlesService service;

    public ArticlesController(ArticlesService service) {
        this.service = service;
    }
    @GetMapping(value = "article",produces = "application/json")
    public ResponseEntity<Iterable<Article>> getAllArticles(){

        return ResponseEntity.ok(service.getAllArticle());
    }
    @GetMapping( value = "article/{amount}/size", produces = "application/json")
    public ResponseEntity<Iterable<Article>> getMultipleArticles(
            @PathVariable(name = "amount", required = true) int amount) {
        return ResponseEntity.ok(service.getMultipleArticles(amount));
    }


    @GetMapping(value = "article/{id}", produces = "application/json")
    public ResponseEntity<Article> getSingleArticle(@PathVariable(name = "id", required = true) int id) {
        return ResponseEntity.ok(service.getArticle(id));
    }


    @PostMapping(value = "article",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Article> createNewArticle(@RequestBody Article article) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createArticle(article));
    }
    @PostMapping(value = "article/bulk",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Iterable<Article>> createNewArticleAll(@RequestBody Iterable<Article> articles){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createAll(articles));
    }

    @DeleteMapping("/article/{id}")
    public ResponseEntity<HttpStatus> deleteArticle(@PathVariable("id") int id) {
        try {
            service.deletArticle(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ExceptionHandler(ClientException.class)
    public ResponseEntity<String> handleClientExceptions(ClientException e) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(ClientException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}