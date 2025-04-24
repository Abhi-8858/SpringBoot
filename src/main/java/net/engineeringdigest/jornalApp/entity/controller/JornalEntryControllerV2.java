package net.engineeringdigest.jornalApp.entity.controller;

import net.engineeringdigest.jornalApp.entity.JornalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jornal")

public class JornalEntryControllerV2 {
    @GetMapping
    public List<JornalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JornalEntry myEntry){
        return true;

    }
    @GetMapping("id/{myId")
    public  JornalEntry getJornalEntryById(@PathVariable long myId){
        return null;
    }

}
