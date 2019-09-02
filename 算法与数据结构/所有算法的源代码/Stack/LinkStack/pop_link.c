void pop_link(PLinkStack plstack){
	PNode p;
	if(isEmptyStack_link(plstack))
		printf("Empty stack pop.\n");
	else{
		p = plstack->top;
		plstack->top = plstack->top->link;
		free(p);
	} 
}
