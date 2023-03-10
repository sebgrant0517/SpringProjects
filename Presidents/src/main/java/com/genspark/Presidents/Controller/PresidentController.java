package com.genspark.Presidents.Controller;

import com.genspark.Presidents.Entity.President;
import com.genspark.Presidents.Service.PresidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PresidentController {

    @Autowired
    private PresidentService presService;

    @GetMapping("/")
    public String home(){
        return "<HTML><HEAD><H1>Welcome to my list of Favorite Presidents</H1></HEAD></HTML>";
    }

    @GetMapping("/presidents")
    public List<President> getPresidents(){
        return this.presService.getPresidents();
    }

    @GetMapping("/presidents/{presID}")
    public President getPresident(@PathVariable String presID){
        return this.presService.getPresident(Integer.parseInt(presID));
    }

    @PostMapping("/presidents")
    public President addPresident(@RequestBody President pres){
        return this.presService.addPresident(pres);
    }

    @PutMapping("/presidents")
    public President updatePresident(@RequestBody President pres){
        return this.presService.updatePresident(pres);
    }

    @DeleteMapping("/presidents/{presID}")
    public String deletePresident(@PathVariable String presID){
        return this.presService.deletePresident(Integer.parseInt(presID));
    }
}
