<<<<<<< HEAD
package com.company;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main{


    public static void main(String[] args){
        Game gametrial = new Game();
        Path trial = new Path(gametrial.Malla);
        trial.CoordsToNode("{\"y1\":81,\"x1\":81,\"y2\":162,\"x2\":162}");


    }

    }

=======
package com.company;

public class Main{

    public static void fillup(DoubleLinkedList list){
        for (int i = 0; i < 6; i++) {

            list.append(new Node<Integer>(null));
        }
        return;
    }

    public static void display(DoubleLinkedList<DoubleLinkedList<Integer>> malla){

        for (int i = 0; i < malla.getSize(); i++) {

            DoubleLinkedList<Integer> line = malla.getNode(i).getData();

            for (int j = 0; j < line.getSize(); j++) {

                System.out.print("Node x: "); System.out.print(j);

                System.out.print(" y: "); System.out.println(i);

                System.out.print("Right: "); System.out.println(line.getNode(j).getRight());

                System.out.print("Left: "); System.out.println(line.getNode(j).getLeft());

                System.out.print("Up: "); System.out.println(line.getNode(j).getUp());

                System.out.print("Down: "); System.out.println(line.getNode(j).getDown());

                System.out.print("Drd: "); System.out.println(line.getNode(j).getDrd());

                System.out.print("Dru: "); System.out.println(line.getNode(j).getDru());

                System.out.print("Dld: "); System.out.println(line.getNode(j).getDld());

                System.out.print("Dlu: "); System.out.println(line.getNode(j).getDlu());

                System.out.println("-------------------------------------------------------------------");


            }

        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> L1 = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> L2 = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> L3 = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> L4 = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> L5 = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> L6 = new DoubleLinkedList<Integer>();
        DoubleLinkedList<DoubleLinkedList<Integer>> Malla = new DoubleLinkedList<>();
        Malla.append(L1);
        Malla.append(L2);
        Malla.append(L3);
        Malla.append(L4);

        fillup(L1);
        fillup(L2);
        fillup(L3);
        fillup(L4);

        Node<Integer> Nodo1 = Malla.getNode(0).getData().getNode(0);
        Nodo1.setData(1);

        display(Malla);

    }
}
>>>>>>> 62b85a8cec4d91ebe63beef7dce4b9e2c512b6d9
