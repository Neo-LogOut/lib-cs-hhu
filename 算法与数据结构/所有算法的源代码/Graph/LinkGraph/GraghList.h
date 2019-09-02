typedef struct{
    VexType vertex;
    EdgeList edgelist;
}VexNode;
typedef struct{
    VexNode vexs[VN];
    int vexNum,arcNum;
}GraphList;
