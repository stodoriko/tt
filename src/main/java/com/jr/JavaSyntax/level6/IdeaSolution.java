package com.jr.JavaSyntax.level6;

public class IdeaSolution {

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea Idea) {
        System.out.println(Idea.getDescription());
    }

    public static class Idea {

        public String getDescription() {
            return "Hello World!";
        }
    }
}
