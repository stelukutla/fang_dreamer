//Given a directed graph, design an algorithm to find out whether there is a route between two nodes.



enum State = {Unvisited, Visting, Visited}

boolean search(Graph g, Node start, Node end){
 if(start == end) return true;
 
 for(Node u : g.nodes){
  u.State = State.Unvisited;
 }
 
 LinkedList<Node> q = new LinkedList<Node>();
 start.State = State.Visiting;
 q.add(start);
 
 Node u;
 
 while(!q.isEmpty()){
 u = q.returnFirst(); // dequeue
 if(u!=null){
   for(Node v : u.adjacentNodes()){
    if(v.State == State.Unvisited){
     if(v == end) return true;
    else {
      v.State = State.Visiting;
      u.add(v);
    }
   } 
  }
  u.State = State.Visited;
 }
 return false;
 
}
