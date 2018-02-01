package DiGraph;

public class DiGraphPlayground {

  public static void main (String[] args) {
    exTest();
    }
  
    public static void exTest(){
      DiGraph d = new DiGraph();
//      d.addNode(1, "f");
//      d.addNode(3, "s");
//      d.addNode(7, "t");
//      d.addNode(0, "fo");
//      d.addNode(4, "fi");
//      d.addNode(6, "si");
//      d.addEdge(0, "f", "s", 0, null);
//      d.addEdge(1, "f", "si", 0, null);
//      d.addEdge(2, "s", "t", 0, null);
//      d.addEdge(3, "fo", "fi", 0, null);
//      d.addEdge(4, "fi", "si", 0, null);
//      System.out.println("numEdges: "+d.numEdges());
//      System.out.println("numNodes: "+d.numNodes());
//      printTOPO(d.topoSort());
     
//      d.addNode(3, "d");
//      d.addEdge(1, "b", "c", 0, null);
//      d.addEdge(2, "a", "d", 0, null);
//      d.addEdge(3, "d", "c", 0, null);
//      printTOPO(d.topoSort());
      
      //deleteNode test 3
      d.addNode(1, "a");
      d.addNode(2, "b");
      System.out.println("numNodes: "+d.numNodes());
      d.addEdge(0, "a", "b", 0, null);
      System.out.println("numEdges: "+d.numEdges());
      d.delNode("b");
      System.out.println("numEdges: "+d.numEdges());
      System.out.println("numNodes: "+d.numNodes());
      //finish testing
      
      //topo test 2
//      d.addNode(0, "a");
//      d.addNode(1, "b");
//      d.addNode(2, "c");
//      d.addNode(3, "d");
//      d.addNode(4,"e");
//      d.addNode(5, "f");
//      d.addNode(6, "g");
//      d.addEdge(0, "a", "b",0,null);
//      d.addEdge(1, "a", "c",0,null);
//      d.addEdge(2, "d", "e",0,null);
//      d.addEdge(3, "d", "f",0,null);
//      d.addEdge(4, "f", "g",0,null);
//      d.addEdge(4, "c", "g",0,null);
//      printTOPO(d.topoSort());

    }
    public static void printTOPO(String[] toPrint){
      System.out.print("TOPO Sort: ");
      for (String string : toPrint) {
      System.out.print(string+" ");
    }
      System.out.println();
    }

}