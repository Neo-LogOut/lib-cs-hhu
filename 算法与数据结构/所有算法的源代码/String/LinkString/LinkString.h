struct StrNode;
typedef struct StrNode *PStrNode;
struct StrNode{
	char c;
	PStrNode link;
};
typedef struct StrNode *LinkString;