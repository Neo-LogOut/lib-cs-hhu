LinkList createNullList_link(void){
	LinkList llist = (LinkList)malloc(sizeof(struct Node));
	if(llist != NULL) llist->link = NULL;
	else printf("Out of space!\n");
	return llist;
}