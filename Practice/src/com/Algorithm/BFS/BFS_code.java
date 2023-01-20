package com.Algorithm.BFS;

import java.util.ArrayList;
import java.util.HashMap;

public class BFS_code {

    public ArrayList<String> bfsFunc(HashMap<String , ArrayList<String>>graph , String startNode){
        ArrayList<String> visited =new ArrayList<String>();
        ArrayList<String> needVisted =new ArrayList<String>();

        while (needVisted.size()>0) {
            String node = needVisted.remove(0);

            if(!visited.contains(node)){
                visited.add(node);
//                needVisted.add(graph.get(node));

            }
        }
        return visited;
    }
}
