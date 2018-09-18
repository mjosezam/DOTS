package com.company;

public class Path {
    public Node current;
    public SimpleLinkedList PathList;
    public DoubleLinkedList<DoubleLinkedList> malla;
    public SimpleLinkedListLines copia;


    public void Path(SimpleLinkedListLines original, DoubleLinkedList malla){
        this.malla = malla;
        this.copia = copia;
        }

     public boolean CoordsToNode(int x1, int y1, int x2, int y2){
        int StartNode = (x1/81)-1;
        int FinishNode = (x2/81)-1;
        int StartList = (y1/81)-1;
        int FinishList = (y2/81)-1;
        Node Node1 = malla.getNode(StartList).getData().getNode(StartNode);
        Node Node2 = malla.getNode(FinishList).getData().getNode(FinishNode);
        if (Node2==Node1.getRight() || Node2==Node1.getDown() || Node2==Node1.getLeft() || Node2==Node1.getUp()){
            return true;
        }
        else if (Node2==Node1.getDrd() || Node2==Node1.getDld() || Node2==Node1.getDlu() || Node2==Node1.getDru()){
            return true;
        }
        else{
            return false;
        }
     }

     public void ClosedFigure(int x1, int y1){
         int StartNode = (x1/81)-1;
         int StartList = (y1/81)-1;
         Node StartPointNode = malla.getNode(StartList).getData().getNode(StartNode);
         for (int i = 0; i < StartPointNode.getLineas().getSize(); i++) {
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



    }

