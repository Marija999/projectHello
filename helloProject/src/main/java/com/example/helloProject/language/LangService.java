package com.example.helloProject.language;

import com.example.helloProject.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LangService {

    @Autowired
    private LangRepository langRepository;

    public List<Language> getAllLanguages() {
        List<Language> languages = new ArrayList<>();

        langRepository.findAll().forEach(languages::add);

        return languages;
    }
    public Optional<Language> getLang(String id) {
        return langRepository.findById(id);
    }


    public void addLang(Language language) {
        langRepository.save(language);
    }


    public void updateLang(String id, Language language) {
        langRepository.save(language);
    }


    public void deleteLang(String id) {
        langRepository.deleteById(id);
    }
}
