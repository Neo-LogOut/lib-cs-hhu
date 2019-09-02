PNode locatePre_link(LinkList llist,PNode p){
	PNode p1;
	if(llist = NULL)return NULL;
	p1 = llist;
	while (p1!=NULL && p1->link!=p)p1 = p1->link;
	return p1;
}
