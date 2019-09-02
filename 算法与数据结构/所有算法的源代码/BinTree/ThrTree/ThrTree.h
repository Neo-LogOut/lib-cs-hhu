struct ThrTreeNode;
typedef struct ThrTreeNode *PThrTreeNode;
struct ThrTreeNode}{
    DataType info;
    PThrTreeNode llink,rlink;
    int ltag,rtag;
};
typedef struct ThrTreeNode *ThrTree;
typedef ThrTree *PThrTree;