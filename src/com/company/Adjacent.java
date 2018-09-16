package com.company;

public class Adjacent {

    public void Seters (DoubleLinkedList<DoubleLinkedList<Integer>> malla){
        for (int i = 0; i < malla.getSize(); i++) {

                DoubleLinkedList<Integer> line = malla.getNode(i).getData();

                for (int j = 0; j < line.getSize(); j++) {
                    Node<Integer> nodeset = line.getNode(j);
                    if (i==0 && j==0) {
                        nodeset.setLeft(null);
                        nodeset.setUp(null);
                        nodeset.setDown(malla.getNode(i + 1).getData().getNode(j));
                        nodeset.setRight(line.getNode(j + 1));
                    }
                    else if (j!=0 && j!=5 && i==0){
                        nodeset.setLeft(line.getNode(j-1));
                        nodeset.setUp(null);
                        nodeset.setDown(malla.getNode(i + 1).getData().getNode(j));
                        nodeset.setRight(line.getNode(j + 1));
                    }
                    else if (i==0 && j==5){
                        nodeset.setLeft(line.getNode(j-1));
                        nodeset.setUp(null);
                        nodeset.setDown(malla.getNode(i + 1).getData().getNode(j));
                        nodeset.setRight(null);
                    }
                    else if (i!=0 && i!=5 && j==5){
                        nodeset.setLeft(line.getNode(j-1));
                        nodeset.setUp(malla.getNode(i - 1).getData().getNode(j));
                        nodeset.setDown(malla.getNode(i + 1).getData().getNode(j));
                        nodeset.setRight(null);
                    }
                    else if (i==5 && j==5){
                        nodeset.setLeft(line.getNode(j-1));
                        nodeset.setUp(malla.getNode(i - 1).getData().getNode(j));
                        nodeset.setDown(null);
                        nodeset.setRight(null);
                    }
                    else if (i==5 && j!=0 && j!=5){
                        nodeset.setLeft(line.getNode(j-1));
                        nodeset.setUp(malla.getNode(i - 1).getData().getNode(j));
                        nodeset.setDown(null);
                        nodeset.setRight(line.getNode(j + 1));
                    }
                    else if (i==5 && j==0){
                        nodeset.setLeft(null);
                        nodeset.setUp(malla.getNode(i - 1).getData().getNode(j));
                        nodeset.setDown(null);
                        nodeset.setRight(line.getNode(j + 1));
                    }
                    else if (i!=0 && i!=5 && j==0){
                        nodeset.setLeft(null);
                        nodeset.setUp(malla.getNode(i - 1).getData().getNode(j));
                        nodeset.setDown(malla.getNode(i + 1).getData().getNode(j));
                        nodeset.setRight(line.getNode(j + 1));
                    }
                    }
                }
            }

    }