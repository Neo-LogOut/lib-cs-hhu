struct ParTreeNode{
    DataType info;
    int parent;
};
struct ParTree{
    int MAXNUM;
    int n;
    struct ParTreeNode *nodelist;
};
typedef struct ParTree *PParTree;