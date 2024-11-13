package com.project.URLShortener.controller;

import com.project.URLShortener.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class UrlShortenerController {


    private final UrlService urlService;

    // Show the home page with the form
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Handle form submission
    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam("longUrl") String longUrl, Model model) {
        String shortUrl = urlService.generateShortUrl(longUrl);
        model.addAttribute("shortUrl", shortUrl);
        return "index";
    }

    // Add redirection logic for short URLs
    @GetMapping("/{shortUrl}")
    public String redirectToLongUrl(@PathVariable String shortUrl) {
        String longUrl = urlService.getLongUrl("http://localhost:8080/" + shortUrl);
        if (longUrl != null) {
            return "redirect:" + longUrl;
        }
        return "error"; // Optional: add an error page if the URL cannot be found
    }

    // Handle the /test endpoint
    @GetMapping("/test")
    public String getDemo() {
        return "test"; // Ensure "test.html" is present in your templates folder
    }
}
