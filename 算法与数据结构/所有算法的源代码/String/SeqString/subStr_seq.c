PSeqString subStr_seq(PSeqString s,int i,int j){
	PSeqString s1;
	int k;
	s1 = createNullStr_seq(j);
	if(s1==NULL)return NULL;
	if(i>0 && i <= s->n && j>0){
		if(s->n < i+j-1)j = s->n-i+1;
		/*若从i开始取不了j个字符，则能取几个就取几个*/
		for(k=0;k<j;k++)
			s1->c[k] = s->c[i+k-1]; /*给字串赋值*/
		s1->n = j;
		}
	return s1;
}