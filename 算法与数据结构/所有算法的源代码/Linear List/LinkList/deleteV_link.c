int deleteV_link(LinkList llist,DataType x){
	PNode p,q;
	p = llist;
	if (p == NULL) return 0;
	while(p->link!=NULL && p->link->info!=x)
		p = p->link;
	if (p->link == NULL){
		printf("Not exist!\n");return 0;
	}
	else{
		q = p->link;
		p->link = q->link;
		free(q);return 1;
	}
}
