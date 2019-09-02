struct Node;
typedef struct Node *PNode;
struct Node{
    DataType info;
    PNode link;
};
typedef struct Node *LinkList;