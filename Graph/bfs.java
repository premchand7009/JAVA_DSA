package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class edge {
    int u;
    int v;
    edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}
public class bfs {
    public static void breadth_first_search(ArrayList<edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        int s = 0;
        q.add(s);
        while (!q.isEmpty()) {
            int p = q.remove();
            if (!vis[p]) {
                System.out.println(p+" ");
                vis[p] = true;
                for (int i = 0; i < graph[p].size(); i++) {
                    edge e = graph[p].get(i);
                    q.add(e.v);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> l[] = new ArrayList[v];
        for (int i = 0; i < l.length; i++) {
            l[i] = new ArrayList<>();
        }
        l[0].add(new edge(0, 1));
        l[0].add(new edge(0, 2));
        l[1].add(new edge(1, 3));
        l[3].add(new edge(3, 4));
        breadth_first_search(l);
    }
}
