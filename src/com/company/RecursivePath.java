package com.company;

public class RecursivePath {
    public Node current;
    public Node startpoint=current;
    public SimpleLinkedList PathList;
    public Node Startpoint;
    public void RecursivePath(){
        if (PosiblePaths()){
            if (current == startpoint) {
                PathWay();
            }
            else{// mover hacia adonde(?)
            }
        }
        }

     public boolean PosiblePaths(){
         if (current.getRight() != null || current.getLeft() != null || current.getUp() != null || current.getDown() != null ||
                 current.getDrd() != null || current.getDru() != null || current.getDld() != null || current.getDlu() != null){
             return true;
         }
         else{
             return false;
         }
     }


    public boolean PathWay(){
        if (current.getRight()!= null) {
            PathList.insert("R");
            current=current.getRight();
        }
        else if (current.getLeft()!= null) {
            PathList.insert("L");
            current=current.getLeft();
        }
        else if (current.getUp()!= null){
            PathList.insert("U");;
            current=current.getUp();
        }
        else if (current.getDown()!= null){
            PathList.insert("D");
            current=current.getDown();
        }
        else if (current.getDld()!= null){
            PathList.insert("DLD");
            current=current.getDld();
        }
        else if (current.getDlu()!= null){
            PathList.insert("DLU");
            current=current.getDlu();
        }
        else if (current.getDrd()!= null){
            PathList.insert("DRD");
            current=current.getDrd();
        }
        else if (current.getDru()!= null){
            PathList.insert("DRU");
            current=current.getDru();
        }
        return false;
    }
    }

