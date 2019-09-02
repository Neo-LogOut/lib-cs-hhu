void push_link(PLinkStack plstack,DataType x){
	PNode p;
	p = (PNode)malloc(sizeof(Struct Node));
	if(p == NULL)
		printf("Out of space!\n");
	else{
		p->info = x;
		p->link = plstack->top;
		plstack->top = p;
	}
}