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

