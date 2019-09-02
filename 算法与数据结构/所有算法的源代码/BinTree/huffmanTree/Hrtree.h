struct HtNode{
    int ww;
    int parent,llink,rlink;
};
struct HtTree{
    int m;
    int root;
    struct HtNode *ht;
};
typedef struct HtTree *PHtTree;