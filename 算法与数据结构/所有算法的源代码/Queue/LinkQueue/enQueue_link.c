void enQueue_link(PLinkQueue plqu,DataType x){
    PNode p;
    p = (PNode)malloc(sizeof(struct Node));
    if(p==NULL)
        printf("Out of space!");
    else{
        p->info = x;
        p->link = NULL;
        if(plqu->f == NULL) 
            plqu->f =p;
        else
            plqu->r->link = p;
        plqu->r =p;
    }
}