int insertPost_link(LinkList llist,PNode p,DataType x){
	PNode q = (PNode)malloc(sizeof(struct Node));
	if(q==NULL){
		printf("Out of space!!!\n");
		return 0;
	}
	else {
		q->info = x;
		q->link = p->link;
		p->link = q;
		return 1;
	}
}
