package com.project.URLShortener.service;

import com.project.URLShortener.entity.UrlEntity;
import com.project.URLShortener.repo.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class UrlService {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    @Autowired
    private UrlRepository urlRepository;

    public String generateShortUrl(String longUrl) {
        // Generate a random 6-character code for the short URL
        StringBuilder uniqueCode = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            uniqueCode.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        String shortUrl = "http://localhost:8080/" + uniqueCode.toString();

        // Save the long URL and short URL mapping in the database
        UrlEntity urlEntity = new UrlEntity();
        urlEntity.setLongUrl(longUrl);
        urlEntity.setShortUrl(shortUrl);
        urlRepository.save(urlEntity);

        return shortUrl;
    }

    public String getLongUrl(String shortUrl) {
        UrlEntity urlEntity = urlRepository.findByShortUrl(shortUrl);
        return urlEntity != null ? urlEntity.getLongUrl() : null;
    }
}
