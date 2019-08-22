package com.tt.Pacgages;

// нужно для того, чтобы стали видимы классы
import com.tt.Pacgages.Forest.Squirell;
import com.tt.Pacgages.Forest.Tree;
// import com.tt.Pacgages.*; или так. Значит, что мы хотим импортировать все классы из пакета

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Дуб", 100);
        Tree tree2 = new Tree("Берёза", 10);
        Tree tree3 = new Tree(55);

        Squirell squirell = new Squirell();
    }
}
