struct EdgeNode{
    int nodeposition;
    struct EdgeNode *link;
};
struct ChiTreeNode{
    DataType info;
    struct EdgeNode *children;
};
struct ChiTree{
    int MAXNUM;
    int root;
    int n;
    struct ChiTreeNode *nodelist;
};
typedef struct ChiTree *PChiTree;
