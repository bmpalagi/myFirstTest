
//write a program that reads text from a file and breaks in up into individual words. Insert the words into a tree set. At the end of the input file, print all words, followed by
//the size of the resulting set. This program determines how many unique words a text file has.

import java.util.*;
import java.io.*;

public class treeSetAllWords
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        TreeSet<String> words = new TreeSet<>();
        Scanner in = new Scanner(new File("speech.txt"));
        
        in.useDelimiter("[^a-zA-z]");
        while(in.hasNext())
        {
            words.add(in.next().toLowerCase());
        }
        
        System.out.println(words);
        System.out.println(words.size());
        
    }
    }

