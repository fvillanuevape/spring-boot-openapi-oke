package pe.com.fiztec.domain;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Article")
public class Article {

    @Id
    @Column(name = "articleId")
    @GeneratedValue(generator = "articles_generator")
    @SequenceGenerator(name = "articles_generator", initialValue = 10)
    private int id;

    @Column(name = "articleTitle")
    private String title;

    @Column(name = "articleUrl")
    private String url;

    @Column(name = "articleAuthor")
    private String author;

    @Column(name = "creationDate")
    private String creationDate;

    @Column(name = "description")
    private String description;

    public Article() {
    }

    public Article(@NotNull @NotBlank int id, String title, String url, String author, String creationDate, String description) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.author = author;
        this.creationDate = creationDate;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    @JsonGetter("id") // Returning Stringified id for API compatibility with MicroProfile service.
    public String getStringId() {
        return Integer.toString(id);
    }

    @JsonIgnore // Id is a generated field, this prevents jackson from setting an user defined
    // value
    private void setId(int id) {
        // NO-OP
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", author='" + author + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}