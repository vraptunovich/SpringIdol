package com.springinaction.springidol.config;

import com.springinaction.springidol.performers.Instrumentalist;
import com.springinaction.springidol.performers.Performer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
// Здесь находятся методы, определяющие компоненты

   /* @Bean
    public Performer duke() {
        return new Juggler();
    }*/

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

 /*   @Bean
    private Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }
*/

}