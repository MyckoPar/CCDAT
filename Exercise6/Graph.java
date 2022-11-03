public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 13;
        int noEdges = 13;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "PAR";
        myGraph.edge[0].dest = "ADIA";

        // Edge 2
        myGraph.edge[1].src = "PAR";
        myGraph.edge[1].dest = "DU";

        // Edge 3
        myGraph.edge[2].src = "PAR";
        myGraph.edge[2].dest = "REFARIAL";

        // Edge 4
        myGraph.edge[3].src = "PAR";
        myGraph.edge[3].dest = "BUSTARDE";

        // Edge 5
        myGraph.edge[4].src = "PAR";
        myGraph.edge[4].dest = "CAYETANO";

        // Edge 6
        myGraph.edge[5].src = "PAR";
        myGraph.edge[5].dest = "VILLANUEVA";

        // Edge 7
        myGraph.edge[6].src = "PAR";
        myGraph.edge[6].dest = "PHOA";

        // Edge 8
        myGraph.edge[7].src = "PAR";
        myGraph.edge[7].dest = "IGNACIO";

        // Edge 9
        myGraph.edge[8].src = "PAR";
        myGraph.edge[8].dest = "ORTEGA";

        // Edge 10
        myGraph.edge[9].src = "PAR";
        myGraph.edge[9].dest = "SABONDO";

        // Edge 11
        myGraph.edge[10].src = "ADIA";
        myGraph.edge[10].dest = "DU";
        // Edge 12
        myGraph.edge[11].src = "DU";
        myGraph.edge[11].dest = "REFARIAL";

        // Edge 13
        myGraph.edge[12].src = "ADIA";
        myGraph.edge[12].dest = "BORIS";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
