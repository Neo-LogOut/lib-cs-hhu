int insert_link(DoubleList llist,PDoubleNode p,DataType x){
	PDoubleNode q;
	q = (PDoubleNode)malloc(sizeof(struct DoubleNode));
	if(q==NULL){
		printf("Out of space!!!\n");
		return 0;
	}
	else{
		q->info = x;
		q->llink = p;
		q->rlink = p->rlink;
		p->rlink->llink = q;
		p->rlink = q;
	}
	return 1;
}