PlinkStack createEmptyStack_link(void){
	PLinkStack plstack;
	plstack = (PLinkStack)malloc(sizeof(struct LinkStack));
	if(plstack!=NULL)
		plstack->top = NULL;
	else
		printf("Out of space!\n");
	return plstack;
}