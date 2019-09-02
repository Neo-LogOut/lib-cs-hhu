DataType frontQueue_link(PLinkQueue plqu){
    if(plqu->f == NULL) 
        printf("Empty queue.\n");
    else
        return(plqu->f->info);
}