package fr.uge.poo.amanet.items.q1;

import java.util.Set;
import java.util.stream.Collectors;

public sealed interface VideoItem permits BluRay, Dvd{
    default String displayLanguages(){
        return languages().stream().map(Enum::name).collect(Collectors.joining(", "));
    }
    Set<Language> languages();
}
