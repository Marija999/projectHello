package com.example.helloProject.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LangController {

    @Autowired
    private LangService langService;

    @RequestMapping (value = "/languages", method = RequestMethod.GET)
    public List<Language> getAllUsers(){
        return langService.getAllLanguages();
    }
    @RequestMapping (value = "/languages", method = RequestMethod.POST)
    public void addLang(@RequestBody Language language){
        langService.addLang(language);
    }
    @RequestMapping (value = "/languages/{id}",method = RequestMethod.PUT)
    public void updateLang(@RequestBody Language language, @PathVariable String id){
        langService.updateLang(id,language);
    }
    @RequestMapping(value = "/languages/{id}",method = RequestMethod.DELETE)
    public void deleteLang(@PathVariable String id){
        langService.deleteLang(id);
    }

}
