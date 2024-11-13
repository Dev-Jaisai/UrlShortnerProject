package com.project.URLShortener.repo;
import com.project.URLShortener.entity.UrlEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends CrudRepository<UrlEntity, Long> {
    UrlEntity findByShortUrl(String shortUrl);
}
