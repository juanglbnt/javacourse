package com.juan.topic3functionalprogramming.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationsApp {

    public static void main(String[] args) {
        Language[] arrayLanguages = ProgrammingLanguage.class.getAnnotationsByType(Language.class);
        System.out.println("there is " + arrayLanguages.length + " annotations");

        Languages lang = ProgrammingLanguage.class.getAnnotation(Languages.class);
        for(Language language:lang.value()){
            System.out.println(language.value());
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Languages {
        Language[] value() default {};
    }

    @Repeatable(value = Languages.class)
    public @interface Language {
        String value();
    }

    @Language("java")
    @Language("c")
    public interface ProgrammingLanguage{

    }
}
