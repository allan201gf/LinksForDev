package br.com.allangf.linksfordev.rest.controller;

import br.com.allangf.linksfordev.domain.entity.Link;
import br.com.allangf.linksfordev.rest.service.LinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class LinkController {

    private LinkService linkService;

    @GetMapping
    public List<Link> returnAllLink() {
        return linkService.returnAllLink();
    }

    @PostMapping
    public void createLink(@RequestBody Link link) {
        linkService.createLink(link);
    }

    @GetMapping("/{id}")
    public Link returnLinkById(@PathVariable int id) {
        return linkService.returnLinkById(id);
    }
}
