package Graph;

import java.util.ArrayList;

class edge {
    int u;
    int v;
    edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}

public class dfs_using_recursion {
    public static void dfs(ArrayList<edge> graph[], boolean vis[], int curr) {
        System.out.println(curr);
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if(!vis[e.v]) {
                dfs(graph, vis, e.v);
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
        l[3].add(new edge(3, 0));
        boolean vis[] = new boolean[l.length];
        dfs(l, vis, 0);
    }
}
