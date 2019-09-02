struct EdgeNode;
typedef struct EdgeNode *PEdgeNode;
typedef struct EdgeNode *EdgeList;
struct EdgeNode{
    int ajdVex;
    AdjType weight;
    PEdgeNode nextEdge;
};