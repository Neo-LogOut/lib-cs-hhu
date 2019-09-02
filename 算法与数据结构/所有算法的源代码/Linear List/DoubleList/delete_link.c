int delete_link(LinkList llist,PNode p){
	p->llink->rlink = p->rlink;
	p->rlink->llink = p->llink;
	free(p);
}