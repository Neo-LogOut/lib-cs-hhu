package mybean.data;
public class Example7_10_Bean{
   String id ;           //存放考号
   float score;         //存放分数
   String questions;    //存放题目
   int number;         //存放题号
   int textAmount=3 ; //题目数量
   String choiceA,choiceB,choiceC,choiceD;//存放选择
   String image;   //题目的示意图的图像文件名
   String answer;       //存放用户给出的答案
   String correctAnswer; //存放正确答案
   String mess;       //存放提示信息 
   public String getCorrectAnswer() {
      return correctAnswer;
   }
   public void setCorrectAnswer(String s){
      correctAnswer =s;
   }
   public void setId(String s){
      id=s;
   }
   public String getId(){
      return id;
   }
   public void setScore(float s) {
      score = s;
   }
   public float getScore() {
      return score;
   }
   public void setQuestions(String s){
      questions=s;
   }
   public String getQuestions(){
      return questions;
   }
   public void setNumber(int s){
      number=s;
   }
   public int getNumber(){
      return number;
   }
   public void setChoiceA(String s){
      choiceA=s;
   }
   public String getChoiceA(){
      return choiceA;
   }
    public void setChoiceB(String s){
      choiceB=s;
   }
   public String getChoiceB(){
      return choiceB;
   }
    public void setChoiceC(String s){
      choiceC=s;
   }
   public String getChoiceC(){
      return choiceC;
   }
   public void setChoiceD(String s){
      choiceD=s;
   }
   public String getChoiceD(){
      return choiceD;
   }
   public void setImage(String s){
      image=s;
   }
   public String getImage(){
      return image;
   } 
   public void setAnswer(String s){
      answer=s;
   }
   public String getAnswer(){
      return answer;
   } 
   public void setMess(String s){
      mess=s;
   }
   public String getMess(){
      return mess;
   }
   public void setTestAmount(int s){
      textAmount=s;
   }
   public int getTestAmount(){
      return textAmount;
   } 
}
