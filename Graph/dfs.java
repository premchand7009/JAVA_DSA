package Graph;

import java.util.ArrayList;
import java.util.Stack;

class edge {
    int u;
    int v;
    edge(int u, int v) {
        this.u = u;
        this.v = v;
    }
}

public class dfs {
    public static void depth_first_search(ArrayList<edge> graph[]) {
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[graph.length];
        int s = 0;
        vis[s] = true;
        stack.push(s);
        while (!stack.isEmpty()) {
            int p = stack.pop();
            System.out.println(p);
            for (int i = graph[p].size() - 1; i >= 0; i--) {
                edge e = graph[p].get(i);
                if (!vis[e.v]) {
                    stack.push(e.v);
                    vis[e.v] = true; 
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
        l[3].add(new edge(3, 0));
        depth_first_search(l);
    }
}
