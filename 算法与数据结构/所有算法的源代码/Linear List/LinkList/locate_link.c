PNode locate_link(LinkList llist,DataType x){
	PNode p;
	if (llist == NULL)return NULL;
	p = llist->link;
	while (p!=NULL && P->info != x) p = p->link;
	return p;
}
