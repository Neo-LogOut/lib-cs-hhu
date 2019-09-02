struct DoubleNode;
typedef struct DoubleNode *PDoubleNode;
struct DoubleNode{
	DataType info;
	PDoubleNode llink,rlink;
};
struct DoubleList{
	PDoubleNode head;
	PDoubleNode rear;
};