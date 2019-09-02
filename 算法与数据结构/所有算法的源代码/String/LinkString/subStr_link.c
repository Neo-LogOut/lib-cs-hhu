LinkString subStr_link(LinkString s,int i,int j){
	LinkString s1;
	PStrNode p,q,t;
	int k;
	s1 = createNullStr_link();
	if(s1==NULL){
		printf("Out of space!\n");
		return NULL;
	}
	if(i<1 || j<1) return s1; /*i,j值不合适，返回空串*/
	p = s;
	for(k=1;k<=i;k++) /*找第i个结点*/
		if(p!=NULL)
			p = p->link;
		else
			return s1;
	if(p==NULL) return s1;
	t = s1;
	for(k=1;k<=j;k++) /*连续取j个字符*/
		if(p!=NULL){
			q = (PStrNode)malloc(sizeof(struct StrNode));
			if(q==NULL){
				printf("Out of space!\n");
				return s1;
			}
			q->c = p->c;
			q->link = NULL;
			t->link = q; /*结点放入子链串中 */
			t = q;
			p = p->link;
		}
	return s1; 
}
