void deQueue_link(PLinkQueue plqu){
    PNode p;
    if(plqu->r == NULL)
        printf("Empty queue.\n");
    else{
        p = plqu->f;
        plqu->f = p->link;
        free(p);
    }
}