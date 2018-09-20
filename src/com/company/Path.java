package com.company;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

public class Path {
    public Node current;
    public SimpleLinkedList PathList;
    public DoubleLinkedList<DoubleLinkedList<Integer>> malla;
    public SimpleLinkedListLines copia;


    public Path(DoubleLinkedList<DoubleLinkedList<Integer>> malla){
        this.malla = malla;
        }

        public boolean CheckPath(Node Startpoint){
            return true;
        }


    }

