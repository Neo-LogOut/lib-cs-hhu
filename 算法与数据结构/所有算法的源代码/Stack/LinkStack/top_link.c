DataType top_link(PLinkStack plstack){
	if(pastack->top == NULL)
		printf("Stack is empty!\n");
	else
		return(plstack->top->info);
}
