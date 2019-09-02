PLinkQueue createEmptyQueue_link(void){
    PLinkQueue plqu;
    plqu = (PLinkQueue)malloc(sizeof(struct LinkQueue));
    if(plqu!=NULL){
        plqu->f = NULL;
        plqu->r = NULL;
    }
    else
        printf("Out of space!\n");
    return plqu;
}