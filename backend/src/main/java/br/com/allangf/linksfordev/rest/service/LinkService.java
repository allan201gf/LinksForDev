package br.com.allangf.linksfordev.rest.service;

import br.com.allangf.linksfordev.domain.entity.Link;
import br.com.allangf.linksfordev.domain.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinkService {

    @Autowired
    private LinkRepository linkRepository;

    public List<Link> returnAllLink() {
        return linkRepository.findAll();
    }

    public void createLink(Link link) {
        Link newLink = new Link();
        newLink.setDescription(link.getDescription());
        newLink.setImg(link.getImg());
        newLink.setTitle(link.getTitle());

        linkRepository.save(newLink);
    }

    public Link returnLinkById(int id) {
        Optional<Link> link = linkRepository.findById(id);

        if (!link.isPresent()) {
            return null;
        }
        return link.get();
    }
}
