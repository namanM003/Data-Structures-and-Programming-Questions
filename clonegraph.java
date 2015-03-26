/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    UndirectedGraphNode start=null;
    HashMap<UndirectedGraphNode,UndirectedGraphNode> hm=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        UndirectedGraphNode ugn;
        if(node==null){
            return null;
        }
        if(start==null){
            ugn=new UndirectedGraphNode(node.label);
            start=ugn;
            hm.put(node,ugn);
            for(int i=0;i<node.neighbors.size();i++){
                if(!hm.containsKey(node.neighbors.get(i))){
                    UndirectedGraphNode ug1=new UndirectedGraphNode(node.neighbors.get(i).label);
                    hm.put(node.neighbors.get(i),ug1);
                    ugn.neighbors.add(ug1);
                    cloneGraph(node.neighbors.get(i));
                }
                else{
                    ugn.neighbors.add(hm.get(node.neighbors.get(i)));
                }
            }
        }
        else{
            if(!hm.containsKey(node)){
            ugn=new UndirectedGraphNode(node.label);
            //start=ugn;
            hm.put(node,ugn);
                
            }
            else{
                ugn=hm.get(node);
            }
            for(int i=0;i<node.neighbors.size();i++){
                if(!hm.containsKey(node.neighbors.get(i))){
                    UndirectedGraphNode ug1=new UndirectedGraphNode(node.neighbors.get(i).label);
                    hm.put(node.neighbors.get(i),ug1);
                    ugn.neighbors.add(ug1);
                    cloneGraph(node.neighbors.get(i));
                }
                else{
                    ugn.neighbors.add(hm.get(node.neighbors.get(i)));
                }
        
        }
    }
    return start;
}
}