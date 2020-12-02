package com.jr.JavaSyntax.level8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FromHFJ {
    ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args) {
        FromHFJ hfj = new FromHFJ();
        hfj.go();
    }

    public void go() {
        try {
            getSongs();
            System.out.println(songList);
            Collections.sort(songList);
            System.out.println(songList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getSongs() throws IOException {
        try {
            File file = new File("SongList.txt");
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bf.readLine()) != null) {
                addSong(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }

    public void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
