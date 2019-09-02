LinkString createNullString_link(void){
	LinkString pst;
	pst = (LinkString)malloc(sizeof(struct StrNode));
	if(pst!=NULL)
		pst->link = NULL;
	else printf("Out of space!\n");
	return pst;
}