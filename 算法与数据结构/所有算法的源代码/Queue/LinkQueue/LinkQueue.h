struct Node;
typedef struct Node *PNode;
struct Node{
    DataType info;
    PNode link;
};
struct LinkQueue
{
    PNode f;
    PNode r;
};
typedef struct LinkQueue *PLinkQueue;
